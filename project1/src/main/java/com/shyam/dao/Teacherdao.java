package com.shyam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.shyam.connection.ConnectionToAll;
import com.shyam.model.Teacher;

public class Teacherdao {

	public String insertTeacher(Teacher teacher)
	{
		ConnectionToAll connectionToAll = new ConnectionToAll();
		Connection connection = connectionToAll.getConnection();
		String result = "Data Entered Successfully";
		String query = "insert into teacherassign values(?,?,?,?)";
		
		PreparedStatement preparedStatement;
		try {
			
				preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setString(1, teacher.getTeacherid());
				preparedStatement.setString(2, teacher.getTeachername());
				preparedStatement.setString(3, teacher.getSubject());
				preparedStatement.setString(4, teacher.getClassid());
				
				preparedStatement.executeUpdate();
				
				preparedStatement.close();
				connection.close();
			
			} catch (SQLException e)
			{
				e.printStackTrace();
				result = "Data submission Failed";
			}
		
		return result;
	}
}
