package com.gator.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchesPage {
	
	public BatchesPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name ="batches")
	public WebElement batchesButton;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[9]/md-icon")
	public WebElement startDateArrow;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[10]/md-icon")
	public WebElement endDateArrow;
	
	@FindBy(xpath="//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[1]/md-icon")
	public WebElement nameArrow;
	
	@FindBy (xpath = "//*[@id=\"view\"]/md-card")
	public WebElement batch_card;
	
	@FindBy (xpath = "//*[@id=\"view\"]/md-card/md-content[2]/md-toolbar/div")
	public WebElement batch_timeline;
	
	//Check box column not implemented but still in code
	@FindBy(xpath="//*[@id='view']/md-card/md-content[1]/div/md-table-container/table/tbody/tr[143]/td[9]")
	public WebElement startDate2;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/tbody/tr[1]/td[9]")
	public WebElement startDate1;
	
	
	//*[@id="view"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[9]/text()
	@FindBy(xpath="//*[@id='view']/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[9]")
	public WebElement startDate;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[10]")
	public WebElement endDate;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[6]")
	public WebElement location;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[7]")
	public WebElement building;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[8]")
	public WebElement room;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[5]")
	public WebElement trainer;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[4]")
	public WebElement focus;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[3]")
	public WebElement curriculum;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/thead/tr/th[2]")
	public WebElement name;

	
	private static WebElement element;
	
	public static WebElement batchesBtn(WebDriver wd) {
		element = wd.findElement(By.xpath("//li[@name='batches']"));
		return element;
	}
	
	public static WebElement endDate2(WebDriver wd)
	{
		
		element = 
		wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/tbody/tr[143]/td[10]"));
		return element;
	}
	
	public static WebElement endDate1(WebDriver wd)
	{
		element = 
		wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/tbody/tr[1]/td[10]"));
		return element;
	}
	
	public static List<WebElement> tableRows(WebDriver wd) 
	{
		List<WebElement> rows = wd.findElements(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/tbody/tr"));
		return rows;
	}
	//*[@id="view"]/md-card/md-content[1]/div/md-table-container/table
	
	

}
