import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { catchError, map, Observable, of } from "rxjs";
import { environment } from "src/environments/environment";
import { Agendamento } from "../class/agendamento.class";

@Injectable({
    providedIn: 'root',
  })
  export class MedicoService  {
    apiURL = environment.api;
    constructor(private httpClient: HttpClient) {}

    getMedico(): Observable<any> {
      return this.httpClient.get(this.apiURL +'/v1/medico').pipe(
        map((body: any) => body),
        catchError(() => of('Error while retrieving medico.'))
      );
    }

  }
