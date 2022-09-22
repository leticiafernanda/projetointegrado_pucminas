import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { catchError, map, Observable, of } from "rxjs";
import { environment } from "src/environments/environment";
import { Animal } from "../models/animal.interface";
import { AnimalBasic } from "../class/animalBasic.class";

@Injectable({
    providedIn: 'root',
  })
  export class AnimalService  {
    apiURL = environment.api;
    constructor(private httpClient: HttpClient) {}

    getAnimalList(): Observable<any> {
      return this.httpClient.get(this.apiURL +'/v1/animal').pipe(
        map((body: any) => body),
        catchError(() => of('Error while retrieving animal.'))
      );
    }
    getAnimal(id_animal: string): Observable<any> {
      return this.httpClient.get(this.apiURL +`/v1/animal/${id_animal}`).pipe(
        map((body: any) => body),
        catchError(() => of('Error while retrieving animal.'))
      );
    }
    postAnimal(animal: AnimalBasic): Observable<any>{
      return this.httpClient.post(this.apiURL +`/v1/animal`,animal);
    }
    putAnimal(id_animal: string,animal: Animal): Observable<any>{
      return this.httpClient.post(this.apiURL +`/v1/animal/${id_animal}`,animal);
    }
    deleteAnimal(id_animal: string): Observable<any>{
      return  this.httpClient.delete(this.apiURL +`/v1/animal/${id_animal}`);
    }
  }
