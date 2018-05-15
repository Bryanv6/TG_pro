package com.gator.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gator.pages.TrainersPage;

import webdriver.webdriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class TrainersTest {
    static WebDriver d;

    @Test
    public void beforeyTest(){
        d = webdriver.openApp();
        webdriver.VPLogin();
        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TrainersPage.trainersBtn(d).click();

    }
    @Test(priority = 2)
    public void activateTrainer(){
        //d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String name = TrainersPage.getInactive(d).getText();
        String lines[] = name.split("[\r\n]+");
        String deName = lines[0];

        TrainersPage.reativateTrainer(d).click();

        name = TrainersPage.getActive(d).getText();
        String lines1[] = name.split("[\r\n]+");
        for(String n : lines1){
            if(n.equals(deName)) {
                System.out.println("Found Name");
                Assert.assertTrue(n.equals(deName));
                break;
            }
        }
    }
    @Test(priority = 2)
    public void deactivateTrainer(){
        String name = TrainersPage.getActive(d).getText();
        String lines[] = name.split("[\r\n]+");
        String deName = lines[0];
        TrainersPage.deactivateTrainer(d).click();

        name = TrainersPage.getInactive(d).getText();
        String lines1[] = name.split("[\r\n]+");
        for(String n : lines1){
            if(n.equals(deName)) {
                System.out.println("Found Name");
                Assert.assertTrue(n.equals(deName));
                break;
            }
        }


    }
    @Test(priority = 1)
    public void enterTrainerAndSubmit(){

        TrainersPage.addTrainer(d).click();
        TrainersPage.inputFirstname(d).sendKeys("Test");
        TrainersPage.inputLastname(d).sendKeys("Name");
        TrainersPage.submit(d).click();
        String x = TrainersPage.getInactive(d).getText();
        String lines[] = x.split("[\r\n]+");
        for(String name : lines){
            if(name.equals("Test Name")) {
                System.out.println("Found Name");
                Assert.assertTrue(name.equals("Test Name"));
                break;
            }
        }
    }
}
