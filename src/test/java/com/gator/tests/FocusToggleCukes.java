package com.gator.tests;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.testng.Assert.assertEquals;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webdriver.webdriver;

public class FocusToggleCukes {

	
	 WebDriver d;
	 WebDriverWait wait;	
	public FocusToggleCukes()
	{
		d = webdriver.openApp();
		webdriver.trainerLogin();
	    //d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		wait= new WebDriverWait(d, 10);
		wait.until(elementToBeClickable(By.xpath("//li[@name='curricula']")));
	   d.findElement(By.xpath("//li[@name='curricula']")).click();
	}
	
	@Given("^I \"([^\"]*)\" on the focus toggle$")
	public void i_on_the_focus_toggle(String arg1) throws Throwable {
		 d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 wait.until(elementToBeClickable(By.xpath("//*[@id=\"focusArrow\"]")));
			d.findElement(By.xpath("//*[@id=\"focusArrow\"]")).click(); 
			
			String n = d.findElement(By.xpath("//*[@id=\"focusArrow\"]")).getText();
			if(n.equals("keyboard_arrow_down"))
			{
				assertEquals(true,true);
			}
			else
			{
				assertEquals(false, true);
			}
	}

	@Then("^a list of focus \"([^\"]*)\" should not be displayed$")
	public void a_list_of_focus_should_not_be_displayed(String arg1) throws Throwable {
		
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		wait.until(elementToBeClickable(By.xpath("//*[@id=\"focus\"]")));
		String display = d.findElement(By.xpath("//*[@id=\"focus\"]")).getCssValue("display");
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

	

