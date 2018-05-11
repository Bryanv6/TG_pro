package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class TrainersPage {
    private static WebElement element;

    public static WebElement trainersBtn(WebDriver wd){
        element = wd.findElement(By.xpath("//li[@name='trainers']"));
        return element;
    }
    public static WebElement addTrainer(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[1]"));
    }
    public static WebElement inputName(WebDriver wd){
        return wd.findElement(By.id("input_1"));
    }

}
