package com.gator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class ProfilePage {

	
	public ProfilePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "//*[@id=\"input_2\"]")
	public WebElement trainer_LastName	;	
}
