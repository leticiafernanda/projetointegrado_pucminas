import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { FormsModule, ReactiveFormsModule } from "@angular/forms";
import { LoginPageComponent } from "./login/login-page.component";
import { MaterialModule } from "../material.module";
import { HomeComponent } from './home/home.component';
import { CoreModule } from "../core/core.module";
import { RouterModule } from "@angular/router";
import { ConsultaComponent } from './consulta/consulta.component';
import { VisualizarConsultaComponent } from "./consulta/visualizar-consulta/visualizar-consulta.component";
import { CadastrarAnimalComponent } from "./animal/cadastrar-animal/cadastrar-animal.component";
import { AnimalComponent } from "./animal/animal.component";
import { EditarAnimalComponent } from "./animal/editar-animal/editar-animal.component";
import { ExcluirAnimalComponent } from "./animal/excluir-animal/excluir-animal.component";
import { MatFormFieldModule } from "@angular/material/form-field";
import { ModalSucessoComponent } from "./animal/modal-sucesso/modal-sucesso.component";
import { MatDialogModule } from "@angular/material/dialog";


@NgModule({
  declarations: [
    LoginPageComponent,
    HomeComponent,
    VisualizarConsultaComponent,
    ConsultaComponent,
    CadastrarAnimalComponent,
    AnimalComponent,
    EditarAnimalComponent,
    ExcluirAnimalComponent,
    ],
  imports: [
    CommonModule,
    FormsModule,
    MaterialModule,
    CoreModule,
    RouterModule.forChild([]),
    ReactiveFormsModule,
    MatFormFieldModule,
    MatDialogModule],
  exports: [
    LoginPageComponent,
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatDialogModule]
})
export class PagesModule {}
