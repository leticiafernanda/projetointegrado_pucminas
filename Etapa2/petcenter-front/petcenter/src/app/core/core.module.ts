import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";



import { RouterModule } from "@angular/router";
import { NavbarComponent } from "./navbar/navbar.component";
import { MaterialModule } from "../material.module";
import { NavbarMenuComponent } from "./navbar-menu/navbar-menu.component";

@NgModule({
  declarations: [NavbarComponent,NavbarMenuComponent],
  imports: [CommonModule, MaterialModule,RouterModule ],
  exports: [NavbarComponent,NavbarMenuComponent ]
})
export class CoreModule {}
