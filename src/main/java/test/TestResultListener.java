package test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestResultListener extends TestListenerAdapter {
	public static File JsonFile;
	public static FileWriter writer;
	public static JSONObject finalResult= new JSONObject();
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
	    @Override
	    public void onTestFailure(ITestResult result) {
	    	init();
	    	finalResult.put(result.getName().toString(), result.getStatus());
	    	try {
				writer.write(finalResult.toJSONString());
				writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	    	finalResult.put(result.getName().toString(), result.getStatus());
	    	try {
				writer.write(finalResult.toJSONString());
				writer.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	        // do what you want to do
	    }
}
