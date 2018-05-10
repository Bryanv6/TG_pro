package com.gator.pages;

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
//		String x = d.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table")).getText();
//		
//		
//		d.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-card[3]/get-train-table-toolbar/md-toolbar/button[2]")).click();
//		String x =d.findElement(By.xpath("//*[@id=\"incomingTable\"]/md-card[1]/get-train-table-template/div/div/md-table-container/table")).getText();
//		
//		System.out.println(x);

		

	}

}
