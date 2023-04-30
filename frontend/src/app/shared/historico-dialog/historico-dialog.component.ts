import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {Historico} from "../../models";

@Component({
  selector: 'app-historico-dialog',
  templateUrl: './historico-dialog.component.html',
  styleUrls: ['./historico-dialog.component.sass']
})
export class HistoricoDialogComponent implements OnInit {

  historico: Historico[];
  displayedColumns: string[] = ['id','mudanca','data'];

  constructor(
    public dialogRef: MatDialogRef<HistoricoDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Array<Historico>) {
    this.historico = data;
  }

  ngOnInit(): void {
    this.historico = this.data;  //acho que a linha é inútil
  }

}
