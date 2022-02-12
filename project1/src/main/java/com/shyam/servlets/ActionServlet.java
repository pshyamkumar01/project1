package com.shyam.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shyam.connection.ConnectionToAll;


public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     ConnectionToAll connectionToAll = new ConnectionToAll();
	
    
    public ActionServlet() {
        super();
    }

    
    private void getStudentList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforstudentlist = "select * from student";
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforstudentlist);
			
			
			out.println("<html>");
			out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
			out.println("<form action = 'Admin.jsp' method = 'post'>");
			out.println("<input type = 'submit' value = 'Back'>");
			out.println("</form>");
			
			out.println("<form action = 'actionServlet'><button type = 'submit' name = 'Action' value = 'showassignedstudentlist'>View Assigned List</button></form>");
			out.println("</head>");
			
			out.println("<body><center>");
			out.println("<h1>STUDENT List</h1>");
			out.println("<table style = 'width:100%'>");
			out.println("<tr><th>Student ID</th><th>First Name</th><th>Last Name</th><th>Student Age</th><th>Class ID</th><th>Assign Student</th></tr>");
			
			
			
			while(resultSet.next())
			{
				String studentid = resultSet.getString(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				int age = resultSet.getInt(4);
				String clsid = resultSet.getString(5);
				
				out.println("");
				out.println("");

				
				out.println("<tr><td>"+studentid+"</td><td>"+firstName+"</td><td>"+lastName+"</td><td>"+age+"</td><td>"+clsid+"</td><td><a href = 'StudentAssignForm.jsp'>Assign</a></td></tr>");
				
			}
			
			
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    }
    
    
    private void getAssignedStudentList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforassignedstudentlist = "select * from studentassign";
    	
    	
		out.println("<html>");
		out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style></head>");
    	
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforassignedstudentlist);
			boolean ans = resultSet.next();
			if(ans == false)
			{
				out.println("<br>");
				out.println("No Records Found");
				out.println("<form action = 'Admin.jsp' method = 'post'>");
				out.println("<input type = 'submit' value = 'Back'>");
				out.println("</form>");
			}
			else
			{
					
					out.println("<form action = 'Admin.jsp' method = 'post'>");
					out.println("<input type = 'submit' value = 'Back'>");
					out.println("</form>");
					out.println("<body><center>");
					out.println("<h1>Assigned Student List</h1>");
					out.println("<table style = 'width:100%'>");
					out.println("<tr><th>Student ID</th><th>First Name</th><th>Last Name</th><th>Class ID</th></tr>");
					
					do
					{
						String studentid = resultSet.getString(1);
						String firstName = resultSet.getString(2);
						String lastName = resultSet.getString(3);
						String clsid = resultSet.getString(4);
						
						out.println("");
						out.println("");
		
						
						out.println("<tr><td>"+studentid+"</td><td>"+firstName+"</td><td>"+lastName+"</td><td>"+clsid+"</td></tr>");
						
					}while(resultSet.next());
			
			
				resultSet.close();
				statement.close();
				connection.close();
			}
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    	
    }
    
    
    private void getTeacherList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforteacherlist = "select * from teacher";
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforteacherlist);
			
			
			out.println("<html>");
			out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
			out.println("<form action = 'Admin.jsp' method = 'post'>");
			out.println("<input type = 'submit' value = 'Back'>");
			out.println("</form>");
			
			out.println("<form action = 'actionServlet'><button type = 'submit' name = 'Action' value = 'showassignedteacherlist'>View Assigned List</button></form>");
			out.println("</head>");
			
			out.println("<body><center>");
			out.println("<h1>Teacher List</h1>");
			out.println("<table style = 'width:100%'>");
			out.println("<tr><th>Teacher ID</th><th>First Name</th><th>Last Name</th><th>Teacher Age</th><th>Assign Teacher</th></tr>");
			
			
			
			while(resultSet.next())
			{
				String teacherid = resultSet.getString(1);
				String firstName = resultSet.getString(2);
				String lastName = resultSet.getString(3);
				int age = resultSet.getInt(4);
				
				out.println("");
				out.println("");

				
				out.println("<tr><td>"+teacherid+"</td><td>"+firstName+"</td><td>"+lastName+"</td><td>"+age+"</td><td><a href = 'TeacherAssignForm.jsp'>Assign</a></td></tr>");
				
			}
			
			
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    }
    
    
    private void getAssignedTeacherList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforassignedstudentlist = "select * from teacherassign";
    	
    	
		out.println("<html>");
		out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style></head>");
    	
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforassignedstudentlist);
			boolean ans = resultSet.next();
			if(ans == false)
			{
				out.println("<br>");
				out.println("No Records Found");
				out.println("<form action = 'Admin.jsp' method = 'post'>");
				out.println("<input type = 'submit' value = 'Back'>");
				out.println("</form>");
			}
			else
			{
					
					out.println("<form action = 'Admin.jsp' method = 'post'>");
					out.println("<input type = 'submit' value = 'Back'>");
					out.println("</form>");
					out.println("<body><center>");
					out.println("<h1>Assigned Teacher's List</h1>");
					out.println("<table style = 'width:100%'>");
					out.println("<tr><th>Student ID</th><th>First Name</th><th>Last Name</th><th>Class ID</th></tr>");
					
					do
					{
						String studentid = resultSet.getString(1);
						String firstName = resultSet.getString(2);
						String lastName = resultSet.getString(3);
						String clsid = resultSet.getString(4);
						
						out.println("");
						out.println("");
		
						
						out.println("<tr><td>"+studentid+"</td><td>"+firstName+"</td><td>"+lastName+"</td><td>"+clsid+"</td></tr>");
						
					}while(resultSet.next());
			
			
				resultSet.close();
				statement.close();
				connection.close();
			}
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    	
    }
    
    
    
    private void getSubjectList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforsubjectlist = "select * from subject";
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforsubjectlist);
			
			
			out.println("<html>");
			out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
			out.println("<form action = 'Admin.jsp' method = 'post'>");
			out.println("<input type = 'submit' value = 'Back'>");
			out.println("</head>");
			
			out.println("<body><center>");
			out.println("<h1>Subject List</h1>");
			out.println("<table style = 'width:80%' border = '2'>");
			out.println("<tr><th>Subject ID</th><th>Subject Name</th></tr>");
			
			
			
			while(resultSet.next())
			{
				String subjectid = resultSet.getString(1);
				String subjectname = resultSet.getString(2);
				
				out.println("");
				out.println("");

				
				out.println("<tr><td>"+subjectid+"</td><td>"+subjectname+"</td></tr>");
				
			}
			
			
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    }
    
    
    private void getClassList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforclasslist = "select * from class";
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforclasslist);
			
			
			out.println("<html>");
			out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
			out.println("<form action = 'Admin.jsp' method = 'post'>");
			out.println("<input type = 'submit' value = 'Back'>");
			out.println("</form>");
			
			out.println("<form action = 'actionServlet'><button type = 'submit' name = 'Action' value = 'showassignedclasslist'>View Assigned List</button></form>");
			out.println("</head>");
			
			out.println("<body><center>");
			out.println("<h1>Class List</h1>");
			out.println("<table style = 'width:100%'>");
			out.println("<tr><th>Class ID</th><th>Section</th><th>Teacher ID</th><th>Subject ID</th><th>Assign Class for Subject</th></tr>");
			
			
			
			while(resultSet.next())
			{
				String classid = resultSet.getString(1);
				String section = resultSet.getString(2);
				String teacherid = resultSet.getString(3);
				String subjectid = resultSet.getString(4);
				
				out.println("");
				out.println("");

				
				out.println("<tr><td>"+classid+"</td><td>"+section+"</td><td>"+teacherid+"</td><td>"+subjectid+"</td><td><a href = 'ClassAssignForm.jsp'>Assign</a></td></tr>");
				
			}
			
			
			resultSet.close();
			statement.close();
			connection.close();
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    }
    
    
    private void getAssignedClassList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");

    	Connection connection = connectionToAll.getConnection();
    	
    	String queryforassignedstudentlist = "select * from classassign";
    	
    	
		out.println("<html>");
		out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
    	
    	
    	try
    	{
			Statement statement = connection.createStatement();
			
			ResultSet resultSet = statement.executeQuery(queryforassignedstudentlist);
			boolean ans = resultSet.next();
			if(ans == false)
			{
				out.println("<br>");
				out.println("No Records Found");
				out.println("<form action = 'Admin.jsp' method = 'post'>");
				out.println("<input type = 'submit' value = 'Back'>");
				out.println("</form>");
			}
			else
			{
					
					out.println("<form action = 'Admin.jsp' method = 'post'>");
					out.println("<input type = 'submit' value = 'Back'>");
					out.println("</form></head>");
					out.println("<body><center>");
					out.println("<h1>Class Assigned List</h1>");
					out.println("<table style = 'width:70%' border = '2'>");
					out.println("<tr><th>Class ID</th><th>Subject</th></tr>");
					
					do
					{
						String classid = resultSet.getString(1);
						String subject = resultSet.getString(2);
						
						out.println("");
						out.println("");
		
						
						out.println("<tr><td>"+classid+"</td><td>"+subject+"</td></tr>");
						
					}while(resultSet.next());
			
			
				resultSet.close();
				statement.close();
				connection.close();
			}
			
		} catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    	
    }
    
    private void getAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	PrintWriter out = response.getWriter();
    	ConnectionToAll connectionToAll = new ConnectionToAll();
    	Connection connection = connectionToAll.getConnection();
    	
    	String querytoviewall = "select s.studentid, s.firstName, s.lastName, section,"
    							+ " t.teacherid, t.firstName, t.lastName, c.subjid, sub.subjectName "
    							+ "from student s join class c  on s.clsid = c.classid"
    							+ " join teacher t on c.teachid = t.teacherid "
    							+ "join subject sub on c.subjid = sub.subjectid;";
    	
    	out.println("<html>");
		out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
    	
    	
    	
    	try {
    		
    			PreparedStatement preparedStatement = connection.prepareStatement(querytoviewall);
    			ResultSet resultSet = preparedStatement.executeQuery();
    			if(resultSet.next()==false)
    			{
    				out.println("<br>");
    				out.println("No Records Found");
    				out.println("<form action = 'Admin.jsp' method = 'post'>");
    				out.println("<input type = 'submit' value = 'Back'>");
    				out.println("</form>");
    			}
    			else
    			{
    				
    				out.println("<form action = 'Admin.jsp' method = 'post'>");
					out.println("<input type = 'submit' value = 'Back'>");
					out.println("</form></head>");
					out.println("<body><center>");
					out.println("<h1>List of All DATA</h1>");
					out.println("<table style = 'width:100%'>");
					out.println("<tr><th>Student ID</th><th>First Name</th><th>Last Name</th><th>Section</th><th>Teacher ID</th>"
								+ "<th>Teacher First Name</th><th>Teacher Last Name</th><th>Subject ID</th><th>Subject Name</th></tr>");
    				
    				do {
    					out.println("<tr><td>"+resultSet.getString(1)+"</td><td>"+resultSet.getString(2)+"</td><td>"
    							+resultSet.getString(3)+"</td><td>"+resultSet.getString(4)+"</td><td>"+resultSet.getString(5)+"</td><td>"
    							+resultSet.getString(6)+"</td><td>"+resultSet.getString(7)+"</td><td>"
    							+resultSet.getString(8)+"</td><td>"+resultSet.getString(9)+"</td></tr>");
    				}while(resultSet.next());
    			}
			}
    	catch (SQLException e) {
			e.printStackTrace();
		}
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		ActionServlet actionServlet = new ActionServlet();
		
		String Action = request.getParameter("Action");
		
		switch(Action)
		{
		case "studentlist":
			actionServlet.getStudentList(request, response);
			break;
			
		case "showassignedstudentlist":
			
			actionServlet.getAssignedStudentList(request, response);
			
			break;
			
		case "teacherlist":
			actionServlet.getTeacherList(request, response);
			break;
			
		case "showassignedteacherlist":
			actionServlet.getAssignedTeacherList(request, response);
			break;
			
		case "subjectlist":
			actionServlet.getSubjectList(request, response);
			break;
			
		case "classlist":
			actionServlet.getClassList(request, response);
			break;
			
		case "showassignedclasslist":
			actionServlet.getAssignedClassList(request, response);
			break;
			
			
			default:
				
				actionServlet.getAll(request, response);
				break;
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		doGet(request, response);
		
	}

}
