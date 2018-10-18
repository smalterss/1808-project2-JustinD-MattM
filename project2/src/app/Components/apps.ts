export class App {
    emailAddress: string;
    jobposition: string;
    justification: string;
    status: 'employee';

    constructor(emailAddress: string, jobposition: string, justification: string) {
        this.emailAddress = emailAddress;
        this.jobposition = jobposition;
        this.justification = justification;
            }
}
