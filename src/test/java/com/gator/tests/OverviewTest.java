package com.gator.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gator.pages.OverviewPage;

import webdriver.webdriver;

import java.util.concurrent.TimeUnit;


public class OverviewTest {
    static WebDriver d;
    @BeforeTest
    public void beforeTest(){
        d = webdriver.openApp();
        webdriver.trainerLogin();
    }
    @AfterTest
    public void afterTest(){
        webdriver.logout();
    }

    @Test
    public void overview_test(){

        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        String name = OverviewPage.table(d).getText();
        System.out.println(name);
    }
    @Test
    public void test2(){
        OverviewPage.names(d).click();
    }
    @Test
    public void test3(){
        OverviewPage.building(d).click();
    }
    @Test
    public void test4(){
        OverviewPage.curriculum(d).click();
    }
    @Test
    public void test5(){
        OverviewPage.location(d).click();
    }
    @Test
    public void test6(){
        OverviewPage.room(d).click();
    }
    @Test
    public void test7(){
        OverviewPage.startDate(d).click();
    }
    @Test
    public void test8(){
        OverviewPage.endDate(d).click();
    }
    @Test
    public void test9(){
        OverviewPage.trainer(d).click();
    }

}
