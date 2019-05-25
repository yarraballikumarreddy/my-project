package com.regnant.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.regnant.db.CRUDOperations;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	     String formnumber=request.getParameter("formnumber");
	     System.out.println(formnumber);
	     int no=Integer.parseInt(formnumber);
	     if(no==1)
	     {
	    	 String employeeid=request.getParameter("EMPLOYEEID");
	    	 System.out.println(employeeid);
	    	 String columnName= request.getParameter("EMPLOYEE PERSONAL DETAILS"); 
	    	 System.out.println(columnName);
	    	 String updatingValue=request.getParameter("updatedvalue");
	         System.out.println(updatingValue);
	         String tableName="employee_personal_data";
	         int x= CRUDOperations.updateEmployeeDetails(employeeid,columnName,updatingValue,tableName);
	         if(x==0)
	         {
	        	request.getRequestDispatcher("Error.html").forward(request, response); 
	         }
	         else
	         {
	        	 request.getRequestDispatcher("success.html").forward(request, response); 
	         }
	     }
	     else if(no==2)
	     {
	    	 String employeeid=request.getParameter("EMPLOYEEID");
	    	 System.out.println(employeeid);
	    	 String columnName= request.getParameter("EMPLOYEE CONTACT DETAILS"); 
	    	 System.out.println(columnName);
	    	 String updatingValue=request.getParameter("updatedvalue");
	         System.out.println(updatingValue);
	         String tableName="employee_contact_data";
	         int x= CRUDOperations.updateEmployeeDetails(employeeid,columnName,updatingValue,tableName);
	         if(x==0)
	         {
	        	request.getRequestDispatcher("Error.html").forward(request, response); 
	         }
	         else
	         {
	        	 request.getRequestDispatcher("success.html").forward(request, response); 
	        	 
	         }
	     }
	     else if(no==3)
	     {
	    	 String employeeid=request.getParameter("EMPLOYEEID");
	    	 System.out.println(employeeid);
	    	 String columnName= request.getParameter("EMPLOYEE EDUCATIONAL DETAILS"); 
	    	 System.out.println(columnName);
	    	 String updatingValue=request.getParameter("updatedvalue");
	         System.out.println(updatingValue);
	         int x= CRUDOperations.updateEmployeeEducational(employeeid, columnName, updatingValue);
	         if(x==0)
	         {
    	        	request.getRequestDispatcher("Error.html").forward(request, response); 
    	     }
	         else
   	         {
	        	   request.getRequestDispatcher("success.html").forward(request, response);         	 
	    	  }
	     }
	     else if(no==4)
	     {
	    	 String employeeid=request.getParameter("EMPLOYEEID");
	    	 System.out.println(employeeid);
	    	 String columnName= request.getParameter("EMPLOYEE PROFFESIONAL DETAILS"); 
	    	 System.out.println(columnName);
	    	 String updatingValue=request.getParameter("updatedvalue");
	         System.out.println(updatingValue);
	         String tableName="employee_professional_data";
	         int x= CRUDOperations.updateEmployeeDetails(employeeid,columnName,updatingValue,tableName);
	         if(x==0)
	         {
	        	request.getRequestDispatcher("Error.html").forward(request, response); 
	         }
	         else
	         {
	        	 request.getRequestDispatcher("success.html").forward(request, response); 
	        	 
	         }
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
