package com.gator.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurriculaPage {
	
	
	
	static Properties props=new Properties();
	private static WebElement element;
	
	static {
	FileInputStream in;

	try {

		in = new FileInputStream("TG_pro/src/main/resources/db.properties");

		props.load(in);

	} catch (FileNotFoundException e) {

		e.printStackTrace();

	} catch (IOException e) {

		e.printStackTrace();

	}
	}
	
	
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
