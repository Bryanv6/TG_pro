package request;
<<<<<<< HEAD
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;



import javax.servlet.http.HttpServletRequest;



import javax.servlet.http.HttpServletResponse;



=======


import javax.servlet.ServletException;



import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

>>>>>>> d4958c97b3589aded816f55c945810b09100b618
import javax.servlet.http.HttpSession;



<<<<<<< HEAD




=======
>>>>>>> d4958c97b3589aded816f55c945810b09100b618
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonStreamParser;

import org.json.simple.parser.JSONParser;



import com.fasterxml.jackson.databind.ObjectMapper;

import com.google.gson.JsonStreamParser;



import webdriver.loginCukes.TestRunner;

<<<<<<< HEAD


import java.io.File;

import java.io.FileReader;

import java.io.IOException;

import java.io.InputStream;

=======
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
>>>>>>> d4958c97b3589aded816f55c945810b09100b618
import java.io.PrintWriter;



<<<<<<< HEAD




=======
>>>>>>> d4958c97b3589aded816f55c945810b09100b618
public class TG_Servlet extends HttpServlet {



	public TG_Servlet() {

<<<<<<< HEAD


		super();



=======
		super();

>>>>>>> d4958c97b3589aded816f55c945810b09100b618
	}



	@Override

<<<<<<< HEAD


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {



		 res.setContentType("application/octet-stream");

		    res.setHeader("Content-Disposition", "filename=\'JSonFile.json\'");

=======
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		 res.setContentType("application/octet-stream");
		    res.setHeader("Content-Disposition", "filename=\'JSonFile.json\'");
>>>>>>> d4958c97b3589aded816f55c945810b09100b618
		new TestRunner();
		File result = new File("/my_git_repos/TG_pro/JsonFile.json");
		ObjectMapper mapper = new ObjectMapper();
		String result2=mapper.readValue(result, String.class);
		res.getWriter().append(result2);
		 
		   

<<<<<<< HEAD
		File result = new File("/my_git_repos/TG_pro/JsonFile.json");

		ObjectMapper mapper = new ObjectMapper();

		String result2=mapper.readValue(result, String.class);

		res.getWriter().append(result2);

		 

		   



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






=======
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


>>>>>>> d4958c97b3589aded816f55c945810b09100b618

	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

<<<<<<< HEAD


		



	}



}
=======
		

	}

}
>>>>>>> d4958c97b3589aded816f55c945810b09100b618
