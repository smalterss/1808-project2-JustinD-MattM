export class User {
    emailAddress: string;
    password: string;
    id: number;
    status: 'employee';

    constructor(emailAddress: string, password: string, id: number) {
        this.emailAddress = emailAddress;
        this.password = password;
        this.id = id;
            }
}
