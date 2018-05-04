import { Component } from '@angular/core';
import { TestService } from './test.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Test Automation';
  webAppURL ='https://dev.assignforce.revaturelabs.com/home';
  testResult = this.getResult();
  constructor(private testService: TestService){}
  setWebAppURL(paramURL: string)
  {
    //hardcoded webAppURL for now
    this.testService.setParamURL(this.webAppURL);
  }

  getResult()
  {
    this.testService.getData();
  }
    
}
