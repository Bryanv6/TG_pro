package com.gator.tests;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CurriculumTestListener extends TestListenerAdapter {

	//CurriculumTestNG curr = new CurriculumTestNG();
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		
		CurriculumTestNG.result = "Failed";
		
	}
	
	public void onTestSuccess(ITestResult result)
	{
		CurriculumTestNG.result = "Passed";
	}
}
