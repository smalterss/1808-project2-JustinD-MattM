import { Component, OnInit } from '@angular/core';
import { User } from '../../Components/user';
import { CreateAccountService } from '../../Services/createaccount.service';
import { directiveCreate } from '@angular/core/src/render3/instructions';
import { Router } from '@angular/router';
import { routerNgProbeToken } from '@angular/router/src/router_module';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {

  constructor(private loginService: CreateAccountService, private router: Router) { }

  ngOnInit() {
  }

}
