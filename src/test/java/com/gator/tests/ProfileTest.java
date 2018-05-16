package com.gator.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gator.pages.BatchesPage;
import com.gator.pages.ProfilePagePOM;

import webdriver.webdriver;

public class ProfileTest {
	
	static 	WebDriver d=webdriver.openApp();
	 ProfilePagePOM pg = new ProfilePagePOM();
	 Boolean isElementPresent;
	@Test(priority=0)
	public void login() {
		webdriver.VPLogin();
	}

	@Test(priority=1)
	public void verifyProfilePageLoad() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		isElementPresent = pg.profileTab.isDisplayed();
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(pg.profileTab));
		if(isElementPresent) element.click();
		Assert.assertTrue(d.getCurrentUrl().contains("profile"));
	}
	
	@Test(priority=10)
	public void logout() {
		webdriver.logout();
		
	}
	
}
