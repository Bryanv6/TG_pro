package com.gator.tests;

import org.testng.annotations.Test;
import com.gator.pages.BatchesPage;
import org.testng.annotations.Listeners;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver.webdriver;


@Listeners(TestResultListener.class)

public class BatchesTest {

	static 	WebDriver d=webdriver.openApp();
	 BatchesPage batches = new BatchesPage(d); 
	 Boolean isElementPresent;
	@Test(priority=0)
	public void login() {
		webdriver.trainerLogin();
	}

	@Test(priority=1)
	public void verifyBatchesPageLoad() {
		WebDriverWait wait = new WebDriverWait(d, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.batchesButton));
		//BatchesPage.batchesBtn(d).click();
		element.click();
		Assert.assertTrue(d.getCurrentUrl().contains("batches"));

	}

	

//	@Ignore
	@Test(priority=2)
	public void verifyTableLoad() {
		isElementPresent = batches.batch_card.isDisplayed();
		Assert.assertTrue(isElementPresent);	
	}
//	@Ignore
	@Test(priority=2)
	public void verifyTimelineLoad() {
		isElementPresent = batches.batch_timeline.isDisplayed();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyLocationSort() {
		WebDriverWait wait = new WebDriverWait(d, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.location));
		isElementPresent = batches.location.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyNameSort() {
		WebDriverWait wait = new WebDriverWait(d, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.name));
		isElementPresent = batches.name.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyCurriculumSort() {
		WebDriverWait wait = new WebDriverWait(d, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.curriculum));
		isElementPresent = batches.curriculum.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyBuildingSort() {
		WebDriverWait wait = new WebDriverWait(d, 5);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.building));
		isElementPresent = batches.location.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyFocusSort()
	{
		WebDriverWait wait = new WebDriverWait(d, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.focus));
		isElementPresent = batches.focus.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyTrainerSort()
	{
		WebDriverWait wait = new WebDriverWait(d, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.trainer));
		isElementPresent = batches.trainer.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=3)
	public void verifyRoomSort()
	{
		WebDriverWait wait = new WebDriverWait(d, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.room));
		isElementPresent = batches.room.isDisplayed();
		element.click();
		Assert.assertTrue(isElementPresent);
	}
	
	@Test(priority=4)
	public void assertTableSizeLargerThanZero()
	{
		//actual row count 72, real row count =144, only odd number rows have value
		int rowCount = BatchesPage.tableRows(d).size();
		System.out.println("rowCount:"+rowCount);
		Assert.assertTrue(rowCount>0);
		
		
	}
//	@Ignore
	@Test(priority=3)
	public void verifyStartDateSort() {
		//WebDriverWait wait = new WebDriverWait(d, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.startDate));
		isElementPresent = batches.startDate1.isDisplayed();
	//	batches.startDate.click();
		Assert.assertTrue(isElementPresent);
		SimpleDateFormat formatter  = new SimpleDateFormat("MMM. DD, YYYY");
		Date date2;
		Date date1;
		if(isElementPresent) 
		{
		try {
			batches.startDate.click();
			date2 = formatter.parse(batches.startDate2.getText());
			date1 = formatter.parse(batches.startDate1.getText());
			//System.out.println(date2.before(date1));
			System.out.println(date1);
			System.out.println(date2);
			Assert.assertTrue(date1.before(date2)); //date1 is before date 2; date1 is first row
			batches.startDate.click();
			date2 = formatter.parse(batches.startDate2.getText());
			date1 = formatter.parse(batches.startDate1.getText());
			Assert.assertTrue(date1.compareTo(date2)>0);
		} catch (ParseException e) {	e.printStackTrace();}
		}
		
		//date2 is last row
		
	}

	
	@Test(priority=3)
	public void verifyStartDateArrowSort() {
		//WebDriverWait wait = new WebDriverWait(d, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.startDateArrow));
		isElementPresent = batches.startDateArrow.isDisplayed();
	//	batches.startDateArrow.click();
		//not displayed initially
		Assert.assertFalse(isElementPresent);
		SimpleDateFormat formatter  = new SimpleDateFormat("MMM. DD, YYYY");
		Date date2;
		Date date1;
		if(isElementPresent) 
		{
		try {
			batches.startDateArrow.click();
			date2 = formatter.parse(batches.startDate2.getText());
			date1 = formatter.parse(batches.startDate1.getText());
			System.out.println(date2.before(date1));
			System.out.println(date1);
			System.out.println(date2);
			Assert.assertTrue(date1.before(date2)); //date1 is before date 2; date1 is first row
			batches.startDateArrow.click();
			date2 = formatter.parse(batches.startDate2.getText());
			date1 = formatter.parse(batches.startDate1.getText());
			Assert.assertTrue(date1.compareTo(date2)>0);
		} catch (ParseException e) {	e.printStackTrace();}
		}
		//date2 is last row
		

	}

	
	@Test(priority=3)
	public void verifyEndDateSort() {
		//WebDriverWait wait = new WebDriverWait(d, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.endDate));
		isElementPresent = batches.endDate.isDisplayed();
	//	batches.endDate.click();
		Assert.assertTrue(isElementPresent);
		SimpleDateFormat formatter  = new SimpleDateFormat("MMM. DD, YYYY");
		Date date2;
		Date date1;
		if(isElementPresent) 
		{
		try {
			batches.endDate.click();
			date2 = formatter.parse(BatchesPage.endDate2(d).getText());
			date1 = formatter.parse(BatchesPage.endDate1(d).getText());
			System.out.println(date1.before(date2));
			System.out.println(date1);
			System.out.println(date2);
			Assert.assertTrue(date1.compareTo(date2)<0); //date1 is before date 2; date1 is first row
			batches.endDate.click();
			date2 = formatter.parse(BatchesPage.endDate2(d).getText());
			date1 = formatter.parse(BatchesPage.endDate1(d).getText());
			Assert.assertTrue(date1.after(date2));
		} catch (ParseException e) {	e.printStackTrace();}
		}
		//date2 is last row
		
	}
	
	@Test(priority=3)
	public void verifyEndDateArrowSort() {
		//WebDriverWait wait = new WebDriverWait(d, 10);
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(batches.endDateArrow));
		isElementPresent = BatchesPage.endDate1(d).isDisplayed();
		//batches.endDateArrow.click();
		Assert.assertTrue(isElementPresent);
		SimpleDateFormat formatter  = new SimpleDateFormat("MMM. DD, YYYY");
		Date date2;
		Date date1;
		if(isElementPresent) 
		{
		try {
			batches.endDateArrow.click();
			date2 = formatter.parse(BatchesPage.endDate2(d).getText());
			date1 = formatter.parse(BatchesPage.endDate1(d).getText());
			
			//Assert.assertTrue(date1.compareTo(date2)<0); //date1 is before date 2; date1 is first row
			//default is from old to new
			Assert.assertTrue(date1.before(date2));
			batches.endDateArrow.click();
			date2 = formatter.parse(BatchesPage.endDate2(d).getText());
			date1 = formatter.parse(BatchesPage.endDate1(d).getText());
			Assert.assertTrue(date1.after(date2));
		} catch (ParseException e) {	e.printStackTrace();}
		}
		//date2 is last row

		

	}


	//@Ignore
	@Test(priority=10)
	public void logout() {
		webdriver.logout();
		
	}

	

	





}