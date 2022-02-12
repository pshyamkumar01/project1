package com.shyam.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shyam.dao.Classdao;
import com.shyam.dao.Studentdao;
import com.shyam.dao.Teacherdao;
import com.shyam.model.ClassGrade;
import com.shyam.model.Student;
import com.shyam.model.Teacher;


public class StudentFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public StudentFormServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	PrintWriter out = response.getWriter();
		response.setContentType("text/html");
    	
    	String form = request.getParameter("form");
    	
    	switch(form)
    	{
    	case "studentform":
		    	String studentid = request.getParameter("studentid");
		    	String firstName = request.getParameter("firstname");
		    	String lastName = request.getParameter("lastname");
		    	String clsid = request.getParameter("classid");
		    	
		    	Student student = new Student(studentid, firstName, lastName, clsid);
		    	
		    	Studentdao studentdao = new Studentdao();
		    	
		    	String studentresult = studentdao.insertStudent(student);
		    	
		    	
				out.println("<html>");
				out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style></head>");
				out.println("<form action = 'StudentAssignForm.jsp' method = 'post'>");
				out.println("<input type = 'submit' value = 'Back'>");
				out.println("</form>");
				out.println("</head>");
				out.println("<body>");
				out.println("<form action = 'actionServlet'><button type = 'submit' name = 'Action' value = 'showassignedstudentlist'>View Student's Assigned List</button></form>");
				out.println("</body></html>");
		    	
		    	
		    	response.getWriter().print(studentresult);
		    	break;
		    	
    	case "teacherform":
    		
    		String teacherid = request.getParameter("teacherid");
    		String teachername = request.getParameter("teachername");
    		String subject = request.getParameter("subject");
    		String classid = request.getParameter("class");

    		Teacher teacher = new Teacher(teacherid, teachername, subject, classid);
    		
    		Teacherdao teacherdao = new Teacherdao();
    		String teacherresult = teacherdao.insertTeacher(teacher);
    		
    		out.println("<html>");
			out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style></head>");
			out.println("<form action = 'TeacherAssignForm.jsp' method = 'post'>");
			out.println("<input type = 'submit' value = 'Back'>");
			out.println("</form>");
			out.println("</head>");
			out.println("<body>");
			out.println("<form action = 'actionServlet'><button type = 'submit' name = 'Action' value = 'showassignedteacherlist'>View Teacher's Assigned List</button></form>");
			out.println("</body></html>");

			response.getWriter().print(teacherresult);
    		break;
    		
    		default:
    			
    			String classroomid = request.getParameter("classid");
        		String subjectname = request.getParameter("subject");

        		ClassGrade classGrade = new ClassGrade(classroomid, subjectname);
        		
        		Classdao classdao = new Classdao();
        		String classresult = classdao.insertClass(classGrade);
        		
        		out.println("<html>");
    			out.println("<head><style>body {background-color: #92a8d1;}  table {border-collapse: collapse; width: 100%;} th, td {padding: 8px; text-align: left; border-bottom: 1px solid #DDD;} tr:hover {background-color: #D6EEEE;} </style>");
    			
    			out.println("<form action = 'ClassAssignForm.jsp' method = 'post'>");
    			out.println("<input type = 'submit' value = 'Back'>");
    			out.println("</form>");
    			out.println("</head>");
    			out.println("<body>");
    			out.println("<form action = 'actionServlet'><button type = 'submit' class ='btn btn-primary' name = 'Action' value = 'showassignedclasslist'>View Class Assigned List</button></form>");
    			out.println("</body></html>");

    			response.getWriter().print(classresult);
    			
    			break;
    	}
    	
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
