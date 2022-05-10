import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PeopleService {

  constructor() { }

  getPeople(): Observable<any> {
    let peopleArray  = [
      {
        firstName: "Ivonaldo",
        lastName: "Soares",
        age: '26'
      },
      {
        firstName: "Marcio",
        lastName: "Santos",
        age: '28'
      },
      {
        firstName: "Maria",
        lastName: "Silva",
        age: '32'
      },
      {
        firstName: "João",
        lastName: "Pereira",
        age: '48'
      }
    ]

    return of(peopleArray)
  }
}
