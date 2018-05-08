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

public class webdriver {
	static WebDriver d;
	static Properties props=new Properties();
	public static void main(String[] args) {
		openApp();
		trainerLogin();
		logout();
		
	
	}
	static void openApp() {
		
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
		
		File chrome = new File("src/main/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
		d= new ChromeDriver();
		
		d.get(url);
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	static void trainerLogin() {
		String username = props.getProperty("username");
		String password = props.getProperty("password");
		d.findElement(By.id("username")).sendKeys(username);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.id("Login")).click();
	
	}
	
	static void VPLogin() {
		String usernameVP = props.getProperty("usernameVP");
		String password = props.getProperty("passwordVP");
		d.findElement(By.id("username")).sendKeys(usernameVP);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.id("Login")).click();
	}
	
	static void logout()
	{
		d.findElement(By.xpath("//li[@name='logout']")).click();
		d.close();
	}

}
