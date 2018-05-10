package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by bryanvillegas on 5/8/18.
 */
public class overviewTest {
    static WebDriver d;
    public static void main(String[] args){
        openApplication();
        login();


        //logout();
    }

    static void openApplication(){
        File google = new File("src/main/resources/chromedriver");
        System.setProperty("webdriver.chrome.driver", google.getAbsolutePath());
        d = new ChromeDriver();
        d.get(" https://dev.assignforce.revaturelabs.com");

    }

    static void login(){
        d.findElement(By.id("username")).sendKeys("test.trainer@revature.com.int1");
        d.findElement(By.id("password")).sendKeys("trainer123");
        d.findElement(By.id("Login")).click();
    }
    static void logout(){

        d.close();
    }
}
