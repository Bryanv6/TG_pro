package com.gator.tests;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import webdriver.webdriver;

public class CurriculumToggleCucumber {
	
	WebDriver d;
	public CurriculumToggleCucumber()
	{
		d = webdriver.openApp();
		webdriver.trainerLogin();
	    d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    d.findElement(By.xpath("//li[@name='curricula']")).click();
	}
	
	@Given("^I \"([^\"]*)\" on the core toggle$")
	public void i_on_the_core_toggle(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	    throw new PendingException();
	}

	@Then("^a list of core \"([^\"]*)\" should not be displayed$")
	public void a_list_of_core_should_not_be_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^I \"([^\"]*)\" on the focus toggle$")
	public void i_on_the_focus_toggle(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^a list of focus\"([^\"]*)\" should not be displayed$")
	public void a_list_of_focus_should_not_be_displayed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}




}
