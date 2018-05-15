package com.gator.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webdriver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.simple.JSONObject;
import com.gator.pages.LoginPage;;

public class LoginStepDefinition {
	public static File JsonFile;
	public static FileWriter writer;
	public static JSONObject result= new JSONObject();
	public static void init() {
		JsonFile = new File("JsonFile.json");
		if(!JsonFile.exists()) 
		{
			try {
			JsonFile.createNewFile();
			} catch (IOException e) { e.printStackTrace();}
		} 
		
		try {
			writer = new FileWriter(JsonFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	static 	WebDriver d=DriverSingleton.getDriver();
	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String arg1) throws Throwable {
		//init();
		
		d.get("https://revature--int1.cs17.my.salesforce.com/");
	    //arg1 actually not used here, dummy arg
	}

	@Then("^login page should load$")
	public void login_page_should_load() throws Throwable {
	    // Test if page loads
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete"));
		if(((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete"))
		{
			result.put("Login page load test", "Success");
		}else {
			result.put("Login page load test", "Failure");
		}
	}
	
	@Given("^I have correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_have_correct_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LoginPage.user(d).sendKeys(arg1);
		LoginPage.pass(d).sendKeys(arg2);
		
	}

	@When("^I click login$")
	public void i_click_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//webdriver.trainerLogin();
		LoginPage.loginButton(d).click();
	}

	@Then("^I should be directed to home page \"([^\"]*)\"$")
	public void i_should_be_directed_to_home_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//wait 5 seconds to find element
		//webdriver.d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((JavascriptExecutor)d).executeScript("return document.readyState").equals("complete");
		new WebDriverWait(d,5).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@name='logout']")));
		if (d.getTitle().contains("AssignForce"))
		{
			result.put("Home page load test","Success");
		}else { result.put("Home page load test","Failure");}
		//Assert.assertTrue(webdriver.d.getCurrentUrl().contains("/home"));
		writeResult();
		Assert.assertEquals(d.getCurrentUrl(), arg1);
		Assert.assertTrue(d.getTitle().contains("AssignForce"));
	}
 /* //((JavascriptExecutor)webdriver.d).executeScript("return document.readyState").equals("complete"));
	@Given("^I have incorrect \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_have_incorrect_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//webdriver.trainerLogin();
		LoginPage.user(webdriver.d).sendKeys(arg1);
		LoginPage.pass(webdriver.d).sendKeys(arg2);
		
	}

	@When("^I click loginw$")
	public void i_click_loginw() throws Throwable {
	    // click clicked in trainer login
		LoginPage.loginButton(webdriver.d).click();
	
	}

	@Then("^I should remain on login page$")
	public void i_should_remain_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(webdriver.d.getTitle().contains("Login"));
		
		
	}

	@Then("^shown a message about wrong username and password$")
	public void shown_a_message_about_wrong_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertNotNull(webdriver.d.findElement(By.id("error")));
	}
	*/
	public static void writeResult()
	{
		try {
			writer.write(result.toJSONString());
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
