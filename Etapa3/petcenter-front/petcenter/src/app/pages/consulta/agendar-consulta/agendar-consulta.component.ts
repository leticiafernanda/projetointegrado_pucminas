import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { Agendamento } from 'src/app/class/agendamento.class';
import { AnimalService } from 'src/app/services/animal.service';
import { ClienteService } from 'src/app/services/cliente.service';
import { ConsultaService } from 'src/app/services/consulta.service';
import { MedicoService } from 'src/app/services/medico.service';

@Component({
  selector: 'app-agendar-consulta',
  templateUrl: './agendar-consulta.component.html',
  styleUrls: ['./agendar-consulta.component.scss']
})
export class AgendarConsultaComponent implements OnInit {
  scheduleForm!: FormGroup;
  nomeAnimalList!: Array<any>;
  proprietarioAnimalList!: Array<any>;
  medicoList!: Array<any>;


  constructor(
    private animalService: AnimalService,
    private medicoService: MedicoService,
    private clienteService: ClienteService,
    private consultaService: ConsultaService,
    private router: Router,
    private snackBar: MatSnackBar  ) {

  }

  ngOnInit(): void {
    this.createScheduleForm(new Agendamento());
    this.getAnimal();
    this.getProprietario();
    this.getMedico();
  }
  getAnimal(){
    this.animalService.getAnimalList().subscribe((nomeAnimalList: Array<any>) => {
      this.nomeAnimalList = nomeAnimalList.map((e) => {return {nome: e.nome, id: e.id}} )
  });
}
getProprietario(){
  this.clienteService.getCliente().subscribe((proprietarioAnimalList: Array<any>) => {
    this.proprietarioAnimalList = proprietarioAnimalList.map((e) => {return {nome: e.nome, id: e.id}})
  })
}
getMedico(){
  this.medicoService.getMedico().subscribe((medicoList: Array<any>) => {
    this.medicoList = medicoList.map((e) => {return {nome: e.nome, id: e.id}} )
});
}
  createScheduleForm(agendamento: Agendamento) {
    this.scheduleForm = new FormGroup({
      id:new FormControl(agendamento.id, [Validators.required]),
      idAnimal: new FormControl(agendamento.idAnimal),
      idProprietario: new FormControl(agendamento.idProprietario, [Validators.required]),
      idMedico: new FormControl(agendamento.idMedico, [Validators.required]),
      data: new FormControl(agendamento.data, [Validators.required]),
      hora: new FormControl(agendamento.hora, [Validators.required]),
      telefoneCelular: new FormControl(agendamento.telefoneCelular),
      telefoneCasa: new FormControl(agendamento.telefoneCasa),
      email: new FormControl(agendamento.email),

    });
  }
  agendamento(){
    let agendamento: Agendamento
    agendamento =  this.buildAgendamento()
    this.consultaService.postAgendamentoConsulta(agendamento)
    .subscribe(()=>{
      this.snackBar.open('Agendamento salvo com sucesso!', '', {
        horizontalPosition: 'start',
        verticalPosition: 'bottom',
        duration: 3000,
        panelClass: ['mat-toolbar', 'mat-primary']
      });
     this.router.navigate(["/home"]);
    })

}
buildAgendamento() {
  let agendamento = new Agendamento();
  agendamento.id = Math.floor(Math.random() * 100) + 1;
  agendamento.idAnimal = this.scheduleForm.value.idAnimal;
  agendamento.idProprietario = this.scheduleForm.value.idProprietario;
  agendamento.idMedico = this.scheduleForm.value.idMedico;
  agendamento.data = this.scheduleForm.value.data;
  agendamento.hora = this.scheduleForm.value.hora;
  agendamento.telefoneCelular = this.scheduleForm.value.telefoneCelular;
  agendamento.telefoneCasa = this.scheduleForm.value.telefoneCasa;
  agendamento.email = this.scheduleForm.value.email;
  return agendamento;
}

}
