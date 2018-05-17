package com.gator.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gator.pages.BatchesPage;
import com.gator.pages.ProfilePage;

import webdriver.webdriver;

public class ProfileTest {
	
	static 	WebDriver d=webdriver.openApp();
	 ProfilePage pg = new ProfilePage(d);
	 Boolean isElementPresent;
	@Test(priority=0)
	public void login() {
		webdriver.trainerLogin();
	}

	@Test(priority=1)
	public void verifyProfilePageLoad() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pg.profileTab));
		element.click();
		Assert.assertTrue(d.getCurrentUrl().contains("profile"));
	}
	
	@Test(priority=2)
	public void verifyProfileCardLoad() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pg.profile_card));
		isElementPresent = pg.profile_card.isDisplayed();
		Assert.assertTrue(isElementPresent);
		System.out.println(pg.profile_card.getSize().getHeight());
		Assert.assertTrue(d.getCurrentUrl().contains("profile"));
		//154 is initial size of card w/o loading data
		Assert.assertTrue(pg.profile_card.getSize().getHeight()>154);
	/*	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//take screenshot
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));*/
	}
	
	@Test(priority=2)
	public void verifyProfileCard2Load() {
		isElementPresent = pg.profile_card2.isDisplayed();
		Assert.assertTrue(isElementPresent);
		System.out.println(pg.profile_card2.getSize().getHeight());
		Assert.assertTrue(d.getCurrentUrl().contains("profile"));
		Assert.assertTrue(pg.profile_card2.getSize().getHeight()>0);
	}
	@Test(priority=10)
	public void logout() {
		webdriver.logout();
		
	}
	
}
