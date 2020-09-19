package com.dxc.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.beans.Exam;
import com.dxc.service.ExamServiceImpl;

/**
 * Servlet implementation class EditExamServlet
 */
public class EditExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditExamServlet() {
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
		HttpSession session = request.getSession();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		Exam exam = new Exam(eid, ename);
		ExamServiceImpl examServiceImpl = new ExamServiceImpl();
		if (examServiceImpl.edit(exam)) 
		{
			session = request.getSession(true);
			RequestDispatcher rd = request.getRequestDispatcher("DisplayExams.jsp");
			rd.forward(request, response);
		}
	}

}
