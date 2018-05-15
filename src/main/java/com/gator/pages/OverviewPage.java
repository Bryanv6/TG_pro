package com.gator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class OverviewPage {
    private static WebElement element;
    FileInputStream in;
    static Properties props = new Properties();

    public OverviewPage(){
        try {
            in = new FileInputStream("src/main/resources/db.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebElement table(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_table")));
        return element;
    }
    public static WebElement names(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_names")));
        return element;
    }
    public static WebElement curriculum(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_curriculum")));
        return element;
    }
    public static WebElement trainer(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_trainer")));
        return element;
    }
    public static WebElement location(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_location")));
        return element;
    }
    public static WebElement building(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_building")));
        return element;
    }
    public static WebElement room(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_room")));
        return element;
    }
    public static WebElement startDate(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_startDate")));
        return element;
    }
    public static WebElement endDate(WebDriver wd){
        element = wd.findElement(By.xpath(props.getProperty("OverviewPage_endDate")));
        return element;
    }

}
