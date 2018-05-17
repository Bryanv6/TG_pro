package com.gator.tests;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webdriver.webdriver;

public class CurriculumToggleCucumber {
	
	 WebDriver d;
	 WebDriverWait wait;
	public CurriculumToggleCucumber()
	{
		d = webdriver.openApp();
		webdriver.trainerLogin();
		wait = new WebDriverWait(d, 10);
	    d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   d.findElement(By.xpath("//li[@name='curricula']")).click();
	}
	
	@Given("^I \"([^\"]*)\" on the core toggle$")
	public void i_on_the_core_toggle(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 wait.until(elementToBeClickable(By.xpath("//*[@id=\"coreArrow\"]")));
		d.findElement(By.xpath("//*[@id=\"coreArrow\"]")).click(); 
		
		String n = d.findElement(By.xpath("//*[@id=\"coreArrow\"]")).getText();
		if(n.equals("keyboard_arrow_down"))
		{
			assertEquals(true,true);
		}
		else
		{
			assertEquals(false, true);
		}
	   // throw new PendingException();
	}

	@Then("^a list of core \"([^\"]*)\" should not be displayed$")
	public void a_list_of_core_should_not_be_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait.until(elementToBeClickable(By.xpath("//*[@id=\"core\"]")));
		String display = d.findElement(By.xpath("//*[@id=\"core\"]")).getCssValue("display");
		//System.out.println(display);
		if(display.equals("block"))
		{
			assertEquals(true, true);
		}
		else
		{
			assertEquals(false, true);
		}
	    //throw new PendingException();
	    
		d.close();
	    }

}
