import { Component, OnInit, OnDestroy, ChangeDetectorRef, Input } from "@angular/core";
import { MediaMatcher } from "@angular/cdk/layout";
import { NavItem } from "./nav-item";
import { UsuarioService } from "src/app/services/usuario.service";


@Component({
  selector: "navbar-menu",
  templateUrl: "./navbar-menu.component.html",
  styleUrls: ["./navbar-menu.component.scss"]
})
export class NavbarMenuComponent implements OnInit, OnDestroy {
  @Input()
  status!: string;

  menu: NavItem [] = [
    {
      displayName: 'Inicio',
      route: '/home',
    },
    {
      displayName: 'Animal',
      children: [
        {
          displayName: 'Cadastros ',
          route: '/animal/cadastrar-animal'
        },
        {
          displayName: 'Edição ',
          route: '/animal/editar-animal'
        },
        {
          displayName: 'Exclusão ',
          route: '/animal/excluir-animal'
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
          route: '/consulta/agendar-consulta'
        },
        {
          displayName: 'Histórico de Consultas',
          route: '/consulta/visualizar-consulta'
        },
        {
          displayName: 'Cancelar',
          route: '/consulta/cancelar-consulta'
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
          route:  '/login',
        },
  ];

  menuCliente: NavItem [] = [

  ];

  menuFuncionario: NavItem [] = [
    {
      displayName: 'Inicio',
      route: '/home',
    },
    {
      displayName: 'Animal',
      children: [
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
          route: '/consulta/agendar-consulta'
        },
        {
          displayName: 'Cancelar',
          route: '/consulta/cancelar-consulta'
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

        ]
      },

        {
          displayName: 'Sobre o PETCENTER',
          route: '',
        },
        {
          displayName: 'Sair do Sistema',
          route:  '/login',
        },
  ];


mobileQuery: MediaQueryList;


private _mobileQueryListener: () => void;

  constructor(changeDetectorRef: ChangeDetectorRef, media: MediaMatcher,private usuarioService: UsuarioService) {
    this.mobileQuery = media.matchMedia('(max-width: 600px)');
    this._mobileQueryListener = () => changeDetectorRef.detectChanges();

  }

  ngOnInit(): any  {
    if (this.status == "ADM"){
      return this.menu;
     }
    if (this.status == "CLIENTE"){
     return this.menuCliente;
    }
    if (this.status == "FUNCIONARIO" || this.status == "RH"){
      return this.menuFuncionario;
     }
  }

  ngOnDestroy() {}

  onCollapse() {}

  logout() { }
}
