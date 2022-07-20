import { Injectable } from "@angular/core";
import { of } from "rxjs";

@Injectable({
    providedIn: 'root',
  })
  export class NavBarService {
    getNavBarMenu() {
      return of([
        {
          name: 'Estruturas',          
          route: '/estruturas',
        },
      ]);
    }
  }