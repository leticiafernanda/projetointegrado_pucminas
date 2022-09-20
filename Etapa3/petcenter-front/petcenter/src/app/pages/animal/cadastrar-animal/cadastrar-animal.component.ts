import { AfterViewInit, Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { ConsultaData } from 'src/app/models/consulta.interface';
import { ConsultaService } from 'src/app/services/consulta.service';

@Component({
  selector: 'app-cadastrar-animal',
  templateUrl: './cadastrar-animal.component.html',
  styleUrls: ['./cadastrar-animal.component.scss']
})
export class CadastrarAnimalComponent implements OnInit  {

  constructor(
    private consultaService: ConsultaService
  ) {

  }
  ngOnInit(): void {
  }
  submit(){}
}




