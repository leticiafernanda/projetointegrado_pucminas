import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { LoginPageComponent } from "./login/login-page.component";
import { MatCardModule } from "@angular/material/card";
import { MaterialModule } from "../material.module";


@NgModule({
  declarations: [ LoginPageComponent],
  imports: [CommonModule,  FormsModule,MaterialModule],
  exports: [ LoginPageComponent]
})
export class PagesModule {}
