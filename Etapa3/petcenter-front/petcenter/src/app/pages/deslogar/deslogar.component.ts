import { Component, OnInit } from '@angular/core';
import { UsuarioService } from 'src/app/services/usuario.service';
@Component({
  selector: 'app-deslogar',
  templateUrl: './deslogar.component.html',
  styleUrls: ['./deslogar.component.scss']
})
export class DeslogarComponent implements OnInit {
  constructor(private usuarioService: UsuarioService) { }
  ngOnInit(): void {
  }
  deslogar(){
    this.usuarioService.deslogar();
  }
}
