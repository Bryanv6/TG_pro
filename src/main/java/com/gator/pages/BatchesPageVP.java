package com.gator.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BatchesPageVP {
	
	public BatchesPageVP (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (name ="batches")
	public WebElement batchesButton;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/form")
	public WebElement batchForm;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[2]")
	public WebElement allBatchesTable;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[3]")
	public WebElement batch_timeline;
	
	@FindBy(xpath="//md-select[@aria-label=\" Core Curriculum \"]")
	public WebElement dropCurriculum;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[2]/div/md-table-container/table/tbody/tr[1]/td[11]/button[2]/md-icon")
	public WebElement clone;
	
	@FindBy(xpath="//*[@id=\"view\"]/md-card/md-content[1]/form/md-toolbar/button[1]")
	public WebElement createBatchBtn;
	
	@FindBy(xpath="//*[@id=\"select_option_*\"]")
	public WebElement optionInDropDown;
	
}
