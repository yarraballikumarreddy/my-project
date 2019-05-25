package com.regnant.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.regnant.db.CRUDOperations;
import com.regnant.db.EmployeeContact;
import com.regnant.db.EmployeeEducational;
import com.regnant.db.EmployeePersonal;
import com.regnant.db.EmployeeProfessional;

/**
 * Servlet implementation class SearchEmployee
 */
@WebServlet("/SearchEmployee")
public class SearchEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//same servlet is used for both HR retrive employee details page and Employee view his profile  
	     String employeeId= request.getParameter("employeeid");
	  //   System.out.println(employeeId);
	     
	    String number=request.getParameter("number");
	    System.out.println(number);
	     EmployeePersonal ep=CRUDOperations.searchEmployeePersonal(employeeId);
	     
	     if(ep.employeeId==null) {
	    	 request.getRequestDispatcher("error.html").forward(request, response);
	     }
	     else {
	     
	     

	     request.setAttribute("EmployeePersonal", ep);
	     
	     List<EmployeeContact> contactlist=CRUDOperations.searchEmployeeContact(employeeId) ; 
	     request.setAttribute("EmployeeContact", contactlist);   
	     
	     EmployeeEducational ee= CRUDOperations.searchEmployeeEducation(employeeId);
	     request.setAttribute("EmployeeEducational",ee);
	     
	     EmployeeProfessional epro=CRUDOperations.searchEmployeeProfessional(employeeId);
	     request.setAttribute("EmployeeProfessional", epro);
	     
	     
	     if(number==null)
	    	 
	     {	
	    	 
	    	 System.out.println("HR page");
	    	 request.getRequestDispatcher("EmployeeDetailsRetrivePage.jsp").forward(request, response);
	    	 
		 }
	   
	 
	     else 
		 {
	    	 System.out.println("Employee page");   
	    	 request.getRequestDispatcher("ViewEmployeeProfile.jsp").forward(request, response);
		
		  }
		
	}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
