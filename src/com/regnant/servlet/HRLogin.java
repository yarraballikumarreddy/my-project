package com.regnant.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HRLogin
 */
@WebServlet("/HRLogin")
public class HRLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HRLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
          String id=request.getParameter("id");
	      String password=request.getParameter("password");  
          
	      ServletContext sc=getServletContext();
	      String hrid="admin";
	      String hrpassword="admin";
	      sc.setAttribute("id", hrid);
	      sc.setAttribute("password", hrpassword);
	      
	      if(hrid.equals(id) && hrpassword.equals(password))
	      {
              HttpSession se=request.getSession();	    	  
	    	  se.setAttribute("HRid", hrid);
	    	  se.setAttribute("HRpassword", hrpassword);
	    	  request.getRequestDispatcher("HRHomePage.html").forward(request, response);
	      }
	      else 
	      {
	    	  request.getRequestDispatcher("ErrorPage.html").forward(request, response);  
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
