package webdriver;

import antlr.StringUtils;
import bsh.StringUtil;
import gherkin.lexer.Tr;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
        TrainersPage.trainersBtn(d).click();
    }
    @AfterTest
    public void afterTest(){
        webdriver.logout();
    }
    @Test
    public void test1(){
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



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
