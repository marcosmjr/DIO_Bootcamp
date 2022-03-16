import { Component, OnInit } from '@angular/core';
import { Faixaetaria } from '../model/faixaetaria';
import { Ocorrencia } from '../model/ocorrencia';
import { Regiao } from '../model/regiao';
import { FaixaetariaService } from '../service/faixaetaria.service';
import { OcorrenciaService } from '../service/ocorrencia.service';
import { RegiaoService } from '../service/regiao.service';

@Component({
  selector: 'app-exames',
  templateUrl: './exames.component.html',
  styleUrls: ['./exames.component.css']
})
export class ExamesComponent implements OnInit {

  regioes: Regiao[] = [];
  ocorrencia_exames: Ocorrencia[] = [];
  faixaetarias: Faixaetaria[] = [];

  constructor(
    private regiaoService: RegiaoService,
    private ocorrenciaServe: OcorrenciaService,
    private faixaEtariaService: FaixaetariaService
    ) { }

  ngOnInit(): void {
    this.regiaoService.listRegioes().subscribe(regioes => {this.regioes = regioes});
    this.ocorrenciaServe.listOcorrencias().subscribe(ocorrencia_exames => {this.ocorrencia_exames = ocorrencia_exames});
    this.faixaEtariaService.listFaixaEstaria().subscribe(faixaetarias => {this.faixaetarias = faixaetarias});
  }

}
