package request;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpRequest;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class RequestHelper {

	public static void process()
	{
	//public static void main(String[] args) {
		TestResultListener tlac = new TestResultListener();
		TestListenerAdapter tla = new TestListenerAdapter(); //set test result listener
		TestNG runner = new TestNG();
		List<String> suites = new ArrayList<>();
		suites.add("C:\\my_git_repos\\TG_pro\\src\\main\\resources\\testng.xml");//path to xml..
		runner.setTestSuites(suites);
		runner.run();
		
	}
}
