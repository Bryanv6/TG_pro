

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





	public TG_Servlet() {

		super();

	}





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	JSONObject item = new JSONObject();
		/* new TestRunner();

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

		//request.getRequestDispatcher("/TG_pro/src/main/resources/testng.xml").include(request, response);

    	//response.sendRedirect("/TG_pro/test-output/emailable-report.html");

		item.put("Testname", "Login Test");



		item.put("TestDescription", "If successful, Login goes to homepage");



		item.put("TestResult", "false"); 

		

		response.getWriter().append(String.valueOf(item));



	}


	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {







    }

		



}
 