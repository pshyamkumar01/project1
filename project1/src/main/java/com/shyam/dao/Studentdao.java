package com.shyam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shyam.connection.ConnectionToAll;
import com.shyam.model.Student;

public class Studentdao {

	public String insertStudent(Student student)
	{
			ConnectionToAll connectionToAll = new ConnectionToAll();
		
			Connection connection = connectionToAll.getConnection();
			String result = "Data Entered Successfully";
			String query = "insert into studentassign values(?,?,?,?)";
			
			PreparedStatement preparedStatement;
			try
			{
			preparedStatement = connection.prepareStatement(query);
			
			preparedStatement.setString(1, student.getStudentid());
			preparedStatement.setString(2, student.getFirstName());
			preparedStatement.setString(3, student.getLastName());
			preparedStatement.setString(4, student.getClsid());
			
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
