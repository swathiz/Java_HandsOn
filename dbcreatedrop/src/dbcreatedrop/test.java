package dbcreatedrop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test {

	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "root");
			System.out.println("DB Connection initilized");
			statement = connection.createStatement();
			String sql = "CREATE TABLE emp" +
	                   "(id INTEGER not NULL, " +
	                   " fname VARCHAR(255), " + 
	                   " lname VARCHAR(255), " + 
	                   " age INTEGER, " + 
	                   " PRIMARY KEY ( id ))"; 
			 statement.executeUpdate(sql);
	         System.out.println("Created table in given database...");
	         ResultSet resultSet = statement.executeQuery("select * from emp");
				while (resultSet.next()) {				
					System.out.println(resultSet.getInt(1) + ", " + resultSet.getString(2) + ", " + resultSet.getString(3) + ", " + resultSet.getInt(4));
				}
				System.out.println("employee table data");
				statement.executeUpdate("drop table emp");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally  {
			try {
				statement.close();
				connection.close();
				System.out.println("DB Connection closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
