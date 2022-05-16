import { User } from './../models/user';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  apiUrl = 'https://sheet.best/api/sheets/ab5f09c9-ed9c-4eb3-8245-007f685a3b46';
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      //'Token': '123456789'
    })
  }
  constructor(private httpClient: HttpClient) { }

  //C.R.U.D. - CREAT, READ, UPDATE, DELETE

// Retorna a lista de usuário
  getUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(this.apiUrl);
  }
  

  // Salva usuário no banco CREATE
  postUser(user: User): Observable<User>{
  return this.httpClient.post<User>(this.apiUrl, user, this.httpOptions)
  }

// Exclui o usuário do banco
deleteUser(id: number): Observable<User>{
  return this.httpClient.delete<User>(`${this.apiUrl}/id/${id}` )
}

}
