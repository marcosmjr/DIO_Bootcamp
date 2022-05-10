import { PeopleService } from './shared/services/people.service';
import { OnInit } from '@angular/core';
import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  count = 0;
  nome = "Marcos Moreira junior";
  text = '';
  pessoas: any;
   /*[ {
      firstName: "",
      lastName: "",
      age: ''
    }
  ];*/

  constructor(private peopleService: PeopleService){}

  ngOnInit() {
    this.getPeople();
    let interval = setInterval(() => {
      this.count++;
      if(this.count === 10){
        clearInterval(interval);
      }
    }, 1000)
  }

  public clicou(nome: string): void{
    console.log('Clicou em min', nome);
  }

  getPeople(){
    this.peopleService.getPeople().subscribe(people => {
      this.pessoas = people;
    })
  }
}
