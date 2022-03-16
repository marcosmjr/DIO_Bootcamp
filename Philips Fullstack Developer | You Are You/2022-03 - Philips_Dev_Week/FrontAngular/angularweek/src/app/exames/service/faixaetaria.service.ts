import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Faixaetaria } from '../model/faixaetaria';


@Injectable({
  providedIn: 'root'
})
export class FaixaetariaService {

  constructor(
    private http:HttpClient
  ) { }

  listFaixaEstaria(): Observable<Faixaetaria[]>{
    const url = "/api/faixaetaria"
    return this.http.get<Faixaetaria[]>(url);
  }
}
