import {  Component, OnInit } from '@angular/core';
import {   FormGroup } from '@angular/forms';
import { MatDialog } from '@angular/material/dialog';
import { Router } from '@angular/router';

@Component({
  selector: 'app-agendar-consulta',
  templateUrl: './agendar-consulta.component.html',
  styleUrls: ['./agendar-consulta.component.scss']
})
export class AgendarConsultaComponent implements OnInit  {
  toScheduleForm!: FormGroup;

  constructor(
    public dialog: MatDialog,
    private router: Router) {

  }
  ngOnInit(): void {


  }

}









