import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(public router: Router,
    private usuarioService: UsuarioService) { }

  ngOnInit(): void {
  }
  handleClickVisualizarConsulta(){
    this.router.navigate([`/visualizar-consulta`])
  }
  handleClickCadastrarAnimal(){
    this.router.navigate([`/animal/cadastrar-animal`])

  }
}
