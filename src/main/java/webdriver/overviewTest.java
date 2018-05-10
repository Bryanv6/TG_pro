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


public class overviewTest {
    static WebDriver d;
    public static void main(String[] args){
        d = webdriver.openApp();
        webdriver.trainerLogin();
        String name = d.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table")).getText();

        System.out.println(name);
    }

    @Test
    public void overview_test(){

        d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        String name = d.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table")).getText();

        d.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table/thead/tr/th[1]")).click();
        System.out.println(name);
        d.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        name = d.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table")).getText();
        System.out.println(name);
    }
    @BeforeTest
    public void beforeTest(){
        d = webdriver.openApp();
        webdriver.trainerLogin();
    }
    @AfterTest
    public void afterTest(){
        webdriver.logout();
    }

}
