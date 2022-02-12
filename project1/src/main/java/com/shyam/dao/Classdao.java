package com.shyam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shyam.connection.ConnectionToAll;
import com.shyam.model.ClassGrade;

public class Classdao {
	public String insertClass(ClassGrade classGrade)
	{
			ConnectionToAll connectionToAll = new ConnectionToAll();
		
			Connection connection = connectionToAll.getConnection();
			String result = "Data Entered Successfully";
			String query = "insert into classassign values(?,?)";
			
			PreparedStatement preparedStatement;
			try
			{
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, classGrade.getClassid());
			preparedStatement.setString(2, classGrade.getSubject());
			
			preparedStatement.executeUpdate();
			
			preparedStatement.close();
			connection.close();
			
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
				result = "Data submission failed";
			}
			return result;
	}
}
