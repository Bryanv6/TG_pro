package com.gator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationsPage {

	public LocationsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy (xpath = "//*[@id=\"locAdd\"]/md-icon")
	public WebElement create_location_button;
	
	@FindBy (xpath = "//*[@id=\"select_4\"]")
	public WebElement state_input;
	
	@FindBy (xpath = "//*[@id=\"input_2\"]")
	public WebElement name_input;
	
	@FindBy (xpath = "//*[@id=\"input_3\"]")
	public WebElement city_input;
	
	@FindBy (xpath = "/html/body/div[3]/md-dialog/form/md-dialog-actions/button[1]")
	public WebElement save_button;
	
}
