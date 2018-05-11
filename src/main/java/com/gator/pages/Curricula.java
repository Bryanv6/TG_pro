package com.gator.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

<<<<<<< HEAD:src/main/java/model/Curricula.java
import com.gator.pages.ReportsPage;
=======
>>>>>>> 4ee03c8fe5744d3736a8fc061347c23e71f4321f:src/main/java/com/gator/pages/Curricula.java
import webdriver.webdriver;

public class Curricula {
	
	static WebDriver d;
	
	public static void main(String[] args) {
		
		d = webdriver.openApp();
		webdriver.trainerLogin();	
		webdriver.goTo_Curricula();
		
		ReportsPage reports = new ReportsPage(d); 	
		reports.coretoggle.click();
		//String x = reports.coreCurriculum.getText();
		//Dimension y = reports.coreCurriculum.getSize();
		String o = reports.curriculumlist.getText(); //gets all from core curriculum - parse?
		//String o = reports.focuses.getText();
		System.out.println(o);
		//System.out.println(y);
		//System.out.println(x);

		

	}

}
