package com.gator.tests;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

//import com.gator.service.Log;

public class TestResultListener extends TestListenerAdapter {
	public static File JsonFile= new File("JsonFile.json");
	public static FileWriter writer;
	public static JSONObject finalResult= new JSONObject();

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	//Log.success(result.getName().toString()+": Failure");

	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	    	//Log.success(result.getName().toString()+": Success");
	   
	    }
}
