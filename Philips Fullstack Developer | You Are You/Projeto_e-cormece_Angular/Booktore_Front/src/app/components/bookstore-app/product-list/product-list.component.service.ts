import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from "@angular/core";
import { Book } from './model/book';

@Injectable()

export class BookService{
    
    private url = 'https://api.steinhq.com/v1/storages/628fc3d84906bb05374816b0/página1'

    httpOptions = {
        Heraders: new HttpHeaders({'content-type':'application/json'})
    }

    constructor(private http: HttpClient){}


    getBook():Observable<Book[]>{
        return this.http.get<Book[]>(this.url)
    }

}