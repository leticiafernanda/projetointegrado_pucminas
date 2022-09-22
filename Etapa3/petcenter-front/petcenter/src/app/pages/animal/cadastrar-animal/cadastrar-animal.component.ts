import {  Component, OnInit } from '@angular/core';
import {  FormControl, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';
import { GeneroEnum } from 'src/app/enum/generoEnum';
import { AnimalService } from 'src/app/services/animal.service';
import { AnimalBasic } from '../../../class/animalBasic.class';
import { ModalSucessoComponent } from '../modal-sucesso/modal-sucesso.component';

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
    private animalService: AnimalService,
    public dialog: MatDialog,
    private router: Router) {

  }
  ngOnInit(): void {
    this.createAnimalForm( new AnimalBasic());
    this.getProprietario();

  }

  createAnimalForm(animal: AnimalBasic){
    this.createForm = new FormGroup({
      id:new FormControl(animal.id, [Validators.required]),
      nome: new FormControl(animal.nome, [Validators.required]),
      raca: new FormControl(animal.raca),
      especie: new FormControl(animal.especie),
      pelagem: new FormControl(animal.pelagem),
      peso:new FormControl(animal.peso),
      idade: new FormControl(animal.idade),
      genero: new FormControl(animal.genero, [Validators.required]),
      idCliente: new FormControl(animal.idCliente,[Validators.required]),
    });
  }



  getProprietario(){
    this.animalService.getAnimalList().subscribe((proprietarioAnimalList: Array<any>) => {
      this.proprietarioAnimalList = proprietarioAnimalList.map((e) => {return {nome: e.proprietario.nome, id: e.proprietario.id}})
    })
  }

  create(){
      let createAnimal: AnimalBasic
      createAnimal =  this.buildCreateAnimal()
      this.animalService.postAnimal(createAnimal)
      .subscribe(()=>{
       // this.dialog.open(ModalSucessoComponent);
       this.router.navigate(["/home"]);
      })

  }
  buildCreateAnimal() {
    let createAnimal = new AnimalBasic();
    createAnimal.id = Math.floor(Math.random() * 100) + 1;
    createAnimal.nome= this.createForm.value.nome;
    createAnimal.raca= this.createForm.value.raca;
    createAnimal.especie= this.createForm.value.especie;
    createAnimal.pelagem= this.createForm.value.pelagem;
    createAnimal.idCliente =  this.createForm.value.idCliente;
    createAnimal.peso= this.createForm.value.peso;
    createAnimal.idade= this.createForm.value.idade;
    createAnimal.genero= this.createForm.value.genero;
    return createAnimal;
  }
}









