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
	
	@FindBy (id = "coreArrow")
	public WebElement coretoggle;
	
	/*@FindBy (xpath = "//*[@id=\"view\"]/md-card/md-content/md-card[1]/md-toolbar/div/span[1]")
	public WebElement coreCurriculum;
	
	@FindBy (xpath = "//*[@id=\"view\"]/md-card/md-content/md-card[2]/md-toolbar/div/span[1]")
	public WebElement focuses;*/
	
	@FindBy (xpath = "//*[@id=\"core\"]/md-list")
	public WebElement curriculumlist;
	
	@FindBy (xpath = "//*[@id=\"focus\"]/md-list")
	public WebElement focuslist;
	
	@FindBy	(xpath = "//*[@id=\"core\"]/md-list/md-list-item[1]/div[1]/h3" )
	public WebElement coreelements;
	
	//*[@id="core"]/md-list/md-list-item[2]/div[1]/h3
	
	@FindBy (id = "focusArrow")
	public WebElement focustoggle;
}
