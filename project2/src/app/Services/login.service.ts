import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../Types/users';

@Injectable({
    providedIn: 'root'
})
export class UserService {
    readonly url = 'http://localhost:8080/login/';

    constructor(private http: HttpClient) {}

    getUsers() {
        return this.http.get<Array<User>>(this.url);
    }

}
