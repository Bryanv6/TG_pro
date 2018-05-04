import { Injectable } from '@angular/core';
import { Http, HttpModule } from '@angular/http';
import 'rxjs/add/operator/map';

@Injectable()
export class TestService
{
    constructor(private http: Http){}
    private apiURL="/TG_Servlet";
    private paramURL="https://dev.assignforce.revaturelabs.com/home";
    data: any;
  /*getTestResults method takes url as param, 
  passes it to $http.getmethod and maps response back as json object*/
    getTestResults(apiURL)
    {
      this.data = this.http.get(this.apiURL).
      map(
        (response) => response.json()
      );
    }

    //set webappURL param if desired
    setUrl(webAppURL: string)
    {
      this.paramURL=webAppURL;
    }

    getData()
    {
      return this.data;
    }

}