package com.gator.pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {

	public ProfilePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="profile")
	//@FindBy(xpath="/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]")
	public WebElement profileTab;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card[1]")
	public WebElement profile_card;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card[2]")
	public WebElement profile_card2;
	
	@FindBy(xpath="//*[@id=\'input_1402\']")
	public WebElement firstNameInputBox;
	
	@FindBy(xpath="//*[@id=\'input_1403\']")
	public WebElement lastNameInputBox;
}
