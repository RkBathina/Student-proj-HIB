package com.dxc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.dao.UserDAO;
import com.dxc.service.UserServiceImpl;


/**
 * Servlet implementation class LoginValidationServlet
 */
public class LoginValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(UserServiceImpl.validate(username, password))
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("un", username);
			RequestDispatcher rd = request.getRequestDispatcher("Modules.jsp");
			rd.forward(request, response);
		}
		
	}
/*	private void showLoginForm(HttpServletResponse response, boolean error) throws IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Login Page</title>");
		out.println("</head>");
		out.println("<body>");
		if(error)
		{
			out.println("<h2> Invalid Username/Password or Both </h2>" );
		}
		out.println("<form method=\"post\">");
		out.println("Username :<input type=\"text\" name=\"username\"><br>");
		out.println("Password :<input type=\"password\" name=\"password\"><br>");
		out.println("<input type=\"submit\" value=\"login\"><br>");
		out.println("<input type=\"reset\" value=\"cancel\"><br>");
		out.println("</form>");
		out.println("</body>");
		out.println("</head>");
		
		out.close();
		
	}*/

}
