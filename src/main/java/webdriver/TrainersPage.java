package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class TrainersPage {

    public static WebElement trainersBtn(WebDriver wd){
        return wd.findElement(By.xpath("//li[@name='trainers']"));
    }
    //for VP only
    public static WebElement addTrainer(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[1]"));
    }
    //for VP only
    public static WebElement inputFirstname(WebDriver wd){
        return wd.findElement(By.id("input_1"));
    }
    //for VP only
    public static WebElement inputLastname(WebDriver wd){
        return wd.findElement(By.id("input_903"));
    }
    //for VP only
    public static WebElement submit(WebDriver wd){
        return wd.findElement(By.xpath("/html/body/div[4]/md-dialog/form/md-dialog-actions/button[1]"));
    }
    //for VP only
    public static WebElement cancel(WebDriver wd){
        return wd.findElement(By.xpath("/html/body/div[4]/md-dialog/form/md-dialog-actions/button[2]"));
    }
    public static WebElement calenderBtn(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-toolbar[1]/div/button[2]"));
    }
    public static WebElement newPTO(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"dialogContent_889\"]/md-dialog-actions/button[1]"));
    }
    //for VP only
    public static WebElement deactivateTrainer(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/div[1]/button[2]"));
    }
    //for VP only
    public static WebElement reativateTrainer(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]/md-list/md-list-item[1]/button"));
    }
    public static WebElement goToProfile(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[1]/md-list/md-list-item[1]/div[1]/button"));
    }
    public static WebElement getInactive(WebDriver wd){
        return wd.findElement(By.xpath("//*[@id=\"view\"]/md-card/md-content[2]"));
    }


}
