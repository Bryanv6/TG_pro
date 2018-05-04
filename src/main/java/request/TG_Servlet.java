package request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bryanvillegas on 5/4/18.
 */
public class TG_Servlet extends HttpServlet {

    public TG_Servlet(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        pw.println("<html>\r\n" +
                "<body>\r\n" +
                "<h2>This text is from TG_Servlet!</h2>\r\n" +
                "</body>\r\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

    }
}
