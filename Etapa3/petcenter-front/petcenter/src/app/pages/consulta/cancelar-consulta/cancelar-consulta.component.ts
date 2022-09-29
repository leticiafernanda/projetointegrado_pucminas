import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';
import { ConsultaData } from 'src/app/models/consulta.interface';
import { ConsultaService } from 'src/app/services/consulta.service';

@Component({
  selector: 'app-cancelar-consulta',
  templateUrl: './cancelar-consulta.component.html',
  styleUrls: ['./cancelar-consulta.component.scss']
})
export class CancelarConsultaComponent implements OnInit  {
  displayedColumns: string[] = ['dataConsulta', 'medicoNome', 'pacienteNome', 'proprietarioNome','status', 'icone'];


  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  datasource: any;

  constructor(
    private consultaService: ConsultaService,
    private router: Router
  ) {

  }
  ngOnInit(): void {
    this.getConsulta();
  }

  getConsulta() {
      this.consultaService.getConsulta().subscribe((response: any) => {
        this.datasource = response.filter((e: any) => e.statusConsulta == "Marcado");
        this.datasource.paginator = this.paginator;
      })
  }
  cancelarConsulta(id:any){
    this.consultaService.putConsulta(id)
    .subscribe(()=>{
     // this.dialog.open(ModalSucessoComponent);
     window.location.reload();
    })
  }
}




