package webdriver;

import gherkin.lexer.Tr;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
       // webdriver.logout();
    }
    @Test
    public void test1(){
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        TrainersPage.addTrainer(d).click();
        TrainersPage.inputName(d).sendKeys("Bryan");
    }
}
