import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSnackBar } from '@angular/material/snack-bar';
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
    private snackBar: MatSnackBar
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
      this.snackBar.open('Consulta cancelada com sucesso!', '', {
        horizontalPosition: 'start',
        verticalPosition: 'bottom',
        duration: 3000,
        panelClass: ['mat-toolbar', 'mat-primary']
      });
     window.location.reload();
    })
  }
}




