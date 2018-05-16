package com.gator.pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePagePOM {

	
	@FindBy(xpath="//li[@name='profile']")
	public WebElement profileTab;
	
	@FindBy(xpath="//*[@id=\'input_1402\']")
	public WebElement firstNameInputBox;
	
	@FindBy(xpath="//*[@id=\'input_1403\']")
	public WebElement lastNameInputBox;
}
