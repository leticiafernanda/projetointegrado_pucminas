import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
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

  constructor(
    private animalService: AnimalService  ) {

  }
  ngOnInit(): void {
    this.createEditForm();
    this.getAnimal();
    this.getProprietario();

  }

  createEditForm(){
    this.editForm = new FormGroup({
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
      this.editForm.setValue({
        ...this.editForm.value,
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
    this.build(id_animal)
   }

  submit(){}
}




