import { Component, OnInit } from '@angular/core';

@Component({
  selector: "login-page",
  templateUrl: "./login-page.component.html",
  styleUrls: ["./login-page.component.scss"]
})
export class LoginPageComponent implements OnInit {

  constructor() { }
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }
  isFieldInvalid(field: string) {}
  onSubmit() {}
 
}
