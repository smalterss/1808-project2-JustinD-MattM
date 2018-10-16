import { Component, OnInit, Injectable} from '@angular/core';
import { User } from '../../Components/user';
import { LoginService } from '../../Services/login.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

    users: Array<User>;
    emailAddress: '';
    password: '';
    user: User;
    getUsers() {
      this.loginService.getUsers().subscribe(data => this.users = data);
    }

    postLogin(): void {
      console.log(this.emailAddress + ' ' + this.password);
      const u = new User(this.emailAddress, this.password, 0);
      console.log(u);
      this.loginService.postlogin(u).subscribe();
    }

    constructor(private loginService: LoginService) { }

    ngOnInit() {
    }

}
