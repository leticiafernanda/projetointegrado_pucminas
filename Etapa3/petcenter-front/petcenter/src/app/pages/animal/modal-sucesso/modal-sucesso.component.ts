import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


export class ModalSucessoComponent {

  constructor( private router: Router) {}

  closeDialog(){
    this.router.navigate(["/home"]);
  }
}
