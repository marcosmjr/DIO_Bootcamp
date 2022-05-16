import { UserService } from './../../../services/user.service';
import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user';

@Component({
  selector: 'app-users-list',
  templateUrl: './users-list.component.html',
  styleUrls: ['./users-list.component.css']
})
export class UsersListComponent implements OnInit {

  users: Array<User> = []

  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.getUsers();
  }

  getUsers(): void {
    this.userService.getUsers().subscribe({
      next: response =>{
      this.users = response;
      },
  
    error: err => {
      console.log('ERRO AO EXECUTAR', err)
     }

   })
  }

  deleteUser(id: number): void {
    this.userService.deleteUser(id).subscribe({

      next: response => {
      console.log('Usuário Excluido');
      },

      error: err => {
        console.log(err)
      },

      complete: () => {
        this.getUsers();
      } 

    })
  }

}
