package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webdriver {

	public static ChromeOptions options = new ChromeOptions().addArguments("user-data-dir=C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
	public static  WebDriver d;
	static Properties props=new Properties();

	public static void main(String[] args) {

		openApp();

		trainerLogin();

		//logout();

		goTo_Batches();

		goTo_Settings();

		logout();
	}

	public static WebDriver openApp() {
		FileInputStream in;

		try {
			in = new FileInputStream("src/main/resources/db.properties");

			props.load(in);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String url = props.getProperty("url");

		String driver = props.getProperty("driver");

		File chrome = new File(driver);
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());

		d= new ChromeDriver(options);
		//d= new ChromeDriver();
		d.get(url);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return d;
	}

	public static void trainerLogin() {

		//String username = props.getProperty("username");

		//String password = props.getProperty("password");
		String username = "test.trainer@revature.com.int1";
		String password = "trainer123";

		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.id("Login")).click();
	}

	public static void VPLogin() {
		String usernameVP = props.getProperty("usernameVP");
		String password = props.getProperty("passwordVP");

		d.findElement(By.id("username")).sendKeys(usernameVP);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.id("Login")).click();
	}

	public static void goTo_Batches() {
		d.get("https://dev.assignforce.revaturelabs.com/batches");
	}

	public static void goTo_Locations() {
		d.get("https://dev.assignforce.revaturelabs.com/locations");
	}

	public static void goTo_Curricula() {
		d.get("https://dev.assignforce.revaturelabs.com/curriculum");
	}

	public static void goTo_Trainers() {
		d.get("https://dev.assignforce.revaturelabs.com/trainers");
	}

	public static void goTo_Profiles() {
		d.get("https://dev.assignforce.revaturelabs.com/profile");
		//d.findElement(By.xpath("/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]/a"));
	}

	public static void goTo_Reports() {
		d.get("https://dev.assignforce.revaturelabs.com/reports");
	}

	public static void goTo_Settings() {
		d.get("https://dev.assignforce.revaturelabs.com/settings");
	}

	public static void logout() {
		d.findElement(By.xpath("/html/body/div[1]/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/button")).click();
		d.close();
	}
}