package request;
import org.testng.annotations.Test;

import com.gator.pages.ReportsPage;

//import model.Curricula;
import webdriver.webdriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
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
	testname[2] = "skillscore";
	testname[3] = " ";
	testname[4] = " ";
	}
	
	int i = 0;
	
	{
	webdriver.trainerLogin();
	//webdriver.goTo_Curricula(); 
	d.findElement(By.xpath("//li[@name='curricula']")).click();
	}
	ReportsPage report = new ReportsPage(d);
	
	
  @Test (priority = 0)
  public void testCoreSize() throws IOException {
	 ReportsPage report = new ReportsPage(d);
	 
	 int count = 0;
	 
	 for (int i=1; i<=7; i++)
	  {
		  System.out.println(d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item["+ i +"]/div[1]/h3")).getText());
		  count++;
	  }
	  
	  System.out.println(count);
	 
	  if(count == 7)
	  {
		  i++;
		 assertEquals(true,true);
		  
	  }
	  else
	  {
		  i++;
		  assertEquals(true, false);
		 
	  }
	
  }
  
  @Test (priority =1)
  public void testFocusSize() throws IOException
  {	
	  /*//ReportsPage report = new ReportsPage(d);
	  String focus= report.focuslist.getText();
	  int count = 0;
	  BufferedReader bufReader = new BufferedReader(new StringReader(focus));
	  while(bufReader.readLine() != null)
	  {
		  count++;
		  
	  }*/
	  int count = 0;
		 
		 for (int i=1; i<=4; i++)
		  {
			  System.out.println(d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item["+ i +"]/div[1]/h3")).getText());
			  count++;
		  }
	  System.out.println(count);
	 
	  if((count) == 4)
	  {
		 // System.out.println(count/2);
		  i++;
		 assertEquals(true,true);
		  
	  }
	  else
	  {
		  i++;
		  assertEquals(true, false);
		 
	  }
  }
  
  @Test (priority =2)
  public void testSkillscore()
  {
	  int j = 0;
	  int[]expectedresult = {0, 1, 0, 0, 3, 0, 1};
	  for(int i  =1; i<=7; i++)
	  {
		  int count = 0;
	  	String token = d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item["+ i +"]/div[1]/p")).getText();
	    StringTokenizer multiTokenizer = new StringTokenizer(token, ":");
	      String skills =multiTokenizer.nextToken();
	      	while(multiTokenizer.hasMoreTokens())
	      	{
	      		//count ++;
	      		String skillslist = multiTokenizer.nextToken();
	      		StringTokenizer skill = new StringTokenizer(skillslist, ",");
	      		while(skill.hasMoreTokens())
	      		{	
	      			System.out.println(skill.nextToken());
	      			count++;
	      		}
	      	}
	      	System.out.println(count);
	          if(count == expectedresult[j])
	          {
	        	  assertEquals(true, true);
	          }
	          else
	          {
	        	  assertEquals(true, false);
	          }
	         j++;
	  }
  }
  
  @Test (priority =3)
  public void testSkillsfocus()
  {
	  int j = 0;
	  int[]expectedresult = {2, 16, 1, 2};
	  for(int i  =1; i<=4; i++)
	  {
		  int count = 0;
	  	String token = d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item["+ i +"]/div[1]/p")).getText();
	    StringTokenizer multiTokenizer = new StringTokenizer(token, ":");
	      String skills =multiTokenizer.nextToken();
	      	while(multiTokenizer.hasMoreTokens())
	      	{
	      		//count ++;
	      		String skillslist = multiTokenizer.nextToken();
	      		StringTokenizer skill = new StringTokenizer(skillslist, ",");
	      		while(skill.hasMoreTokens())
	      		{	
	      			System.out.println(skill.nextToken());
	      			count++;
	      		}
	      	}
	      	System.out.println(count);
	          if(count == expectedresult[j])
	          {
	        	  assertEquals(true, true);
	          }
	          else
	          {
	        	  assertEquals(true, false);
	          }
	         j++;
	  } 
  }
  
 /* @Test
  public void randomTest()
  {
	  for (int i=1; i<=7; i++)
	  {
		  System.out.println(d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item["+ i +"]/div[1]/h3")).getText());
	  }
  }*/
  



 /* @BeforeTest
  public void beforeTest() {
	   System.out.println("Testing ..." + testname[i]);
  }*/

 /* @AfterTest
  public void afterTest() {
	  System.out.println("Testing ..." + testname[i]);
  }*/

 

}
