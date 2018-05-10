package com.gator.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GatorService {

	
	public static void main(String[] args) {
        openApp(98);
    }
	
	
	/**
	 *Opens the application. By default no argument logs you in
	 *as trainer. Putting in any number logs you in as a VP
	 *Stolen from Joey by Adam
	 */
    static void openApp() {
        Properties props=new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream("src/main/resources/knownlogins.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");
        File chrome = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        WebDriver d= new ChromeDriver();
        
        d.get(url);
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.findElement(By.id("username")).sendKeys(username);
        d.findElement(By.id("password")).sendKeys(password);
        d.findElement(By.id("Login")).click();
       // d.quit();
        
    }

    static void openApp(double x) {
        Properties props=new Properties();
        FileInputStream in;
        try {
            in = new FileInputStream("src/main/resources/knownlogins.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        String url = props.getProperty("url");
        String usernameVP = props.getProperty("usernameVP");
        String passwordVP = props.getProperty("passwordVP");
        File chrome = new File("src/main/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        WebDriver d= new ChromeDriver();
        
        d.get(url);
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.findElement(By.id("username")).sendKeys(usernameVP);
        d.findElement(By.id("password")).sendKeys(passwordVP);
        d.findElement(By.id("Login")).click();
       // d.quit();
        
    }

    static FileInputStream getProperties() {
    	
    	FileInputStream in;
		try {
			return  new FileInputStream("src/main/resources/db.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
    	
    }

}
