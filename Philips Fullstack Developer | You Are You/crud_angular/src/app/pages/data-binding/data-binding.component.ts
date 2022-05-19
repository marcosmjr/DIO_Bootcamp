import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent implements OnInit {

  text = 'Marco Moreira';
  imageUrl = 'https://picsum.photos/300/300';
  imageDesc = 'Essa é uma imagem';


  buttonText = 'Clique aqui';
  textRed = false;
  bgColor = 'green';
  fontSize = '20px';
  widthImg = 300;
  textInput = '';
  number = 0;
  destroi = false;


  constructor() { }

  ngOnInit(): void {
  }

  retornaNome(): string{
    return this.text;
  }

  clicou(value: string){
    this.text = "Mudei o texto em um clique"
    this.textRed = true;
    console.log('Clicou aqui', value);
  }

  clicouNoFilho(text: string){
    console.log(text);
  }

  incrementa(){
    this.number++
    console.log(this.number);
  }

  destroiComponent(){
    this.destroi = true;
  }
}
