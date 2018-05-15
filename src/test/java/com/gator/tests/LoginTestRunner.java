package com.gator.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="/src/main/resources/loginFunction.feature")
public class LoginTestRunner extends AbstractTestNGCucumberTests  {
	
	//runs all features in folder directly


}
