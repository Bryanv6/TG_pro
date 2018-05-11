package com.gator.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver.webdriver;

public class StudyFindBy {
	
	static WebDriver d;
	
	public static void main(String[] args) {
		
		d = webdriver.openApp();
		webdriver.trainerLogin();	
		webdriver.goTo_Reports();
		System.out.println(d.getCurrentUrl());
//		
//		ReportsPage reports = new ReportsPage(d); 			
//		Dimension before = reports.trainee_card.getSize();
//		reports.trainee_card.click();
//		Dimension after = reports.trainee_card.getSize();
//		boolean passed;
//		
//		if(before.getHeight()<after.getHeight()) {
//			passed = true;
//		}


	}

}
