package com.gator.tests;
import org.testng.annotations.*;


import com.gator.pages.ReportsPage;

//import model.Curricula;
import webdriver.webdriver;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurriculumTestNG {
	
   WebDriver d;
	String [] testname = new String[5];{
	
	testname[0] = "coresize";
	testname[1] = "focussize";
	testname[2] = "skillscore";
	testname[3] = " ";
	testname[4] = " ";
	}
	
	int j = 0;
	
	@BeforeTest
	public void beforeTest()
	 {
	     d = webdriver.openApp();
	      webdriver.trainerLogin();
	     d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     d.findElement(By.xpath("//li[@name='curricula']")).click();
	     
	  }
	

	 /* webdriver.trainerLogin();
	 */
	  
	    
	
  @Test (priority = 0)
  public void testCoreSize() throws IOException {
	 //ReportsPage report = new ReportsPage(d);
	  
	 int count = 0;
	 
	 for (int i=1; i<=5; i++)
	  {
		  System.out.println(i);
		 System.out.println(d.findElement(By.xpath("//*[@id=\"core\"]/md-list/md-list-item["+ i +"]/div[1]/h3")).getText());
		
		  count++;
	  }
	  
	  System.out.println(count);
	 
	  if(count == 5)
	  {
		  j++;
		 assertEquals(true,true);
		  
	  }
	  else
	  {
		  j++;
		  assertEquals(true, false);
		 
	  }
	
  }
  
  @Test (priority =1)
  public void testFocusSize() throws IOException
  {	
	  int count = 0;
		 
		 for (int i=1; i<=5; i++)
		  {
			 System.out.println(i);
			  System.out.println(d.findElement(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item["+ i +"]/div[1]/h3")).getText());
			  count++;
		  }
	  System.out.println(count);
	 
	  if((count) == 5)
	  {
		 // System.out.println(count/2);
		  j++;
		 assertEquals(true,true);
		  
	  }
	  else
	  {
		  j++;
		  assertEquals(true, false);
		 
	  }
  }
  
  @Test (priority =2)
  public void testSkillscore()
  {
	  int j = 0;
	  int[]expectedresult = {2, 0, 3, 1, 1};
	  for(int i  =1; i<=5; i++)
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
	  int u = 0;
	  int[]expectedresult = {1, 16, 0, 1, 2};
	  for(int i  =1; i<=5; i++)
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
	          if(count == expectedresult[u])
	          {
	        	  assertEquals(true, true);
	          }
	          else
	          {
	        	  assertEquals(true, false);
	          }
	         u++;
	  } 
  }
  
  @BeforeMethod
  public void beforeMethod() {
	   System.out.println("Testing ..." + testname[j]);  
	 
  }
  

@AfterTest
public void aftertest()
{
	
}

 

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	d.close();
  }

}
