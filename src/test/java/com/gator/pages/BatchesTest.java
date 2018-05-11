package com.gator.pages;
import org.testng.annotations.Test;
import com.gator.pages.BatchesPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.File;
import webdriver.loginCukes.*;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterTest;

@Listeners(TestResultListener.class)
public class BatchesTest {
	 BatchesPage batches = new BatchesPage(webdriver.d); 

	
	@Test
	public void verifyPageLoad() {
		BatchesPage.batchesBtn(webdriver.d).click();
		Assert.assertTrue(webdriver.d.getCurrentUrl().contains("batches"));
		
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
	
	@BeforeTest
	public void beforeTest() {
		 webdriver.openApp("dummy");
		 webdriver.trainerLogin();
		
	}

	@AfterTest
	public void afterTest() {
		
	}
	


}
