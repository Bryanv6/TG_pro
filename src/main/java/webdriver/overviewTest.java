package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
        d = webdriver.openApp();
        webdriver.trainerLogin();
        String name = d.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table")).getText();
        System.out.println(name);
    }
}
