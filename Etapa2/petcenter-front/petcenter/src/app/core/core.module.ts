import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";



import { RouterModule } from "@angular/router";
import { NavbarComponent } from "./navbar/navbar.component";
import { MaterialModule } from "../material.module";

@NgModule({
  declarations: [NavbarComponent],
  imports: [CommonModule, MaterialModule,RouterModule.forChild([])],
  exports: [NavbarComponent ]
})
export class CoreModule {}
