import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { catchError, map, Observable, of } from "rxjs";
import { environment } from "src/environments/environment";
import { Agendamento } from "../class/agendamento.class";

@Injectable({
    providedIn: 'root',
  })
  export class ConsultaService  {
    apiURL = environment.api;
    constructor(private httpClient: HttpClient) {}

    getConsulta(): Observable<any> {
      return this.httpClient.get(this.apiURL +'/v1/consulta').pipe(
        map((body: any) => body),
        catchError(() => of('Error while retrieving consulta.'))
      );
    }
    postAgendamentoConsulta(agendamento: Agendamento): Observable<any>{
      return this.httpClient.post(this.apiURL +`/v1/agendamento`,agendamento);
    }
  }
