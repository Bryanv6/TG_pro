package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.*;

public class ReportsPage {

	
	public ReportsPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/button[2]")
	public WebElement button2;
	
	@FindBy (xpath = "//*[@id=\"incomingTable\"]/md-card[1]/get-train-table-template/div/div/md-table-container/table")
	public WebElement chart;
	
	/**
	 *  @author kathe my elements init
	 */
	

