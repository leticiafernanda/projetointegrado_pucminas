import { Router } from "@angular/router";
import { Component, OnInit, OnDestroy, ChangeDetectorRef } from "@angular/core";

import { Subscription, Observable } from "rxjs";
import { MediaMatcher } from "@angular/cdk/layout";
import { NavItem } from "./nav-item";


@Component({
  selector: "navbar-menu",
  templateUrl: "./navbar-menu.component.html",
  styleUrls: ["./navbar-menu.component.scss"]
})
export class NavbarMenuComponent implements OnInit, OnDestroy {

  menu: NavItem [] = [
    {
      displayName: 'Inicio',
      route: '/home',
    },        
    {
      displayName: 'Animal',
      route: 'animal',
      children: [
        {
          displayName: 'Cadastros ',
          route: ''
        },
        {
          displayName: 'Edição ',
          route: ''
        },
        {
          displayName: 'Exclusão ',
          route: ''
        },
        {
          displayName: 'Ficha',
          route: ''
        },
        {
          displayName: 'Histórico',
          route: ''
        },
      ]
    },
    {
      displayName: 'Consultas',
      children: [
        {
          displayName: 'Agendar',
          route: ''
        },
        { 
          displayName: 'Visualizar',
          route: 'visualizar-consulta'
        },
        { 
          displayName: 'Cancelar',
          route: ''
        }
      ]
    },
    {
      displayName: 'Exames',
      children: [
          {
            displayName: 'Visualizar Exames Autorizados',
            route: ''
          },
          {
            displayName: 'Visualizar Exames a Fazer',
            route: ''
          },
          {
            displayName: 'Buscar Procedimentos',
            route: ''
          }
        ]
      },
      {
        displayName: 'Serviços',
        children: [
            {
              displayName: 'Vacinas',
              route: ''
            }
          ]
        },
        {
          displayName: 'Pagamentos',
          route: '',
        },  
        {
          displayName: 'Locais de Atendimento de Urgência',
          route: '',
        },  
        {
          displayName: 'Sobre o PETCENTER',
          route: '',
        },  
        {
          displayName: 'Sair do Sistema',
          route:  "",
        },  
  ];
mobileQuery: MediaQueryList;


private _mobileQueryListener: () => void;

  constructor(changeDetectorRef: ChangeDetectorRef, media: MediaMatcher) {
    this.mobileQuery = media.matchMedia('(max-width: 600px)');
    this._mobileQueryListener = () => changeDetectorRef.detectChanges();
    
  }

  ngOnInit() {}

  ngOnDestroy() {}

  onCollapse() {}

  logout() { }
}
