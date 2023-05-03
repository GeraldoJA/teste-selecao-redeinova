import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {Historico} from "../../models";
import {ApiService} from "../../api/api.service";


@Component({
  templateUrl: './historico.component.html',
  styleUrls: ['./historico.component.sass']
})
export class HistoricoComponent implements OnInit {

  historico: Historico[] = [];

  constructor(
    private route: ActivatedRoute,
    private api: ApiService) {
  }

  async ngOnInit() {
    this.listar();
  }

  listar(): void {
    this.route.paramMap.subscribe(async next => {
      console.log('entrou listar');
      let docId = parseInt(<string>next.get("docId"));    
      this.historico = await this.api.getHistorico(docId);
    });
  }


}
