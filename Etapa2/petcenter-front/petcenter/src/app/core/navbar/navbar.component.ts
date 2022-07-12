import { Router } from "@angular/router";
import { Component, OnInit, OnDestroy } from "@angular/core";

import { Subscription, Observable } from "rxjs";


@Component({
  selector: "navbar",
  templateUrl: "./navbar.component.html",
  styleUrls: ["./navbar.component.scss"]
})
export class NavbarComponent implements OnInit, OnDestroy {


  constructor( private router: Router) {}

  ngOnInit() {
 
  
  }

  ngOnDestroy() {
  
  }

  onCollapse() {
   
  }

  logout() {   
    this.router.navigate(["/"]);
  }
}
