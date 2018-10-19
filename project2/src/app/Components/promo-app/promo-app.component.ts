import { Component, OnInit } from '@angular/core';
import { directiveCreate } from '@angular/core/src/render3/instructions';
import { Router } from '@angular/router';
import { routerNgProbeToken } from '@angular/router/src/router_module';
import { PromoAppService } from '../../Services/promoapp.service';
import { App } from '../apps';

@Component({
  selector: 'app-promo-app',
  templateUrl: './promo-app.component.html',
  styleUrls: ['./promo-app.component.css']
})
export class PromoAppComponent implements OnInit {

  apps: Array<App>;
  emailAddress: '';
  job: '';
  justification: '';
  getApps() {
    this.loginService.getApps().subscribe(data => this.apps = data);
  }
  postApp(): void {
    const promoapp = new App(this.emailAddress, this.job, this.justification);
    console.log(promoapp);
    this.loginService.postApp(promoapp).subscribe(promoApp => {
      console.log(promoApp);
      this.router.navigateByUrl('home');
    });

  }
  constructor(private loginService: PromoAppService, private router: Router) { }

  ngOnInit() {
  }

}
