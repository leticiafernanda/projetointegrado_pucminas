import { Proprietario } from "./proprietario.class";

export class Animal {
    id!: number;
    nome!: string;
    raca!: string;
    especie!: string;
    pelagem!: string;
    proprietario!: Array<Proprietario>;
    peso!: string;
    idade!: number;
    genero!: string;
  }
