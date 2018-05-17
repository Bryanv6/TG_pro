package com.gator.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import webdriver.webdriver;

public class CurriculaVP {

	WebDriver d;
	
	@BeforeTest
	public void beforeTest()
	 {
	     d = webdriver.openApp();
	     webdriver.VPLogin();
	     d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      d.findElement(By.xpath("//li[@name='curricula']")).click();
	
	  }
	

	 /*
	  *  webdriver.trainerLogin();
	  */
	  
	    
	
  @Test (priority = 0)
  public void testCoreSize() throws IOException {
	 //ReportsPage report = new ReportsPage(d);
	 
	   d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/button[1]/md-icon")).click();
	
  }
}
