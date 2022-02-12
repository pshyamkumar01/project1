package com.shyam.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		if(username.equals("admin") && password.equals("admin"))
		{
			out.println("");
			request.getRequestDispatcher("Admin.jsp").include(request, response);
		}
		else
		{
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<body>");
			out.println("<p style = color:red>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Invalid Credentials Please Try Again!</p>");
			out.println("</body>");
			out.println("</html>");
			request.getRequestDispatcher("index.jsp").include(request, response);

		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		doGet(request, response);
	}

}