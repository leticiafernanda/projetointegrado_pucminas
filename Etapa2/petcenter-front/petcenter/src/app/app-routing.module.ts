import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VisualizarConsultaComponent } from './pages/visualizar-consulta/visualizar-consulta.component';
import { HomeComponent } from './pages/home/home.component';
import { LoginPageComponent } from './pages/login/login-page.component';

const routes: Routes = [  
{ path: "login", redirectTo: "" },
{ path: "", component: LoginPageComponent },
{ path: "home", component: HomeComponent, data: { title: "Home" } },
{ path: "visualizar-consulta", component: VisualizarConsultaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
