package test;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.io.File;
import webdriver.loginCukes.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterTest;
@Listeners(TestResultListener.class)
public class BatchesTest {
	

	
	@Test
	public void verifyBatchesLoad() {
		BatchesPage.batchesBtn(webdriver.d).click();
		Assert.assertTrue(webdriver.d.getCurrentUrl().contains("batches"));
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
