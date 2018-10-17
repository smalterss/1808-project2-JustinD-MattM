import { Component, OnInit, Injectable} from '@angular/core';
import { User } from '../../Components/user';
import { LoginService } from '../../Services/login.service';
import { directiveCreate } from '@angular/core/src/render3/instructions';
import { Router } from '@angular/router';
import { routerNgProbeToken } from '@angular/router/src/router_module';

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
      const u = new User(this.emailAddress, this.password, 0);
      this.loginService.postlogin(u).subscribe(authUser => {
        console.log(authUser);
        if (this.emailAddress != null) {
          this.router.navigateByUrl('home');
        }
      });

    }

    constructor(private loginService: LoginService, private router: Router) { }

    ngOnInit() {
    }

}
