import {  Component, OnInit } from '@angular/core';
import { AnimalService } from 'src/app/services/animal.service';

@Component({
  selector: 'app-cadastrar-animal',
  templateUrl: './cadastrar-animal.component.html',
  styleUrls: ['./cadastrar-animal.component.scss']
})
export class CadastrarAnimalComponent implements OnInit  {
  constructor(
    private animalService: AnimalService
  ) {

  }
  ngOnInit(): void {
  }
  submit(){}
}




