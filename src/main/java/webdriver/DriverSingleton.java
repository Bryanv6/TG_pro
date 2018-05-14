package webdriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSingleton {
	
	
	public static WebDriver driver;

	   public static WebDriver getDriver() {
	     if (driver == null) {
	    	 
	    	File chrome = new File("src/main/resources/chromedriver.exe");
	 		System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());

	 		driver= new ChromeDriver();
	    	
	     }
	     return driver;
	   }
	   
	   
//	   public static void main(String[] args) {
//		
//		   WebDriver testDriver = getDriver();
//		   testDriver.hashCode();
//		   System.out.println(testDriver.hashCode());
//		   testDriver.get("https://www.cnn.com/");
//		   
//		   WebDriver testDriver2 = getDriver();
//		   testDriver2.get("http://www.espn.com/");		   
//		   System.out.println(testDriver2.hashCode());
//		   
//		   
//		   
//	}

}
