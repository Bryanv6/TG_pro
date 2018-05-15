package com.gator.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class TrainersPage {
    FileInputStream in;
    static Properties props = new Properties();
    public TrainersPage(){
        try {
            in = new FileInputStream("src/main/resources/db.properties");
            props.load(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static WebElement trainersBtn(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_trainersBtn")));
    }
    //for VP only
    public static WebElement addTrainer(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_addTrainer")));
    }
    //for VP only
    public static WebElement inputFirstname(WebDriver wd){
        return wd.findElement(By.id(props.getProperty("Trainers_page_inputFirstname")));
    }
    //for VP only
    public static WebElement inputLastname(WebDriver wd){
        return wd.findElement(By.id(props.getProperty("Trainers_page_inputLastname")));
    }
    //for VP only
    public static WebElement submit(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_submit")));
    }
    //for VP only
    public static WebElement cancel(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_cancel")));
    }
    public static WebElement calenderBtn(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_calenderBtn")));
    }
    public static WebElement newPTO(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_newPTO")));
    }
    //for VP only
    public static WebElement deactivateTrainer(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_deactivateTrainer")));
    }
    //for VP only
    public static WebElement reativateTrainer(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_reativateTrainer")));
    }
    public static WebElement goToProfile(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_goToProfile")));
    }
    public static WebElement getInactive(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_getInactive")));
    }
    public static WebElement getActive(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_getActive")));
    }
    public static WebElement newPTOcancel(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_newPTO_cancel")));
    }
    public static WebElement startDate(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_startDate")));
    }
    public static WebElement endDate(WebDriver wd){
        return wd.findElement(By.xpath(props.getProperty("Trainers_page_endDate")));
    }


}
