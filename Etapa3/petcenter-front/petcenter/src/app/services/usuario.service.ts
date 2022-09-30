import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { BehaviorSubject, Observable, of } from 'rxjs';
import { map, tap } from 'rxjs/operators';
import { environment } from 'src/environments/environment';
import { Usuario } from '../class/usuario.class';


@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  apiURL = environment.api;

constructor(private httpClient: HttpClient,
            private router: Router) {  }

            logar(usuario: Usuario) : Observable<any> {
              return this.httpClient.post<any>(this.apiURL + '/v1/usuario', usuario).pipe(
                tap((resposta) => {
                  if(!resposta.sucesso) return;
                  localStorage.setItem('usuario', btoa(JSON.stringify(resposta['usuario'])));
                  this.router.navigate(['']);
                }));
            }
            deslogar() {
              localStorage.clear();
              this.router.navigate(['login']);
          }

          get logado(): boolean {
            return localStorage.getItem('token') ? true : false;
          }

}
