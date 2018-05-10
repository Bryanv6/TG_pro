package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by bryanvillegas on 5/10/18.
 */
public class OverviewPage {
    private static WebElement element;

    public static WebElement names(WebDriver wd){
        element = wd.findElement(By.xpath("//*[@id=\"view\"]/div/md-card/md-content/md-table-container/table"));
        //*[@id="view"]/div/md-card/md-content/md-table-container/table
        return element;
    }
}
