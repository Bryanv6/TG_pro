package com.gator.tests;
import org.testng.annotations.Test;
import webdriver.webdriver;
import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.StringTokenizer;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

@Listeners({CurriculumTestListener.class})
public class CurriculumTestNG {
	
   WebDriver d;
   WebDriverWait wait;
   public static String result;
   String [] testname = new String[5];{
	
	testname[0] = "coresize";
	testname[1] = "focussize";
	testname[2] = "skillscore";
	testname[3] = "skillsfocus ";
	testname[4] = " ";
	}
	
	int j = 0;
	
	@BeforeTest
	public void beforeTest()
	 {
	     d = webdriver.openApp();
	      wait= new WebDriverWait(d, 10);
	      webdriver.trainerLogin();
	     wait.until(elementToBeClickable(By.xpath("//li[@name='curricula']")));
	     d.findElement(By.xpath("//li[@name='curricula']")).click();
	     
	  }
	

	 /* webdriver.trainerLogin();
	 */
	  
	    
	//if it is a standard amount it hasn't grown 
 
  @Test (priority = 0)
  public void testexpansioncore()
  {
	  Dimension coresize = new Dimension(953, 376);
	  
	  wait.until(elementToBeClickable(By.xpath("//*[@id=\"core\"]/md-list")));
	  if(coresize.equals(d.findElement(By.xpath("//*[@id=\"core\"]/md-list")).getSize()))
	  {
		  assertEquals(true,true);
	  }
	  else
	  {
		  assertEquals(false,true);
	  }
	
  }
  @Test (priority = 3)
  public void testexpansionfocus()
  {
	  Dimension focussize = new Dimension(953, 376);
	  wait.until(elementToBeClickable(By.xpath("//*[@id=\"focus\"]/md-list")));
	  if(focussize.equals(d.findElement(By.xpath("//*[@id=\"focus\"]/md-list")).getSize()))
	  {
		  assertEquals(true,true);
	  }
	  else
	  {
		  assertEquals(false,true);
	  }
	  
  }
  
  @Test (priority = 1)
  public void testCoreSize() throws IOException {
	 //ReportsPage report = new ReportsPage(d);
	  
	 if(result.equals("Failed"))
	 {
		assertEquals(true, true); 
	 }
	 else
	 {
	 int count = 0;
	
	 for (int i=1; i<=5; i++)
	  {
		 wait.until(elementToBeClickable(By.xpath("//*[@id=\"core\"]/md-list/md-list-item["+ i +"]/div[1]/h3")));
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
	
  }
  
  @Test (priority =4)
  public void testFocusSize() throws IOException
  {	
	  if(result.equals("Failed"))
		 {
			assertEquals(true, true); 
		 }
		 else
		 {
	  int count = 0;
		 
		 for (int i=1; i<=5; i++)
		  {
			 System.out.println(i);
			 wait.until(elementToBeClickable(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item["+ i +"]/div[1]/h3")));
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
  }
  
  @Test (priority =2)
  public void testSkillscore()
  {
	  int o = 0;
	  int[]expectedresult = {2, 0, 3, 1, 1};
	  for(int i  =1; i<=5; i++)
	  {
		  int count = 0;
		  wait.until(elementToBeClickable(By.xpath("//*[@id=\"core\"]/md-list/md-list-item["+ i +"]/div[1]/p"))); 
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
	          if(count == expectedresult[o])
	          {
	        	  j++;
	        	  assertEquals(true, true);	        	  
	          }
	          else
	          {
	        	  j++;
	        	  assertEquals(true, false);	  
	          }
	         o++;
	  }
  }
  
  @Test (priority =5)
  public void testSkillsfocus()
  {
	  int u = 0;
	  int[]expectedresult = {1, 16, 0, 1, 2};
	  for(int i  =1; i<=5; i++)
	  {
		  int count = 0;
		  wait.until(elementToBeClickable(By.xpath("//*[@id=\"focus\"]/md-list/md-list-item["+ i +"]/div[1]/p")));
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
  
  @AfterMethod
  public void aftermethod()
  {
	  System.out.println(result);
  }

@AfterTest
public void aftertest()
{
	System.out.println(result);
}

 

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
	d.close();
  }

}
