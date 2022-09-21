import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { GeneroEnum } from 'src/app/enum/generoEnum';
import { AnimalService } from 'src/app/services/animal.service';
import { Animal } from '../class/animal.class';

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
    private animalService: AnimalService  ) {

  }
  ngOnInit(): void {
    this.createEditForm(new Animal());
    this.getAnimal();
    this.getProprietario();

  }

  createEditForm(animal: Animal){
    this.editForm = new FormGroup({
      id:new FormControl(animal.id, [Validators.required]),
      nome: new FormControl(animal.nome, [Validators.required]),
      raca: new FormControl(animal.raca),
      especie: new FormControl(animal.especie),
      pelagem: new FormControl(animal.pelagem),
      proprietario: new FormControl(animal.proprietario.id),
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
    if(this.editForm.valid){
    }
  }

}




