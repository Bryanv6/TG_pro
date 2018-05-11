package com.gator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class OverviewPage {
    private static WebElement element;
    public OverviewPage(){}

    public static WebElement table(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        return element;
    }
    public static WebElement names(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[1]"));
        return element;
    }
    public static WebElement curriculum(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[2]"));
        return element;
    }
    public static WebElement trainer(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[3]"));
        return element;
    }
    public static WebElement location(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[4]"));
        return element;
    }
    public static WebElement building(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[5]"));
        return element;
    }
    public static WebElement room(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[6]"));
        return element;
    }
    public static WebElement startDate(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[7]"));
        return element;
    }
    public static WebElement endDate(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[8]"));
        return element;
    }

}
