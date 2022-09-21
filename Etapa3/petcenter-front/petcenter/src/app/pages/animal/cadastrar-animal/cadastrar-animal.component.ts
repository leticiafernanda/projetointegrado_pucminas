import {  Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { GeneroEnum } from 'src/app/enum/generoEnum';
import { AnimalService } from 'src/app/services/animal.service';
import { Animal } from '../class/animal.class';

@Component({
  selector: 'app-cadastrar-animal',
  templateUrl: './cadastrar-animal.component.html',
  styleUrls: ['./cadastrar-animal.component.scss']
})
export class CadastrarAnimalComponent implements OnInit  {
  createForm!: FormGroup;
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
    this.createAnimalForm( new Animal());
    this.getProprietario();

  }

  createAnimalForm(animal: Animal){
    this.createForm = new FormGroup({
      id:new FormControl(animal.id, [Validators.required]),
      nome: new FormControl(animal.nome, [Validators.required]),
      raca: new FormControl(animal.raca),
      especie: new FormControl(animal.especie),
      pelagem: new FormControl(animal.pelagem),
      proprietario: new FormControl(animal.proprietario),
      peso:new FormControl(animal.peso),
      idade: new FormControl(animal.idade),
      genero: new FormControl(animal.genero, [Validators.required])
    });
  }

  getProprietario(){
    this.animalService.getAnimalList().subscribe((proprietarioAnimalList: Array<any>) => {
      this.proprietarioAnimalList = proprietarioAnimalList.map((e) => {return {nome: e.proprietario.nome, id: e.proprietario.id}})
    })
  }

  create(){

      let createAnimal: Animal
      createAnimal =  this.buildCreateAnimal()
      console.log(createAnimal)
      this.animalService.postAnimal(createAnimal)
      .subscribe(()=>{})

  }
  buildCreateAnimal() {
    let createAnimal = new Animal();
    createAnimal.id = Math.floor(Date.now() * Math.random()).toString(36);
    createAnimal.nome= this.createForm.value.nome;
    createAnimal.raca= this.createForm.value.raca;
    createAnimal.especie= this.createForm.value.especie;
    createAnimal.pelagem= this.createForm.value.pelagem;
    createAnimal.proprietario = this.createForm.value.proprietario.id;
    createAnimal.peso= this.createForm.value.peso;
    createAnimal.idade= this.createForm.value.idade;
    createAnimal.genero= this.createForm.value.genero;
    return createAnimal;
  }
}









