import { Proprietario } from "./proprietario.interface";

export interface Animal {
    nome: string;
    raca: string;
    especie: string;
    pelagem: string;
    proprietario: Array<Proprietario>;
    peso: string;
    idade: number;
    genero: string;
  }
