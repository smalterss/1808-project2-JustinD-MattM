import { Component, OnInit } from '@angular/core';
import { User } from '../../Types/users';
import { UserService } from '../../Services/login.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

    users: Array<User>;

    getUsers() {
      // this.userService.getUsers().subscribe(
      //   data => this.users = data
      // );
    }

    constructor(/*private userService: UserService*/) { }

    ngOnInit() {
    }

}
