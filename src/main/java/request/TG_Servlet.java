package request;



import javax.servlet.ServletException;



import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpSession;



import org.json.JSONObject;



import java.io.IOException;

import java.io.PrintWriter;



public class TG_Servlet extends HttpServlet {



	public TG_Servlet() {

		super();

	}



	@Override

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        
		
		

	
       RequestHelper.process();

       res.sendRedirect("/TG_pro/test-output/emailable-report.html");

/*
		JSONObject item = new JSONObject();

		item.put("Testname", "Login Test");

		item.put("TestDescription", "If successful, Login goes to homepage");

		item.put("TestResult", "false");

		 

		



        res.getWriter().append(String.valueOf(item));*/


    }



	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		

	}

}