import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MaterialModule } from './material.module';
import { CoreModule } from './core/core.module';
import { PagesModule } from './pages/pages.module';
import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { NgHttpLoaderModule } from 'ng-http-loader';
import { MAT_DATE_LOCALE } from '@angular/material/core';
import { UsuarioNaoAutenticadoGuard } from './services/guards/usuario-nao-autenticado.guard';
import { UsuarioAutenticadoGuard } from './services/guards/usuario-autenticado.guard';


@NgModule({
  declarations: [
    AppComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    CoreModule,
    MaterialModule,
    PagesModule,
    MatCardModule,
    HttpClientModule,
    NgHttpLoaderModule.forRoot()
  ],
  providers: [{ provide: MAT_DATE_LOCALE, useValue: 'pt-BR' },UsuarioNaoAutenticadoGuard,UsuarioAutenticadoGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
