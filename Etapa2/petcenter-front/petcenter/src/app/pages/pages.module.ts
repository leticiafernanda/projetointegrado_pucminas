import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { LoginPageComponent } from "./login/login-page.component";
import { MaterialModule } from "../material.module";
import { HomeComponent } from './home/home.component';
import { CoreModule } from "../core/core.module";
import { RouterModule } from "@angular/router";
import { ConsultaComponent } from './visualizar-consulta/visualizar-consulta.component';


@NgModule({
  declarations: [ LoginPageComponent, HomeComponent, ConsultaComponent],
  imports: [CommonModule,  FormsModule,MaterialModule,CoreModule],
  exports: [ LoginPageComponent]
})
export class PagesModule {}
