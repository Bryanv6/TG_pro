package request;

import java.io.File;
import java.io.IOException;

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

import webdriver.loginCukes.TestRunner;
 class TG_Servlet extends HttpServlet {


	public static JSONObject item = new JSONObject();

	public TG_Servlet() {
		super();
	}


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		
		 new TestRunner();
		File result = new File("/my_git_repos/TG_pro/JsonFile.json");
		ObjectMapper mapper = new ObjectMapper();
		String result2=mapper.readValue(result, String.class);
		//res.getWriter().append(result2);


		 /*res.setContentType("application/octet-stream");
		    res.setHeader("Content-Disposition", "filename=\'JSonFile.json\'");
		new TestRunner();
		File result = new File("/my_git_repos/TG_pro/JsonFile.json");
		ObjectMapper mapper = new ObjectMapper();
		String result2=mapper.readValue(result, String.class);
		res.getWriter().append(result2);*/
		 
		 	
		item.put("Testname", "Login Test");

		item.put("TestDescription", "If successful, Login goes to homepage");

		item.put("TestResult", "false"); 
		
		res.getWriter().append(String.valueOf(item));

	}

		
	/*	item.put("test","result");
		 res.getWriter().append(String.valueOf(item));



       //res.getWriter().append(req.getParameter("testapp"));
=======
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		JSONObject item = new JSONObject();
		item.put("TestResult", "Loading");
		response.getWriter().append(String.valueOf(item));
		//request.getRequestDispatcher("/TG_pro/test-output/emailable-report.html").forward(request, response);
		response.sendRedirect("/TG_pro/test-output/emailable-report.html");
>>>>>>> d9aa5ef646c37c3e528126e5120f9fd5bf24804b
	}
		//The url of the test website is in this parameter - testapp (Pass to webdriver)



       // System.out.println(req.getParameter("testapp"));

<<<<<<< HEAD
*/
/*=======
// res.setContentType("application/octet-stream");
		// res.setHeader("Content-Disposition", "filename=\'JSonFile.json\'");
		 *//**res.getWriter().append("Test: Result");
		// JSONArray array = new JSONArray();
		
		 new TestRunner();
		File result = new File("/my_git_repos/TG_pro/JsonFile.json");
		ObjectMapper mapper = new ObjectMapper();
		String result2=mapper.readValue(result, String.class);
		//res.getWriter().append(result2);
		**//*
		// java -cp bin;libs/* org.testng.TestNG TestNG/testng.xml
		*//**JSONObject item = new JSONObject();
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
		**//*
>>>>>>> d9aa5ef646c37c3e528126e5120f9fd5bf24804b

        


*/
        



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

<<<<<<< HEAD
	
=======
		JSONObject item = new JSONObject();

		item.put("Testname", "Login Test");

		item.put("TestDescription", "If successful, Login goes to homepage");
		
		item.put("TestResult", "false");
>>>>>>> d9aa5ef646c37c3e528126e5120f9fd5bf24804b

		 

		

        

        //Appending result

        res.getWriter().append(String.valueOf(item));

       //res.getWriter().append(req.getParameter("testapp"));
        * */



	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {



    }
		

}


