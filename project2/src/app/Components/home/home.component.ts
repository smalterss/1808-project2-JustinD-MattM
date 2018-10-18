import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { Router } from '@angular/router';
import { routerNgProbeToken } from '@angular/router/src/router_module';
import { LoginService } from '../../Services/login.service';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  user: User;
getAppStat() {
  this.router.navigateByUrl('app-status');
}
getPromo() {
  this.router.navigateByUrl('promo-app');
}

  constructor(private loginService: LoginService, private router: Router) {
   }

  ngOnInit() {
  }

}
