import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  tipoUsuario : any;
  constructor(public router: Router,
    private usuarioService: UsuarioService) { }

  ngOnInit(): void {
     this.tipoUsuario = this.usuarioService.resp;
  }
  handleClickVisualizarConsulta(){
    this.router.navigate([`/visualizar-consulta`])
  }
  handleClickCadastrarAnimal(){
    this.router.navigate([`/animal/cadastrar-animal`])

  }
}
