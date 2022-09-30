import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Usuario } from 'src/app/class/usuario.class';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: "login-page",
  templateUrl: "./login-page.component.html",
  styleUrls: ["./login-page.component.scss"]
})
export class LoginPageComponent implements OnInit {
  formLogin!: FormGroup;
  snackBar: any;

  constructor(
    public router: Router,
    private route: ActivatedRoute,
    private usuarioService: UsuarioService,
    private formBuilder: FormBuilder) { }
  ngOnInit(): void {
    this.criarForm()
    }

    criarForm(){
      this.formLogin = this.formBuilder.group({
        email: ['', [Validators.required, Validators.email]],
        senha: ['', [Validators.required]]
      });
    }

  isFieldInvalid(field: string) {}
  onSubmit() {}
  handleClick(){
    this.router.navigate([`/home`])
  }
  logar(){
    if(this.formLogin.invalid) return;
    var usuario = this.formLogin.getRawValue() as Usuario;
    this.usuarioService.logar(usuario).subscribe((response) => {
        if(!response.sucesso){
          this.snackBar.open('Falha na autenticação', 'Usuário ou senha incorretos.', {
            duration: 3000
          });
        }
    })
  }
}
