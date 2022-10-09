import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { ActivatedRoute, Router } from '@angular/router';
import { Usuario } from 'src/app/class/usuario.class';
import { UsuarioService } from 'src/app/services/usuario.service';
import { CadastroLoginDialog } from './cadastro-login/cadastro-login-dialog.component';

@Component({
  selector: "login-page",
  templateUrl: "./login-page.component.html",
  styleUrls: ["./login-page.component.scss"]
})
export class LoginPageComponent implements OnInit {
  formLogin!: FormGroup;

  constructor(
    public router: Router,
    public dialog: MatDialog,
    private usuarioService: UsuarioService,
    private formBuilder: FormBuilder,
    private snackBar: MatSnackBar) { }

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
  openDialog() {
    this.dialog.open(CadastroLoginDialog);
  }
  logar(){
    if(this.formLogin.invalid) return;
    var usuario = this.formLogin.getRawValue() as Usuario;
    this.usuarioService.logar(usuario).subscribe((response) => {
      if(response == null){
        this.snackBar.open('Falha na autenticação. Usuário ou senha incorretos!', '', {
          duration: 9000,
          panelClass: ['mat-toolbar', 'mat-primary']
        });
      }else {
        this.router.navigate(["/home"]);
      }
    })
  }
}
