
import { Component, OnInit } from '@angular/core';

import { alunos } from '../model/alunos';

@Component({
  selector: 'spa-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  
  constructor() { }

  valor: number = 0;
  exibeTabela: boolean = false;

  listaAlunos: alunos[] = [
    {nome:'Camila', idade: 27, email: 'camila.taruma@gmail.com', curso:'Ciencia da computação'},
    {nome:'Teste1', idade: 24, email: 'Teste1@gmail.com', curso:'Análiza'},
    {nome:'Teste2', idade: 31, email: 'Teste2@gmail.com', curso:'Engenharia'},
    {nome:'Teste3', idade: 45, email: 'Teste3@gmail.com', curso:'Física'}
  ];

  displayedColumns: string[] = ['Nome', 'Idade', 'E-mail', 'Curso'];

  ngOnInit(): void {
    this.valor = 5;
  }

  mudarValor(){
    this.valor++;
  }
  reiniciarValor(){
    this.valor = 0;
  }

  exibirTabela(){
    this.exibeTabela = true;
  }

}
