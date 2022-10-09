import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UsuarioService } from 'src/app/services/usuario.service';
@Component({
  selector: 'app-deslogar',
  templateUrl: './deslogar.component.html',
  styleUrls: ['./deslogar.component.scss']
})
export class DeslogarComponent implements OnInit {
  constructor(
    private usuarioService: UsuarioService,
    public router: Router
    ) { }
  ngOnInit(): void {
  }
  deslogar(){
    this.usuarioService.deslogar();
    this.router.navigate([`/login`])
  }
}
