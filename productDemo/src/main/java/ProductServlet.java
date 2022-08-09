import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String id = request.getParameter("pname");
		System.out.println(id);
		ArrayList<String> productnames = new ArrayList<String>(4);
		
		productnames.add("books");
		productnames.add("mobiles");
		productnames.add("cloths");
		productnames.add("utensils");
		
		request.setAttribute("Product_Name", id);
		if(id.equals("books")) {
			RequestDispatcher rd = request.getRequestDispatcher("/books.jsp");
			rd.forward(request, response);
		}else if(id.equals("mobiles")) {
			RequestDispatcher rd = request.getRequestDispatcher("/mobiles.jsp");
			rd.forward(request, response);
		}else if(id.equals("cloths")) {
			RequestDispatcher rd = request.getRequestDispatcher("/cloths.jsp");
			rd.forward(request, response);
		}else if(id.equals("utensils")) {
			RequestDispatcher rd = request.getRequestDispatcher("/utensils.jsp");
			rd.forward(request, response);
		}else {
			
			pw.write("<p>No such products availible <br> <a href=\"index.jsp\">Home</a></p>");
		}
		
	}

}
