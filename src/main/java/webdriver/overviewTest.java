package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;
import webdriver.webdriver;
import webdriver.OverviewPage;


public class overviewTest {
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

}
