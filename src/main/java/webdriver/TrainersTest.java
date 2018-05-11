package webdriver;

import antlr.StringUtils;
import bsh.StringUtil;
import cucumber.api.java.ca.I;
import gherkin.lexer.Tr;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class TrainersTest {
    static WebDriver d;

    @BeforeTest
    public void beforeTest(){
        d = webdriver.openApp();
        webdriver.VPLogin();
        d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TrainersPage.trainersBtn(d).click();

    }
    @AfterTest
    public void afterTest(){
        webdriver.logout();
    }
    @Test
    @Ignore
    public void activateTrainer(){

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
    @Test
    @Ignore
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
    @Test
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
