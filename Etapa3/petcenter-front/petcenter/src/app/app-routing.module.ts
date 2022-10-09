import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { LoginPageComponent } from './pages/login/login-page.component';
import { ConsultaComponent } from './pages/consulta/consulta.component';
import { CadastrarAnimalComponent } from './pages/animal/cadastrar-animal/cadastrar-animal.component';
import { AnimalComponent } from './pages/animal/animal.component';
import { EditarAnimalComponent } from './pages/animal/editar-animal/editar-animal.component';
import { ExcluirAnimalComponent } from './pages/animal/excluir-animal/excluir-animal.component';
import { AgendarConsultaComponent } from './pages/consulta/agendar-consulta/agendar-consulta.component';
import { CancelarConsultaComponent } from './pages/consulta/cancelar-consulta/cancelar-consulta.component';
import { UsuarioNaoAutenticadoGuard } from './services/guards/usuario-nao-autenticado.guard';
import { UsuarioAutenticadoGuard } from './services/guards/usuario-autenticado.guard';
import { DeslogarComponent} from './pages/deslogar/deslogar.component';

const routes: Routes = [
{ path: "login", redirectTo: "",canActivate: [UsuarioNaoAutenticadoGuard] },
{ path: "", component: LoginPageComponent,canActivate: [UsuarioNaoAutenticadoGuard] },
{ path: "home", component: HomeComponent, data: { title: "Home" },canActivate: [UsuarioAutenticadoGuard] },
{ path: "animal", component: AnimalComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: 'animal/cadastrar-animal', component: CadastrarAnimalComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: 'animal/editar-animal', component: EditarAnimalComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: 'animal/excluir-animal', component: ExcluirAnimalComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: 'consulta/visualizar-consulta', component: ConsultaComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: 'consulta/agendar-consulta', component: AgendarConsultaComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: 'consulta/cancelar-consulta',component: CancelarConsultaComponent,canActivate: [UsuarioAutenticadoGuard]},
{ path: '', component:DeslogarComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
