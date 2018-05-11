package pages;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver.webdriver;

public class StudyFindBy {
	
	static WebDriver d;
	
	public static void main(String[] args) {
		
		d = webdriver.openApp();
		webdriver.trainerLogin();	
		webdriver.goTo_Reports();
		
		ReportsPage reports = new ReportsPage(d); 	
		reports.button2.click();
		String x = reports.chart.getText();
		
		System.out.println(x);

		

	}

}
