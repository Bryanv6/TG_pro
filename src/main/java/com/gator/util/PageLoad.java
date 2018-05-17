package com.gator.util;

import org.openqa.selenium.WebDriver;

import webdriver.webdriver;

public class PageLoad {
	
	public static void wait(WebDriver d, int depth) {
		
		boolean isLoaded = false;
		String[] strAry = new String[depth];
		
		while(!isLoaded) {
			isLoaded = true;
			for(int i = 0; i < depth; i++) {
				strAry[i] = d.getPageSource();
			}
			for(int i = 0; i < depth-1; i++) {
				System.out.println("index " + i + ": " + strAry[i].length());
				System.out.println("index " + (i + 1) + ": " + strAry[i+1].length());
				System.out.println();
				
				if(strAry[i].length() != strAry[i+1].length()) {
					isLoaded = false;
				}
			}
		}
	}
}
