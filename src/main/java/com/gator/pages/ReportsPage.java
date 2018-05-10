package com.gator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class ReportsPage {

	
	public ReportsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy (xpath = "//*[@id=\"incomingTable\"]/md-card[1]/get-train-table-template/div/div/md-table-container/table")
	public WebElement trainee_table;
	
	// expansion buttons
	@FindBy (xpath = "/html/body/div/div[2]/div/md-card/md-card[3]")
	public WebElement trainee_card;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/md-card/md-card[2]")
	public WebElement graduate_card;
	
	@FindBy (xpath = "/html/body/div/div[2]/div/md-card/md-card[1]")
	public WebElement batch_card;
	
	
}
