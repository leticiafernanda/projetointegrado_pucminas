import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginPageComponent } from './pages/login/login-page.component';
import { ConsultaComponent } from './pages/consulta/consulta.component';
import {CadastrarAnimalComponent} from './pages/animal/cadastrar-animal/cadastrar-animal.component';
import { AnimalComponent } from './pages/animal/animal.component';
import{EdicaoAnimalComponent} from './pages/animal/edicao-animal/edicao-animal.component';

const routes: Routes = [
{ path: "login", redirectTo: "" },
{ path: "", component: LoginPageComponent },
{ path: "home", component: HomeComponent, data: { title: "Home" } },
{ path: "visualizar-consulta", component: ConsultaComponent},
{ path: "animal", component: AnimalComponent},
{ path: 'animal/cadastrar-animal', component: CadastrarAnimalComponent},
{ path: 'animal/edicao-animal', component: EdicaoAnimalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
