package com.gator.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutElement {
	
	@FindBy(xpath = "//li[@name='logout']")
	public WebElement LogoutBtn;

}
