package request;
import java.io.IOException;



import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import request.RequestHelper;

 class TG_Servlet extends HttpServlet {





	public static JSONObject item = new JSONObject();



	public TG_Servlet() {

		super();

	}





    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {



		

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

    	RequestHelper.process();
    	
    	/*Add request wait if test is taking time
    	 * try {
			request.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//request.getRequestDispatcher("C:\\my_git_repos\\TG_pro\\test-output\\emailable-report.html").include(request, response);
		response.sendRedirect("/TG_pro/test-output/emailable-report.html");
		 	

		/*item.put("Testname", "Login Test");



		item.put("TestDescription", "If successful, Login goes to homepage");



		item.put("TestResult", "false"); 

		

		res.getWriter().append(String.valueOf(item));*/



	}




	@Override



	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {







    }

		



}
 