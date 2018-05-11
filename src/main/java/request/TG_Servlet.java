package request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonStreamParser;
import org.json.simple.parser.JSONParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonStreamParser;
import webdriver.loginCukes.TestRunner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
public class TG_Servlet extends HttpServlet {

	public static JSONObject item = new JSONObject();
	public TG_Servlet() {
		super();
	}

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		// res.setContentType("application/octet-stream");
		// res.setHeader("Content-Disposition", "filename=\'JSonFile.json\'");
		 /**res.getWriter().append("Test: Result");
		// JSONArray array = new JSONArray();
		
		 new TestRunner();
		File result = new File("/my_git_repos/TG_pro/JsonFile.json");
		ObjectMapper mapper = new ObjectMapper();
		String result2=mapper.readValue(result, String.class);
		//res.getWriter().append(result2);
		**/
		
		JSONObject item = new JSONObject();
		JSONObject item1 = new JSONObject();
        JSONArray array = new JSONArray();
		item.put("Testname", "Login Test");
		item1.put("Testname", "Logout Test");
		item.put("TestDescription", "If successful, Login goes to homepage");
		item1.put("TestDescription", "failure");
		item.put("TestResult", "false");
		item1.put("TestResult", "false");
		array.put(item);
		array.put(item1);
		 res.getWriter().append(String.valueOf(array));



       //res.getWriter().append(req.getParameter("testapp"));
	}
		//The url of the test website is in this parameter - testapp (Pass to webdriver)



       // System.out.println(req.getParameter("testapp"));



        



        



	/*	//Assuming TestResult



		JSONObject item = new JSONObject();



		item.put("Testname", "Login Test");



		item.put("TestDescription", "If successful, Login goes to homepage");



		item.put("TestResult", "false");



		 



		



        



        //Appending result



        res.getWriter().append(String.valueOf(item));



       //res.getWriter().append(req.getParameter("testapp"));

        * */







		//The url of the test website is in this parameter - testapp (Pass to webdriver)

       // System.out.println(req.getParameter("testapp"));

        

	/*	//Assuming TestResult

		JSONObject item = new JSONObject();

		item.put("Testname", "Login Test");

		item.put("TestDescription", "If successful, Login goes to homepage");
		
		item.put("TestResult", "false");

		 

		

        

        //Appending result

        res.getWriter().append(String.valueOf(item));

       //res.getWriter().append(req.getParameter("testapp"));
        * */



	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {



    }
		

}


