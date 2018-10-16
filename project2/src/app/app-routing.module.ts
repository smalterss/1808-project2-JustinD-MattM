import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginPageComponent } from './Components/login-page/login-page.component';
import { HomeComponent } from './Components/home/home.component';
import { AppStatusComponent } from './Components/app-status/app-status.component';
import { PromoAppComponent } from './Components/promo-app/promo-app.component';
import { ApplicationComponent } from './Components/application/application.component';
import { RequestsComponent } from './Components/requests/requests.component';

export const routes: Routes = [
  { path: '', redirectTo: '/login', pathMatch: 'full' },
  { path: 'login', component: LoginPageComponent },
  { path: 'home', component: HomeComponent },
  { path: 'promo-app', component: AppStatusComponent},
  { path: 'application', component: PromoAppComponent},
  { path: 'requests', component: ApplicationComponent},
  { path: 'app-status', component: RequestsComponent}
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})
export class AppRoutingModule {}
