import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(public router: Router) { }

  ngOnInit(): void {
  }
  handleClickVisualizarConsulta(){
    this.router.navigate([`/visualizar-consulta`])
  }
  handleClickCadastrarAnimal(){
    this.router.navigate([`/animal/cadastrar-animal`])

  }
}
