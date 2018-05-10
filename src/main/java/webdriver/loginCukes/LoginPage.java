package webdriver.loginCukes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	private static WebElement element;
	
	public static WebElement user(WebDriver wd) {
		element = wd.findElement(By.id("username"));
		return element;
	}

	public static WebElement pass(WebDriver wd) {
		element = wd.findElement(By.id("password"));
		return element;
	}

	public static WebElement loginButton(WebDriver wd) {
		element = wd.findElement(By.id("Login"));
		return element;
	}

	@FindBy(xpath = "//li[@name='logout']")
	public static WebElement LogoutBtn;

}