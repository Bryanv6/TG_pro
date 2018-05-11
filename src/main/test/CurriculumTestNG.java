import org.testng.annotations.Test;

import pages.ReportsPage;
//import model.Curricula;
import webdriver.webdriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CurriculumTestNG {
	
	static WebDriver d = webdriver.openApp();
	String [] testname = new String[5];{
	
	testname[0] = "coresize";
	testname[1] = "focussize";
	testname[2] = " ";
	testname[3] = " ";
	testname[4] = " ";
	}
	
	int i = 0;
	
	{
	webdriver.trainerLogin();
	webdriver.goTo_Curricula();
	}
	ReportsPage report = new ReportsPage(d);
	
  @Test
  public void testCoreSize() {
	  
	int count =0;
	Scanner in = new Scanner(report.curriculumlist.getText());
	
	while(in.hasNextLine())
		{
			count++;
		}
	if((count/2) == 7)
	{
		i++;
		assertEquals(false,true);
		
	}
	else
	{
		i++;
		assertEquals(true, false);
		
	}
	
  }
  
  @Test
  public void testFocusSize()
  {
	  int count = 0;
	  Scanner in = new Scanner(report.focuslist.getText());
	  while (in.hasNextLine())
	  {
		  count++;
	  }
	  if((count/2) == 4)
	  {
		  i++;
		  assertEquals(false,true);
		  
	  }
	  else
	  {
		  i++;
		  assertEquals(true, false);
		 
	  }
  }
  
  @Test
  public void testSkillscore()
  {
	  
  }
  
  @Test
  public void testSkillsfocus()
  {
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	 System.out.println("Testing Curriculum"); 
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	   System.out.println("Testing ..." + testname[i]);
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
