import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../Components/user';
import { Observable, of } from 'rxjs';

const httpOptions = {
    headers: new HttpHeaders ({
        'Content-Type': 'application/json'
    })
};

@Injectable({
    providedIn: 'root'
})
export class CreateAccountService {
    url = 'http://localhost:8081/PAMS/login';

    constructor(private http: HttpClient) {}

    getUsers() {
        return this.http.get<Array<User>>(this.url);
    }
    postlogin (user: User): Observable<string> {
        return this.http.post<string>(this.url, user, httpOptions);
    }
}
