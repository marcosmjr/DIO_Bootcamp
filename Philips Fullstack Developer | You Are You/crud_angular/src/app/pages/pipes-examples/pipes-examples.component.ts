
import { UpperCasePipe } from '@angular/common';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-pipes-examples',
  templateUrl: './pipes-examples.component.html',
  styleUrls: ['./pipes-examples.component.css']
})
export class PipesExamplesComponent implements OnInit {

  number = 0;
  text = 'Hello World!';
 text1 = 'Usando o pipe uppercase no JavaScript!';
 text2 = 'Usando o pipe lowercase!';
 text3 = 'usando o pipe titlecase!';
 date = Date.now();
 date1 = new Date;
 pessoa = {
   nome: 'Marcos',
   idade: '44',
   profisão: 'Programador',
 }
 nomes = ['Marcos'];


  constructor(private upperCasePipe: UpperCasePipe) {
   }

  ngOnInit(): void {
    this.text1 = this.upperCasePipe.transform(this.text1)
  }

  mudaValor(){
    this.text = 'novo texto';
  }
add(text: string){
  this.nomes.push(text);
}

}
