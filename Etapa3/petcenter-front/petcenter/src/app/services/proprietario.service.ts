import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { catchError, map, Observable, of } from "rxjs";
import { environment } from "src/environments/environment";
import { Proprietario } from "../models/proprietario.interface";

@Injectable({
    providedIn: 'root',
  })
  export class ProprietarioService  {
    apiURL = environment.api;
    constructor(private httpClient: HttpClient) {}

    getProprietarioList(): Observable<any> {
      return this.httpClient.get(this.apiURL +'/v1/cliente').pipe(
        map((body: any) => body),
        catchError(() => of('Error while retrieving cliente.'))
      );
    }
    getProprietario(id_cliente: string): Observable<any> {
      return this.httpClient.get(this.apiURL +`/v1/cliente/${id_cliente}`).pipe(
        map((body: any) => body),
        catchError(() => of('Error while retrieving cliente.'))
      );
    }
    postProprietario(id_cliente: string,cliente: Proprietario): Observable<any>{
      return this.httpClient.post(this.apiURL +`/v1/cliente/${id_cliente}`,cliente);
    }
    putProprietario(id_cliente: string,cliente: Proprietario): Observable<any>{
      return this.httpClient.post(this.apiURL +`/v1/cliente/${id_cliente}`,cliente);
    }
    deleteProprietario(id_cliente: string): Observable<any>{
      return  this.httpClient.delete(this.apiURL +`/v1/cliente/${id_cliente}`);
    }
  }
