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
	
	@FindBy(xpath="//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[1]/md-icon")
	public WebElement nameArrow;
	
	private static WebElement element;
	
	public static WebElement batchesBtn(WebDriver wd) {
		element = wd.findElement(By.xpath("//li[@name='batches']"));
		return element;
	}
}
