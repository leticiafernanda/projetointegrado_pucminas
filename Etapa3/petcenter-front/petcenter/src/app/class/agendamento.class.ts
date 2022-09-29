import { Time } from "@angular/common";

export class Agendamento {
       id!: number;
       idAnimal!:number;
       idProprietario!: number;
       idMedico!: number;
       data!: Date;
       hora!: Time;
       telefoneCelular!: string;
       telefoneCasa!: string;
       email!: string;
  }
