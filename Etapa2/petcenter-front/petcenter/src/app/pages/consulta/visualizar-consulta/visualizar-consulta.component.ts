import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { ConsultaData } from 'src/app/models/consulta.interface';
import { ConsultaService } from 'src/app/services/consulta.service';

@Component({
  selector: 'app-visualizar-consulta',
  templateUrl: './visualizar-consulta.component.html',
  styleUrls: ['./visualizar-consulta.component.scss']
})
export class VisualizarConsultaComponent implements OnInit  {
  displayedColumns: string[] = ['dataConsulta', 'medicoNome', 'pacienteNome', 'proprietarioNome','status'];
  

  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  @ViewChild(MatSort)
  sort!: MatSort;
  datasource: any;

  constructor(
    private consultaService: ConsultaService    
  ) {
    
  }
  ngOnInit(): void {
    this.getConsulta();
  }

  getConsulta() {  
      this.consultaService.getConsulta().subscribe((response: any) => {   
        this.datasource = response; 
        this.datasource = new MatTableDataSource(response);
        this.datasource.paginator = this.paginator;
        this.datasource.sort = this.sort;
      })
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.datasource.filter = filterValue.trim().toLowerCase();
    if (this.datasource.paginator) {
      this.datasource.paginator.firstPage();
    }
  }
}




