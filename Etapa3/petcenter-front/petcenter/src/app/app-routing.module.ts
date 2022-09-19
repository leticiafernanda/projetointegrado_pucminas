import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginPageComponent } from './pages/login/login-page.component';
import { ConsultaComponent } from './pages/consulta/consulta.component';

const routes: Routes = [  
{ path: "login", redirectTo: "" },
{ path: "", component: LoginPageComponent },
{ path: "home", component: HomeComponent, data: { title: "Home" } },
{ path: "visualizar-consulta", component: ConsultaComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
