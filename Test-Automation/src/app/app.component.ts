import { Component } from '@angular/core';
import { TestService } from './test.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Test Automation';
  webAppURL ='Web App URL';
  constructor(private testService: TestService){}
  setUrl()
  {
    this.testService.setUrl(this.webAppURL);
  }
    
}
