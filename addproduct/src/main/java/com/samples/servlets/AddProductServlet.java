package com.samples.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addProductServlet")
public class AddProductServlet extends HttpServlet {
	
	Connection connection;
	
	@Override
	public void init(ServletConfig config) throws ServletException {

		try {
			System.out.println("AddServlet init");
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dburl"),
					context.getInitParameter("dbuser"), context.getInitParameter("dbpassword"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String productname = request.getParameter("productname");
		String price = request.getParameter("price");
		String sector = request.getParameter("sector");
		
		try (PreparedStatement statement = connection.prepareStatement("insert into prod values (?,?,?)");) {

			// resultset = read from db where email = 'x'
			// if resultset.hasnext() { pw.write("User already exists"); }
			
			statement.setString(1, productname);
			
			statement.setString(2, price);
			statement.setString(3, sector);

			int rowsInserted = statement.executeUpdate();
			System.out.println("Number of rows inserted: " + rowsInserted);

			PrintWriter pw = response.getWriter();
			pw.write("Product Details Successfully added");
			pw.write("<p><a href=\"index.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void destroy() {
		try {
			System.out.println("AddUserSevlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
