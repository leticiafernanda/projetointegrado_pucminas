import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: "login-page",
  templateUrl: "./login-page.component.html",
  styleUrls: ["./login-page.component.scss"]
})
export class LoginPageComponent implements OnInit {

  constructor( public router: Router) { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  isFieldInvalid(field: string) {}
  onSubmit() {}
  handleClick(){
    this.router.navigate([`/home`])
  }
}
