import { Component, OnInit } from "@angular/core";
import { FormControl, FormGroup, Validators } from "@angular/forms";
import { MatSnackBar } from "@angular/material/snack-bar";
import { Login } from "src/app/class/login";
import { TipoEnum } from "src/app/enum/tipoEnum";
import { UsuarioService } from "src/app/services/usuario.service";

@Component({
  selector: 'cadastro-login-dialog',
  templateUrl: 'cadastro-login-dialog.html',
  styleUrls: ['./cadastro-login.scss']

})
export class CadastroLoginDialog implements OnInit {
  createDialogForm!: FormGroup;
  tipoUsuarioList: any[] = [
    { idTipo: 0, name: TipoEnum.ADM },
    { idTipo: 1, name: TipoEnum.CLIENTE },
    { idTipo: 2,  name: TipoEnum.FUNCIONARIO },
    { idTipo: 3, name: TipoEnum.RH }

  ];

  constructor(
    private usuarioService: UsuarioService,
    private snackBar: MatSnackBar) { }

  ngOnInit(): void {
    this.createLoginForm( new Login());
  }
  createLoginForm(login: Login){
    this.createDialogForm = new FormGroup({
      id:new FormControl(login.id, [Validators.required]),
      email: new FormControl(login.email, [Validators.required]),
      senha: new FormControl(login.senha, [Validators.required]),
      tipo: new FormControl(login.tipo,[Validators.required]),
    });
  }
  createdLogin(){
    let createLogin: Login
    createLogin =  this.buildCreateLogin()
    this.usuarioService.registro(createLogin)
    .subscribe(()=>{
      this.snackBar.open('Salvo com sucesso!', '', {
        horizontalPosition: 'start',
        verticalPosition: 'bottom',
        duration: 3000,
        panelClass: ['mat-toolbar', 'mat-primary']
      });
    })

}
buildCreateLogin() {
  let createLogin = new Login();
  createLogin.id = Math.floor(Math.random() * 100) + 1;
  createLogin.email= this.createDialogForm.value.email;
  createLogin.senha= this.createDialogForm.value.senha;
  createLogin.tipo = this.createDialogForm.value.tipo;
  return createLogin;
}
}
