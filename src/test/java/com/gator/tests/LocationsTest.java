package com.gator.tests;

import org.testng.annotations.Test;

import com.gator.pages.LocationsPage;

import webdriver.webdriver;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationsTest {

	static WebDriver d = webdriver.openApp();


	@Test (priority = 0)
	public void addLocation_test() {


		Random rand = new Random();

		int  n = rand.nextInt(100000) + 1;
		String randomNumber = String.valueOf(n);

		webdriver.VPLogin();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//webdriver.goTo_Locations();
		d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a")).click();
		LocationsPage lcpage = new LocationsPage(d);
		lcpage.create_location_button(d).click();
		lcpage.name_input(d).sendKeys("Test"+ randomNumber);
		lcpage.state_input(d).sendKeys("FL");

		lcpage.city_input(d).sendKeys(randomNumber);

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lcpage.save_button(d).click();

		// finds the element
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}


		List<WebElement> things = new ArrayList<WebElement>();
		things = d.findElements(By.tagName("md-checkbox"));
		System.out.println(things.size());

		WebElement myThing = null;
		for(int i=0; i< things.size(); i++)
		{
			if(things.get(i).getAttribute("aria-label").contains(randomNumber))
			{
				myThing = things.get(i);
			}

		}
		myThing.click();
		System.out.println(myThing.getAttribute("aria-label"));

	}

}
