import { Book } from './model/book';
import { BookService } from './product-list.component.service';
import { Component, OnInit } from '@angular/core';
import { FiltersComponent } from '../filters/filters.component';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  livros: Array<Book> = [];
  bookService: BookService;
  filterComp!: FiltersComponent;

  constructor(bookService: BookService) { 
    this.bookService = bookService;
  }

  ngOnInit(): void {
   this.getBook();
  }

  getBook(): void{

    this.bookService.getBook().subscribe({
      next: data =>{
        this.livros = data;
        //console.log(this.livros);
      },
      error: err => { console.log(err)}
    })

  }
/*
  /filtro(valorDe: number, valorAte: number){
    let livros: any = [];
    livros = this.bookService.getBook().subscribe({
      next: data =>{
        this.livros = data;
        //console.log(this.livros);
      },
      error: err => { console.log(err)}
    })

    for(var i = 0; i < livros.length; i++){
      console.log("livros", this.livros[1])
      if(livros[i].price > this.filterComp.filterForm.value[1] && livros[i].price < this.filterComp.filterForm.value[2]){
        this.livros = [];
        this.livros = livros[i];
      }
    }
    
  }
  */

}
