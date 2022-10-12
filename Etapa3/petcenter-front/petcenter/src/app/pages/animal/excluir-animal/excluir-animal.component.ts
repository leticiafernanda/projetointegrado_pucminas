import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { GeneroEnum } from 'src/app/enum/generoEnum';
import { AnimalService } from 'src/app/services/animal.service';

@Component({
  selector: 'app-excluir-animal',
  templateUrl: './excluir-animal.component.html',
  styleUrls: ['./excluir-animal.component.scss']
})
export class ExcluirAnimalComponent implements OnInit  {
  deleteForm!: FormGroup;
    nomeAnimalList!: Array<any>;
    proprietarioAnimalList!: Array<any>;
    generoAnimalList: any[] = [
      { name: GeneroEnum.FEMININO },
      { name: GeneroEnum.MASCULINO },
    ];
  idAnimal!: string;

    constructor(
      private animalService: AnimalService,
      private router: Router,
      private snackBar: MatSnackBar   ) {

    }
    ngOnInit(): void {
      this.createEditForm();
      this.getAnimal();
      this.getProprietario();

    }

    createEditForm(){
      this.deleteForm = new FormGroup({
        id:new FormControl('', [Validators.required]),
        nome: new FormControl('', [Validators.required]),
        raca: new FormControl('', [ Validators.minLength(40)]),
        especie: new FormControl('', [ Validators.minLength(40)]),
        pelagem: new FormControl('', [Validators.minLength(40)]),
        proprietario: new FormControl('', [Validators.required]),
        peso:new FormControl('', [ Validators.minLength(40)]),
        idade: new FormControl('', [ Validators.minLength(40)]),
        genero: new FormControl('', [Validators.required])
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
        this.deleteForm.setValue({
          ...this.deleteForm.value,
          id: response.id,
          nome: response.nome,
          raca: response.raca,
          especie: response.especie,
          pelagem: response.pelagem,
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
      this.build(id_animal);
     }

    delete(){
      this.animalService.deleteAnimal(this.idAnimal).subscribe(()=>{
        this.snackBar.open('Animal excluido com sucesso!', '', {
          horizontalPosition: 'start',
          verticalPosition: 'bottom',
          duration: 3000,
          panelClass: ['mat-toolbar', 'mat-primary']

        });     this.router.navigate(["/home"]);
      })
    }
  }
