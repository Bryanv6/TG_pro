package com.gator.tests;

import org.testng.annotations.Test;

import com.gator.pages.ReportsPage;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import webdriver.webdriver;


public class ReportsTest {
	
	static WebDriver d = webdriver.openApp();

	
  @Test (priority = 1)
  public void trainee_table_validInputs() {	
		ReportsPage reports = new ReportsPage(d); 
		String x ="hooked on a feeling";
		x = reports.trainee_table.getText();	
		boolean contain_NaN = x.contains("NaN");	
		Assert.assertFalse(contain_NaN);	
  }
  
  @Test (priority = 0)
  public void trainee_table_Expands() {
		
		ReportsPage reports = new ReportsPage(d); 			
		Dimension before = reports.trainee_card.getSize();
		reports.trainee_card.click();
		Dimension after = reports.trainee_card.getSize();
		boolean passed = false;
		
		if(before.getHeight()<after.getHeight()) {
			passed = true;
		}
		
		Assert.assertTrue(passed);

  }
  
  @Test (priority = 0)
  public void batch_table_Expands() {
	  
	  	ReportsPage reports = new ReportsPage(d); 			
		Dimension before = reports.batch_card.getSize();
		reports.batch_card.click();
		Dimension after = reports.batch_card.getSize();
		boolean passed = false;
		
		if(before.getHeight()<after.getHeight()) {
			passed = true;
		}
		
		Assert.assertTrue(passed);
	  
	  
	  
  }
  
  @Test (priority = 0)
  public void graduate_table_Expands() {
	  
	  ReportsPage reports = new ReportsPage(d); 			
		Dimension before = reports.graduate_card.getSize();
		reports.graduate_card.click();
		Dimension after = reports.graduate_card.getSize();
		boolean passed = false;
		
		if(before.getHeight()<after.getHeight()) {
			passed = true;
		}
		
		Assert.assertTrue(passed);

  }
  
  @Test (priority = 0)
  public void navigate_To_Reports() {
	  assertEquals(d.getCurrentUrl(),"https://dev.assignforce.revaturelabs.com/reports");

  }
  
  @BeforeClass
  public void beforeClass() {

	  webdriver.trainerLogin();	
	  webdriver.goTo_Reports();
	  System.out.println("before class");
	 
	  
  }

  @AfterClass
  public void afterClass() {
	  d.close();
	  System.out.println("after class");
  }
  

}
