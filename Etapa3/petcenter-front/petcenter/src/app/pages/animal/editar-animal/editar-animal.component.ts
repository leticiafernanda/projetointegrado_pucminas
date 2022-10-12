import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { AnimalBasic } from 'src/app/class/animalBasic.class';
import { GeneroEnum } from 'src/app/enum/generoEnum';
import { AnimalService } from 'src/app/services/animal.service';

@Component({
  selector: 'app-editar-animal',
  templateUrl: './editar-animal.component.html',
  styleUrls: ['./editar-animal.component.scss']
})
export class EditarAnimalComponent implements OnInit  {
  editForm!: FormGroup;
  nomeAnimalList!: Array<any>;
  proprietarioAnimalList!: Array<any>;
  generoAnimalList: any[] = [
    { name: GeneroEnum.FEMININO },
    { name: GeneroEnum.MASCULINO },
  ];
  idAnimal: any;

  constructor(
    private animalService: AnimalService,
    private router: Router,
    private snackBar: MatSnackBar  ) {

  }
  ngOnInit(): void {
    this.createEditForm(new AnimalBasic());
    this.getAnimal();
    this.getProprietario();

  }

  createEditForm(animal: AnimalBasic){
    this.editForm = new FormGroup({
      id:new FormControl(animal.id, [Validators.required]),
      nome: new FormControl(animal.nome, [Validators.required]),
      raca: new FormControl(animal.raca),
      especie: new FormControl(animal.especie),
      pelagem: new FormControl(animal.pelagem),
      idCliente: new FormControl(animal.idCliente,[Validators.required]),
      peso:new FormControl(animal.peso),
      idade: new FormControl(animal.idade),
      genero: new FormControl(animal.genero, [Validators.required])
    });
  }
  getAnimal(){
    this.animalService.getAnimalList().subscribe((nomeAnimalList: Array<any>) => {
      this.nomeAnimalList = nomeAnimalList.map((e) => {return {nome: e.nome, id: e.id}} )
  });
}
  getProprietario(){
    this.animalService.getAnimalList().subscribe((proprietarioAnimalList: Array<any>) => {
      this.proprietarioAnimalList = proprietarioAnimalList.map((e) => {return {nome: e.proprietario.nome, id: e.proprietario.id}})
    })
  }
  build(id_animal: string) {
    this.animalService.getAnimal(id_animal).subscribe((response) => {
      this.editForm.setValue({
        ...this.editForm.value,
        id: response.id,
        nome: response.nome,
        raca: response.raca,
        especie: response.especie,
        pelagem: response.pelagem,
        idCliente: response.proprietario.id,
        proprietario: response.proprietario.nome,
        peso: response.peso,
        idade: response.idade,
        genero: response.genero
        })
      });
    }

   handleChange(event: any){
    const id_animal = event.value;
    this.idAnimal = event.value;
    this.build(id_animal)
   }

  submit(){
    let editAnimal: AnimalBasic
    editAnimal =  this.buildEditAnimal()
    this.animalService.putAnimal( this.idAnimal,editAnimal)
    .subscribe(()=>{
      this.snackBar.open('Animal editado com sucesso!', '', {
        horizontalPosition: 'start',
        verticalPosition: 'bottom',
        duration: 3000,
        panelClass: ['mat-toolbar', 'mat-primary']

      });     this.router.navigate(["/home"]);
    })
  }
  buildEditAnimal() {
    let editAnimal = new AnimalBasic();
    editAnimal.id = Math.floor(Math.random() * 100) + 1;
    editAnimal.nome= this.editForm.controls['nome'].value;
    editAnimal.raca= this.editForm.controls['raca'].value;
    editAnimal.especie= this.editForm.controls['especie'].value;
    editAnimal.pelagem= this.editForm.controls['pelagem'].value;
    editAnimal.idCliente =  this.editForm.controls['idCliente'].value;
    editAnimal.peso= this.editForm.controls['peso'].value;
    editAnimal.idade= this.editForm.controls['idade'].value;
    editAnimal.genero= this.editForm.controls['genero'].value;
    return editAnimal;
  }

}




