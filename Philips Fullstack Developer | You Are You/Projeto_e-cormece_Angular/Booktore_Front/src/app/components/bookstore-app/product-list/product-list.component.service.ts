import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Book } from './model/book';

@Injectable()

export class BookService{
    private url = 'https://sheet.best/api/sheets/b1ea3124-1edd-4c9c-856d-841bd93bf784'

    httpOptions = {
        Heraders: new HttpHeaders({'content-type':'application/json'})
    }

    constructor(private http: HttpClient){}


    getBook(){
        return this.http.get(this.url)
    }
}