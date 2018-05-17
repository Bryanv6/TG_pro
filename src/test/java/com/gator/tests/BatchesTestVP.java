package com.gator.tests;
import org.testng.annotations.Test;
import com.gator.pages.BatchesPage;
import com.gator.pages.BatchesPageVP;

import org.testng.annotations.Listeners;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver.webdriver;

@Listeners(TestResultListener.class)

public class BatchesTestVP {

	static WebDriver d = webdriver.openApp();
	BatchesPageVP batches = new BatchesPageVP(d);
	Boolean isElementPresent;

	@Test(priority = 0)
	public void vplogin() {
		webdriver.VPLogin();
	}

	@Test(priority = 1)
	public void verifyBatchesPageLoad() {
		WebDriverWait wait = new WebDriverWait(d, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.batchesButton));
		// BatchesPage.batchesBtn(d).click();
		element.click();
		Assert.assertTrue(d.getCurrentUrl().contains("batches"));
	}

	// @Ignore
	@Test(priority = 2)
	public void verifyFormLoad() {
		isElementPresent = batches.batchForm.isDisplayed();
		Assert.assertTrue(isElementPresent);
	}

	// @Ignore
	@Test(priority = 2)
	public void verifyTimelineLoad() {
		isElementPresent = batches.batch_timeline.isDisplayed();
		Assert.assertTrue(isElementPresent);
	}

	@Test(priority=3)
	public void verifyCreateBatchFalse()
	{
		//Select dropCurr = new Select(batches.dropCurriculum);
		String url=d.getCurrentUrl();
		batches.dropCurriculum.click();
		//Assert.assertTrue(batches.dropCurriculum.isSelected());
		//batches.optionInDropDown.click();
		batches.createBatchBtn.click();
		Assert.assertTrue(url.equals(d.getCurrentUrl()));
	}
	// @Ignore
	@Test(priority = 10)
	public void vplogout() {
		//webdriver.logout();
		d.findElement(By.name("logout")).click();
		d.close();

	}

}