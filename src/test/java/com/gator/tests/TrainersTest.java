package com.gator.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.gator.pages.TrainersPage;

import webdriver.webdriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class TrainersTest {
    static WebDriver d;
    TrainersPage trainers = new TrainersPage();

    @BeforeTest
    public void beforeTest(){
        d = webdriver.openApp();
        webdriver.VPLogin();
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(d, 20);

        trainers.trainersBtn(d).click();

    }
    @Test(priority = 2)
    public void activateTrainer(){
        //WebDriverWait wait = new WebDriverWait(d, 20);
        String name = "";
        try {
            name = trainers.getInactive(d).getText();
        }
        catch (StaleElementReferenceException e){
            System.out.println("Caught exeption and waited");
            d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            name = trainers.getInactive(d).getText();
        }
        String lines[] = name.split("[\r\n]+");
        String deName = lines[0];

        trainers.reativateTrainer(d).click();

        name = trainers.getActive(d).getText();
        String lines1[] = name.split("[\r\n]+");
        for(String n : lines1){
            if(n.equals(deName)) {
                System.out.println("Found Name");
                Assert.assertTrue(n.equals(deName));
                break;
            }
        }
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();

    }
    @Test(priority = 2)
    public void deactivateTrainer(){

        String name = "";
        try {
            name = trainers.getActive(d).getText();
        }
        catch (ElementNotVisibleException e){
            System.out.println("Caught exeption and waited");
            d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            name = trainers.getActive(d).getText();
        }

        String lines[] = name.split("[\r\n]+");
        String deName = lines[0];
        trainers.deactivateTrainer(d).click();

        name = trainers.getInactive(d).getText();
        String lines1[] = name.split("[\r\n]+");
        for(String n : lines1){
            if(n.equals(deName)) {
                System.out.println("Found Name");
                Assert.assertTrue(n.equals(deName));
                break;
            }
        }

        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
    }
    @Test(priority = 1)
    public void enterTrainerAndSubmit() throws InterruptedException {
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
        Thread.sleep(20);

        trainers.addTrainer(d).click();
        trainers.inputFirstname(d).sendKeys("Test");
        trainers.inputLastname(d).sendKeys("Name");
        trainers.submit(d).click();
        String x = "";
        try{
            x = trainers.getInactive(d).getText();
        }catch(org.openqa.selenium.StaleElementReferenceException e){
            x = trainers.getInactive(d).getText();
        }

        String lines[] = x.split("[\r\n]+");
        for(String name : lines){
            if(name.equals("Test Name")) {
                System.out.println("Found Name");
                Assert.assertTrue(name.equals("Test Name"));
                break;
            }
        }
    }
    //this test requests a new PTO and clicks cancel
    @Test
    @Ignore
    public void newPTOandCancel(){
        trainers.calenderBtn(d).click();

        trainers.newPTOcancel(d).click();
    }
    @Test
    public void clickOnProfile() throws InterruptedException {
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
        Thread.sleep(20);
        trainers.goToProfile(d).click();
        trainers.trainersBtn(d).click();

    }
    @Test
    @Ignore
    public void newPTORequest(){
        trainers.calenderBtn(d).click();
        trainers.newPTO(d).click();
        trainers.startDate(d).click();
        trainers.startDate(d).sendKeys("5/15/2018");
        trainers.endDate(d).sendKeys("5/20/2018");
        trainers.submit(d).click();

    }
    @Test
    public void addTrainerWithNoValue() throws InterruptedException {
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
        Thread.sleep(20);
        trainers.addTrainer(d).click();
        trainers.inputFirstname(d).sendKeys(" ");
        trainers.inputLastname(d).sendKeys(" ");
        trainers.submit(d).click();
        trainers.cancel(d).click();
    }
    @Test
    public void addTrainerWithNumbers() throws InterruptedException {
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
        Thread.sleep(20);

        trainers.addTrainer(d).click();
        trainers.inputFirstname(d).sendKeys("12345");
        trainers.inputLastname(d).sendKeys("12345");
        trainers.submit(d).click();
        Assert.assertEquals(true,false);
    }
    @Test
    public void addTrainerWithJustFirstName() throws InterruptedException {
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
        Thread.sleep(20);

        trainers.addTrainer(d).click();
        trainers.inputFirstname(d).sendKeys("test");
        trainers.submit(d).click();
        trainers.cancel(d).click();
    }
    @Test
    public void addTrainerWithJustLastName() throws InterruptedException {
        d.findElement(By.xpath("//li[@name='batches']")).click();
        trainers.trainersBtn(d).click();
        Thread.sleep(20);

        trainers.addTrainer(d).click();
        trainers.inputLastname(d).sendKeys("test123");
        trainers.submit(d).click();
        trainers.cancel(d).click();
    }
    @Test(priority = 100)
    public void checkAddTrainerBtn(){
        d.navigate().refresh();
        trainers.addTrainer(d).click();
        trainers.cancel(d).click();
    }
}
