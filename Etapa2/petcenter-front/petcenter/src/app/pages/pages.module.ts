import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { LoginPageComponent } from "./login/login-page.component";
import { MaterialModule } from "../material.module";
import { HomeComponent } from './home/home.component';
import { CoreModule } from "../core/core.module";
import { RouterModule } from "@angular/router";
import { ConsultaComponent } from './consulta/consulta.component';
import { VisualizarConsultaComponent } from "./consulta/visualizar-consulta/visualizar-consulta.component";


@NgModule({
  declarations: [ LoginPageComponent, HomeComponent, VisualizarConsultaComponent, ConsultaComponent],
  imports: [CommonModule,  FormsModule,MaterialModule,CoreModule,RouterModule.forChild([])],
  exports: [ LoginPageComponent]
})
export class PagesModule {}
