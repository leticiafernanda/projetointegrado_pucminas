import { Component, OnInit } from '@angular/core';
import { AnimalService } from 'src/app/services/animal.service';

@Component({
  selector: 'app-excluir-animal',
  templateUrl: './excluir-animal.component.html',
  styleUrls: ['./excluir-animal.component.scss']
})
export class ExcluirAnimalComponent implements OnInit  {

  constructor(
    private animalService: AnimalService
  ) {

  }
  ngOnInit(): void {
  }
  submit(){}
}




