import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginPageComponent } from './pages/login/login-page.component';
import { ConsultaComponent } from './pages/consulta/consulta.component';
import {CadastrarAnimalComponent} from './pages/animal/cadastrar-animal/cadastrar-animal.component';
import { AnimalComponent } from './pages/animal/animal.component';
import{EditarAnimalComponent} from './pages/animal/editar-animal/editar-animal.component';
import {ExcluirAnimalComponent} from './pages/animal/excluir-animal/excluir-animal.component';
import {AgendarConsultaComponent} from './pages/consulta/agendar-consulta/agendar-consulta.component';

const routes: Routes = [
{ path: "login", redirectTo: "" },
{ path: "", component: LoginPageComponent },
{ path: "home", component: HomeComponent, data: { title: "Home" } },
{ path: "animal", component: AnimalComponent},
{ path: 'animal/cadastrar-animal', component: CadastrarAnimalComponent},
{ path: 'animal/editar-animal', component: EditarAnimalComponent},
{ path: 'animal/excluir-animal', component: ExcluirAnimalComponent},
{ path: 'consulta/visualizar-consulta', component: ConsultaComponent},
{ path: 'consulta/agendar-consulta', component: AgendarConsultaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
