package com.gator.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
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
	WebDriver d;
	LocationsPage lcpage;
	WebDriverWait exWait;
	
	@BeforeClass
	public void setUpWebDriver() {
		d = webdriver.openApp();
		webdriver.VPLogin();
		lcpage = new LocationsPage(d);
		exWait = new WebDriverWait(d, 2);
	}
	
	@AfterClass
	public void closeWebDriver() {
		d.close();
	}

	@Test (priority = 0)
	public void addLocation_test() {

		// Get unique ID from database
		SequenceService.insert("T");
		int n = SequenceService.getLast();
		String uniqueNumber = String.valueOf(n);

		// Find Location in NavBar
		Wait<WebDriver> wait = fluentWait();
		WebElement lcbtn = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a"));
		    }
		});
		
		lcbtn.click();
		
		// Get origin number of locations
		int originNumber = listOfAvailableLocations().size();
		
		lcpage.create_location_button(d).click();
		lcpage.name_input(d).sendKeys("Test"+ uniqueNumber);
		lcpage.state_input(d).sendKeys("FL");

		lcpage.city_input(d).sendKeys(uniqueNumber);
		
		// Explicit Wait for Location Save Button
		WebElement lcSaveButton = exWait.until(ExpectedConditions.elementToBeClickable(lcpage.save_button(d)));
		lcSaveButton.click();
		
		// Explicit Wait for the location list changed
		int updatedList = updatedListSize(exWait, originNumber, 1);
		Assert.assertTrue(updatedList == (originNumber + 1));
	}
	
	@Test
	public void cancelDeleteLocation_test() {
		List<WebElement> locations = listOfAvailableLocations();
		int originLocationNum = locations.size();
		
		if(locations.size() > 1) {
			lcpage.first_checkbox(d).click();
			lcpage.delete_button(d).click();
			lcpage.cancel_delete_button(d).click();
			lcpage.first_checkbox(d).click();
			int updatedList = updatedListSize(exWait, originLocationNum, 0);
			Assert.assertEquals(originLocationNum, updatedList);
		} else {
			int updatedList = updatedListSize(exWait, originLocationNum, 0);
			Assert.assertEquals(originLocationNum, updatedList);
		}
	}
	
	@Test
	public void deleteOneLocation_test() {
		List<WebElement> locations = listOfAvailableLocations();
		int originLocationNum = locations.size();
		
		if(locations.size() >= 1) {
			lcpage.first_checkbox(d).click();
			lcpage.delete_button(d).click();
			lcpage.yes_delete_button(d).click();
			int updatedList = updatedListSize(exWait, originLocationNum, -1);
			Assert.assertTrue(originLocationNum != updatedList);
		} else {
			Assert.assertEquals(originLocationNum, 0);
		}	
	}
	
	@Test
	public void deleteTwoLocations_test() {
		List<WebElement> locations = listOfAvailableLocations();
		int originLocationNum = locations.size();
		
		if(locations.size() >= 2) {
			lcpage.first_checkbox(d).click();
			lcpage.second_checkbox(d).click();
			lcpage.delete_button(d).click();
			lcpage.yes_delete_button(d).click();
			int updatedList = updatedListSize(exWait, originLocationNum, -2);
			Assert.assertTrue(originLocationNum != updatedList);
		} else {
			Assert.assertTrue(originLocationNum < 2);
		}
	}
	
	/**
	 * Return fluent wait driver.
	 * @return fluent wait driver
	 */
	private Wait<WebDriver> fluentWait() {
		// Fluent Wait: Waiting 5 seconds for an element to be present on the page,
		// checking for its presence once every 100 miliseconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(d)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class);
		
		return wait;
	}
	
	/**
	 * Return available locations in the list.
	 * @return list of available locations.
	 */
	private List<WebElement> listOfAvailableLocations() {
		Wait<WebDriver> wait = fluentWait();

		List<WebElement> locations = wait.until(new Function<WebDriver, List<WebElement>>() {
			public ArrayList<WebElement> apply(WebDriver driver) {
				return (ArrayList<WebElement>) driver.findElements(By.tagName("md-checkbox"));
		    }
		});
		return locations;
	}
	
	/**
	 * Return number of updated list location
	 * @param exWait explicit wait driver
	 * @param originSize origin number of locations
	 * @param modified add/delete number of locations
	 * @return number of updated list location
	 */
	private int updatedListSize(WebDriverWait exWait, int originSize, int modified) {
		List<WebElement> updatedList = null;
		if(modified == 0) {
			updatedList = exWait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("md-checkbox"), originSize));
		} else if(modified > 0) {
			updatedList = exWait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("md-checkbox"), originSize));
		} else {
			updatedList = exWait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.tagName("md-checkbox"), originSize));
		}
		
		return updatedList.size();
	}
}
