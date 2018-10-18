import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './Components/login-page/login-page.component';
import { AppRoutingModule } from './app-routing.module';
import {  routes } from './app-routing.module';
import { HomeComponent } from './Components/home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { PromoAppComponent } from './Components/promo-app/promo-app.component';
import { ApplicationComponent } from './Components/application/application.component';
import { AppStatusComponent } from './Components/app-status/app-status.component';
import { RequestsComponent } from './Components/requests/requests.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { SubmittedComponent } from './Components/submitted/submitted.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    HomeComponent,
    PromoAppComponent,
    ApplicationComponent,
    AppStatusComponent,
    RequestsComponent,
    SubmittedComponent
  ],
  imports: [
    HttpClientModule,
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    RouterModule.forRoot(
      routes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
