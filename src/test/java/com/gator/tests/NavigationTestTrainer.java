package com.gator.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.gator.util.PageLoad;

import webdriver.webdriver;

public class NavigationTestTrainer {
  
	
	static WebDriver d;
	 
	 static void compareLoad(String xpath, String url) {
		 
		 
		 PageLoad.wait(d, 10);
		  
		  d.findElement(By.xpath(xpath)).click();
		
		  PageLoad.wait(d, 10);

		  List<WebElement> buttons = d.findElements(By.tagName("button"));
		  
		  System.out.println("amount of buttons using click "+buttons.size());
		  
		  boolean Visible = false;
		  int k = 0;
		  int amountV = 0;
		  
		  for( k = 0; k<buttons.size(); k++) {
		  Visible = buttons.get(k).isDisplayed();
		  
		  if (Visible) {
			  amountV++;
		  }
		  
		  }
		    
		  System.out.println("amount of visible buttons "+amountV);
		  
		  
//		  ////////////////////////////////////////////////////////////////////////////
		  
		  d.get(url);
		  
		  PageLoad.wait(d, 10);
		  		  
		  List<WebElement> buttons2 = d.findElements(By.tagName("button"));
		  
		  System.out.println("amount of buttons get "+buttons2.size());
		  
		  boolean Visible2 = false;
		  int k2 = 0;
		  int amountV2 = 0;
		  
		  for( k = 0; k<buttons2.size(); k++) {
		  Visible2 = buttons2.get(k).isDisplayed();
		  
		  if (Visible2) {
			  amountV2++;
		  }
		  
		  }
		  
		  
		  
		  
//		 //////////////////////////////////////////////////////////////////////////////
		  System.out.println("amount of visible buttons of get"+amountV2);
		  
		  System.out.println(amountV2 + " visible compared to  "+ amountV);
		  if(amountV2!=amountV) {
			  Assert.assertEquals(false, true);
			  
		  }
		  
		 
	 }
	
 @Test (priority = 0)
 public void getVsclick_Locations(){
     
	 compareLoad("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a/span/span","https://dev.assignforce.revaturelabs.com/locations");
     
 }
 
 @Test (priority = 0)
 public void getVsclick_Batches(){
     
	 compareLoad("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a/span/span","https://dev.assignforce.revaturelabs.com/batches");
     
 }
 
 @Test (priority = 0)
 public void getVsclick_Curricula(){
     
	 compareLoad("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a/span/span","https://dev.assignforce.revaturelabs.com/curriculum");
     
 }
 
 @Test (priority = 0)
 public void getVsclick_Trainers(){
     
	 compareLoad("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a/span/span","https://dev.assignforce.revaturelabs.com/trainers");
     
 }
 
 
 @Test (priority = 0)
 public void getVsclick_Profile(){
     
	 compareLoad("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]/a/span/span","https://dev.assignforce.revaturelabs.com/profile");
     
 }
 
 
 @Test (priority = 0)
 public void getVsclick_Settings(){
     
	 compareLoad("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a/span/span","https://dev.assignforce.revaturelabs.com/settings");
     
 }
 
 
// @Test (priority = 0)
//public void getVsclick_Reports(){
//   
//	 compareLoad("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[7]/a/span/span","https://dev.assignforce.revaturelabs.com/reports");
//   
//}
 
 
 
 @BeforeClass
 public void beforeClass() {
	  d = webdriver.openApp();
     webdriver.trainerLogin();;
 }

 @AfterClass
 public void afterClass() {
 d.close();

}
}
