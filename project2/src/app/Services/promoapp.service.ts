import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { App } from '../Components/apps';
import { Observable, of } from 'rxjs';

const httpOptions = {
    headers: new HttpHeaders ({
        'Content-Type': 'application/json'
    })
};

@Injectable({
    providedIn: 'root'
})
export class PromoAppService {
    url = 'http://localhost:8081/PAMS/promo-app';

    constructor(private http: HttpClient) {}

    getApps() {
        return this.http.get<Array<App>>(this.url);
    }
    postApp (app: App): Observable<string> {
        return this.http.post<string>(this.url, app, httpOptions);
    }
}
