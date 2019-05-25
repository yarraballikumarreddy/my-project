package com.regnant.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.regnant.db.CRUDOperations;

/**
 * Servlet implementation class EmployeeLogin
 */
@WebServlet("/EmployeeLogin")
public class EmployeeLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	   String id= request.getParameter("id");
	   String password= request.getParameter("password");
	   boolean x=CRUDOperations.loginvalidation(id, password);
	   if (x == true) 
	   {	
			HttpSession se =request.getSession();
			se.setAttribute("id", id);
			se.setAttribute("password", password);
			request.getRequestDispatcher("EmployeeHomePage.jsp").forward(request, response);
	   }
	   else 
	   {
		   request.getRequestDispatcher("Loginfail.html").forward(request, response); 
	   }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
