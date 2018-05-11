package com.gator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchesPage {
	
	public BatchesPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath ="//li[@name='batches']")
	public WebElement batchesButton;
	
	@FindBy(xpath="//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[4]/md-icon")
	public WebElement dateArrow;
	
	@FindBy(xpath="//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[1]/md-icon")
	public WebElement nameArrow;
	
	@FindBy (xpath = "//*[@id=\"view\"]/md-card")
	public WebElement batch_card;
	
	@FindBy (xpath = "//*[@id=\"view\"]/md-card/md-content[2]/md-toolbar/div")
	public WebElement batch_timeline;
	
	private static WebElement element;
	
	public static WebElement batchesBtn(WebDriver wd) {
		element = wd.findElement(By.xpath("//li[@name='batches']"));
		return element;
	}
	
	public static WebElement tableValue1(WebDriver wd)
	{
		element = 
		wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/tbody/tr[1]/td[10]"));
		return element;
	}
	
	public static WebElement tableValue2(WebDriver wd)
	{
		element = 
		wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/div/md-table-container/table/tbody/tr[115]/td[10]"));
		return element;
	}
	

}
