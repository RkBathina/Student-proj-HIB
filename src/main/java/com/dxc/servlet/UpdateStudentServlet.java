package com.dxc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.beans.Student1;
import com.dxc.dao.StudentDAO;
//import com.dxc.dao.StudentJdbcDAO;
import com.dxc.service.StudentServiceImpl;

/**
 * Servlet implementation class UpdateStudentServlet
 */
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String dob = request.getParameter("dob");
		//String strdob = request.getParameter("strdob");
		//java.util.Date dd = request.getParameter("dob");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		try {
			Student1 s=new Student1(id, name, dob, email, mobile);
			StudentServiceImpl studentServiceImpl = new StudentServiceImpl();
			if(studentServiceImpl.edit(s))
			{
				 session=request.getSession(true);
				RequestDispatcher r=request.getRequestDispatcher("DisplayStudents.jsp");
				r.forward(request, response);
			}
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
