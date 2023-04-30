
import Documento from "./Documento";

export default interface Historico {
    id?: number;
    documento?: Documento;
    data: Date;
    mudanca: string;
  }