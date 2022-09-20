import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
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
      { name: GeneroEnum.F },
      { name: GeneroEnum.M },
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
      this.deleteForm = new FormGroup({
        nome: new FormControl('', [Validators.required, Validators.minLength(40)]),
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
        this.nomeAnimalList = nomeAnimalList.map(function(e)
        { return e.nome; } );
      })
    }
    getProprietario(){
      this.animalService.getAnimalList().subscribe((proprietarioAnimalList: Array<any>) => {
        this.proprietarioAnimalList = proprietarioAnimalList.map(function(e)
        { return e.proprietario.nome; } );
      })
    }

    submit(){}
  }



