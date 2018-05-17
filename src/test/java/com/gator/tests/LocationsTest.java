package com.gator.tests;

import org.testng.annotations.Test;

import com.gator.pages.LocationsPage;
import com.gator.seq.SequenceService;
import com.google.common.base.Function;

import webdriver.webdriver;


import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LocationsTest {

	static WebDriver d = webdriver.openApp();

	@Test (priority = 0)
	public void addLocation_test() {

		// Get unique ID from database
		SequenceService.insert("T");
		int n = SequenceService.getLast();
		String uniqueNumber = String.valueOf(n);

		webdriver.VPLogin();
		
		// Fluent Wait: Waiting 5 seconds for an element to be present on the page,
		// checking for its presence once every 100 miliseconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
		
		// Find Location in NavBar
		WebElement lcbtn = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a"));
		    }
		});
		
		lcbtn.click();
		
		LocationsPage lcpage = new LocationsPage(d);
		lcpage.create_location_button(d).click();
		lcpage.name_input(d).sendKeys("Test"+ uniqueNumber);
		lcpage.state_input(d).sendKeys("FL");

		lcpage.city_input(d).sendKeys(uniqueNumber);
		
		// Explicit Wait for Location Save Button
		WebDriverWait exWait = new WebDriverWait(d, 1);
		WebElement lcSaveButton = exWait.until(ExpectedConditions.elementToBeClickable(lcpage.save_button(d)));
		lcSaveButton.click();
		
		// Go to Curricula Tab, then go back to Location tab
		d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a")).click();
		d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a")).click();
		
		// Retrieve list of Location
		List<WebElement> things = wait.until(new Function<WebDriver, List<WebElement>>() {
			public ArrayList<WebElement> apply(WebDriver driver) {
				return (ArrayList<WebElement>) driver.findElements(By.tagName("md-checkbox"));
		    }
		});
		
		System.out.println(things.size());

		WebElement myThing = null;
		for(int i=0; i< things.size(); i++)
		{
			if(things.get(i).getAttribute("aria-label").contains(uniqueNumber))
			{
				myThing = things.get(i);
			}
		}
		myThing.click();
		System.out.println(myThing.getAttribute("aria-label"));
	}
}
