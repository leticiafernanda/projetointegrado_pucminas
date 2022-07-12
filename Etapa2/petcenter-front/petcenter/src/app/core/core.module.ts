import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";



import { RouterModule } from "@angular/router";
import { NavbarComponent } from "./navbar/navbar.component";
import { MatToolbarModule } from "@angular/material/toolbar";

@NgModule({
  declarations: [NavbarComponent],
  imports: [CommonModule, MatToolbarModule,RouterModule.forChild([])],
  exports: [NavbarComponent ]
})
export class CoreModule {}
