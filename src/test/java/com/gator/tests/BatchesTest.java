package com.gator.tests;
import org.testng.annotations.Test;

import com.gator.pages.BatchesPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import webdriver.DriverSingleton;
import org.openqa.selenium.WebDriver;
@Listeners(TestResultListener.class)
public class BatchesTest {
	static 	WebDriver d=DriverSingleton.getDriver();
	 BatchesPage batches = new BatchesPage(d); 
	 
	
	@Test
	public void verifyPageLoad() {
		BatchesPage.batchesBtn(d).click();
		Assert.assertTrue(d.getCurrentUrl().contains("batches"));
		
	}
	
	@Test
	public void verifyTableLoad() {
		
		Dimension before = batches.batch_card.getSize();
		batches.batch_card.click();
		Dimension after = batches.batch_card.getSize();
		Assert.assertTrue(before.getHeight()<after.getHeight());	
	}
	
	@Test
	public void verifyTimelineLoad() {
		Dimension dim = batches.batch_timeline.getSize();
		Assert.assertTrue(dim.getHeight()>0);
	}
	
	@Test
	public void verifyDateSort() {
		
		
	}


	
	


}
