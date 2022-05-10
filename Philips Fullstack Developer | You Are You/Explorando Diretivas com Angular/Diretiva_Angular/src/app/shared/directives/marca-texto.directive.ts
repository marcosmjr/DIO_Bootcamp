import { BoundElementProperty } from '@angular/compiler';
import { Directive, ElementRef, Input, OnInit } from '@angular/core';

@Directive({
  selector: '[appMarcaTexto]'
})
export class MarcaTextoDirective implements OnInit{

  @Input() corDeFundo = 'yellow';
  @Input() corDoTexto = '#f15c';

  constructor(private elemento: ElementRef) { }

  ngOnInit(): void {
      this.mudarFundo();
  }

  private mudarFundo(cor: string = 'yellow'){
    this.elemento.nativeElement.style.backgroundColor = this.corDeFundo || cor;
    this.elemento.nativeElement.style.color = this.corDoTexto || cor;
    this.elemento.nativeElement.style.fontWeight = 'bold';
  }
}
