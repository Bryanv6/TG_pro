package com.gator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LocationsPage {
	FileInputStream in;
	static Properties props = new Properties();

	public LocationsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		try {
			in = new FileInputStream("src/main/resources/db.properties");
			props.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public WebElement create_location_button(WebDriver wd){
		return wd.findElement(By.xpath(props.getProperty("LocationsPage_create_location_button")));
	}

	public WebElement state_input(WebDriver wd){
		return wd.findElement(By.xpath(props.getProperty("LocationsPage_state_input")));
	}

	public WebElement name_input(WebDriver wd){
		return wd.findElement(By.xpath(props.getProperty("LocationsPage_name_input")));
	}

	public WebElement city_input(WebDriver wd){
		return wd.findElement(By.xpath(props.getProperty("LocationsPage_city_input")));
	}

	public WebElement save_button(WebDriver wd){
		return wd.findElement(By.xpath(props.getProperty("LocationsPage_save_button")));
	}

}
