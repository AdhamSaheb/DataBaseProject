package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static  Connection connection;

	public DataBaseConnection() throws SQLException, ClassNotFoundException {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
	}

	public static void startConnection()  {
		 try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/mydb", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ResultSet read(String sql) throws SQLException {
		startConnection();
		Statement statement = connection.createStatement();

		// Execute a statement
		ResultSet resultSet = statement.executeQuery(sql);
		
		return resultSet;
	}
	
	public static int write(String sql) throws SQLException{
		startConnection();
		Statement statement = connection.createStatement();
		int x = statement.executeUpdate(sql);
		connection.close();
		connection = null;
		return x;
	
	}
	
	public static int delete(String sql) throws SQLException{
		startConnection();
		Statement statement = connection.createStatement();
		int x = statement.executeUpdate(sql);
		connection.close();
		connection = null;
		return x;
	}
	
	public static int update(String sql) throws SQLException{
		startConnection();
		Statement statement = connection.createStatement();
		
		int x = statement.executeUpdate(sql);
		connection.close();
		connection = null;
		return x;
	}

	

	
}