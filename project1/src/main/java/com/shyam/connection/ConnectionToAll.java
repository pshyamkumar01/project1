package com.shyam.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionToAll {
	
	public  Connection getConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/academy", "root", "maltigoED42@ED42");
			
			return connection;
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
