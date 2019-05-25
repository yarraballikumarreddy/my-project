package com.regnant.servlet;

import java.io.IOException;
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
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		EmployeePersonal ep=new EmployeePersonal();
		EmployeeContact ec=new EmployeeContact();
		EmployeeEducational ee=new EmployeeEducational();
		EmployeeProfessional epro=new EmployeeProfessional();

	  String employeeId=request.getParameter("EMPLOYEEID");
      ep.employeeId=employeeId;	 
	  System.out.println(employeeId);
	  String firstname=request.getParameter("firstname");  
	  ep.firstname=firstname;
	  System.out.println(firstname);
	  String lastname=request.getParameter("lastname");  
      ep.lastname=lastname;   	  
	  System.out.println(lastname);
	  String dateofbirth=request.getParameter("dateofbirth");  
	  ep.dateofbirth=dateofbirth;  
	  System.out.println(dateofbirth);
	  String gender=request.getParameter("gender");  
      ep.gender=gender;	  
	  System.out.println(gender);
	  String maritalStatus=request.getParameter("MARITALSTATUS");  
	  ep.maritalStatus=maritalStatus;
	  System.out.println(maritalStatus);
	  String fatherName=request.getParameter("FATHER NAME");  
	  ep.fatherName=fatherName;
	  System.out.println(fatherName);
	  String motherName=request.getParameter("MOTHER NAME");  
	  ep.motherName=motherName;
	  System.out.println(motherName);
	  String nationality=request.getParameter("Nationality");  
	  ep.nationality=nationality;
	  System.out.println(nationality);
	  String language[]=request.getParameterValues("language"); 
	  ep.language=language;
//	  for(int i=0;i<language.length;i++)
//		    System.out.println(language[i]);
	  String bloodGroup=request.getParameter("BLOOD GROUP");  
	  ep.bloodGroup=bloodGroup;
	  System.out.println(bloodGroup);
	  String phoneNumber=request.getParameter("phonenumber");  
	  ep.phoneNumber=phoneNumber;
	  System.out.println(phoneNumber);
	  String email=request.getParameter("EMAIL");  
	  ep.email=email;
	  System.out.println(email);
	  String password=request.getParameter("password");
	  ep.password=password;
	  System.out.println(password);
	  
	  System.out.println("---------------------------------");
	  System.out.println("EMPLOYEE CONTACT DETAILS");
	  
	  String homenumber=request.getParameter("homenumber");  
	  ec.homenumber=homenumber;
	  System.out.println(homenumber);
	  String address=request.getParameter("ADDRESS");
	  ec.address=address;
	  System.out.println(address);
	  String city=request.getParameter("CITY");
	  ec.city=city;
	  System.out.println(city);
	  String state=request.getParameter("State");
	  ec.state=state;
	  System.out.println(state);
	  String country=request.getParameter("Country");
	  ec.country=country;
	  System.out.println(country);
	  String pincode=request.getParameter("pincode");
	  ec.pincode=pincode;
	  System.out.println(pincode);
	  
	  System.out.println("--------------------------------");
	  System.out.println("EMPLOYEE EDUCATIONAL DETAILS :1");
	  
	  String ssc=request.getParameter("SSC");
	  ee.ssc=ssc;
	  System.out.println(ssc);
	  String schoolName=request.getParameter("Name of School");
	  ee.schoolName=schoolName;
	  System.out.println(schoolName);
	  String sscBoard=request.getParameter("sscBoard");
	  ee.sscBoard=sscBoard;
	  System.out.println(sscBoard);
	  String sscpercentage=request.getParameter("PERCENTAGE");
	  ee.sscpercentage=sscpercentage;
	  System.out.println(sscpercentage);
	  String sscYearOfPassing=request.getParameter("YEAR OF PASSING");
	  ee.sscYearOfPassing=sscYearOfPassing;
	  System.out.println(sscYearOfPassing);
	  
	  System.out.println("--------------------------------");
	  System.out.println("EMPLOYEE EDUCATIONAL DETAILS :2");
	  
	  String intermediate=request.getParameter("INTERMEDIATE");  
	  ee.intermediate=intermediate;
	  System.out.println(intermediate);
	  String collegeName=request.getParameter("Name of College1");
	  ee.collegeName=collegeName;
	  System.out.println(collegeName);
	  String intermediateBoard=request.getParameter("INTERMEDIATEBoard");
	  ee.intermediateBoard=intermediateBoard;
	  System.out.println(intermediateBoard);
	  String intermediatePercentage=request.getParameter("PERCENTAGE2");
	  ee.intermediatePercentage=intermediatePercentage;
	  System.out.println(intermediatePercentage);
	  String intermediateYearOfPassing=request.getParameter("YEAR OF PASSING2");
	  ee.intermediateYearOfPassing=intermediateYearOfPassing;
	  System.out.println(intermediateYearOfPassing);
	  
	  System.out.println("--------------------------------");
	  System.out.println("EMPLOYEE EDUCATIONAL DETAILS :3");
	  
	  String graduate=request.getParameter("GRADUATE");  
	  ee.graduate=graduate;
	  System.out.println(graduate);
	  String collegeName2=request.getParameter("Name of College2");
	  ee.collegeName2=collegeName2;
	  System.out.println(collegeName2);
	  String graduateUniversity=request.getParameter("GRADUATEUniversity");
	  ee.graduateUniversity=graduateUniversity;
	  System.out.println(graduateUniversity);
	  String graduatePercentage=request.getParameter("PERCENTAGE3");
	  ee.graduatePercentage=graduatePercentage;
	  System.out.println(graduatePercentage);
	  String graduateYearOfPassing=request.getParameter("YEAR OF PASSING3");
	  ee.graduateYearOfPassing=graduateYearOfPassing;
	  System.out.println(graduateYearOfPassing);
	  
	  System.out.println("--------------------------------");
	  System.out.println("EMPLOYEE EDUCATIONAL DETAILS :4");
	  
	  String masters=request.getParameter("MASTERS");  
	  ee.masters=masters;
	  System.out.println(masters);
	  String collegeName3=request.getParameter("Name of College3");
	  ee.collegeName3=collegeName3;
	  System.out.println(collegeName3);
	  String mastersUniversity=request.getParameter("MASTERSUniversity");
	  ee.mastersUniversity=mastersUniversity;
	  System.out.println(mastersUniversity);
	  String mastersPercentage=request.getParameter("PERCENTAGE4");
	  ee.mastersPercentage=mastersPercentage;
	  System.out.println(mastersPercentage);
	  String mastersYearOfPassing=request.getParameter("YEAR OF PASSING4");
	  ee.mastersYearOfPassing=mastersYearOfPassing;
	  System.out.println(mastersYearOfPassing);
	  
	  System.out.println("--------------------------------");
	  System.out.println("EMPLOYEE EDUCATIONAL DETAILS :phd");
	  
	  String phdCourse=request.getParameter("phdCourse");  
	  ee.phdCourse=phdCourse;
	  System.out.println(phdCourse);
	  String collegeName4=request.getParameter("Name of College4");
	  ee.collegeName4=collegeName4;
	  System.out.println(collegeName4);
	  String phdUniversity=request.getParameter("phdUniversity");
	  ee.phdUniversity=phdUniversity;
	  System.out.println(phdUniversity);
	  String phdPercentage=request.getParameter("PERCENTAGE5");
	  ee.phdPercentage=phdPercentage;
	  System.out.println(phdPercentage);
	  String phdYearOfPassing=request.getParameter("YEAR OF PASSING5");
	  ee.phdYearOfPassing=phdYearOfPassing;
	  System.out.println(phdYearOfPassing);
	  
	  System.out.println("--------------------------------");
	  System.out.println("EMPLOYEE PROFFESIONAL DETAILS:");
	  
	  String dateofjoining=request.getParameter("DATE OF JOINING");  
	  epro.dateofjoining=dateofjoining;
	  System.out.println(dateofjoining);
	  String dateofrelieving=request.getParameter("DATE OF RELIEVING");  
	  epro.dateofrelieving=dateofrelieving;
	  System.out.println(dateofrelieving);
	  String jobtitle=request.getParameter("JOB TITLE");
	  epro.jobtitle=jobtitle;
	  System.out.println(jobtitle);
	  String salary=request.getParameter("SALARY");
	  epro.salary=salary;
	  System.out.println(salary);
	  String workexperience=request.getParameter("WORKEXPERIENCE");
	  epro.workexperience=workexperience;
	  System.out.println(workexperience);
	  String workexperiencein=request.getParameter("WORK EXPERIENCE IN FEILD");
	  
	  System.out.println(workexperiencein);
	  String nextcompany=request.getParameter("next company");
	  epro.nextcompany=nextcompany;
	  System.out.println(nextcompany);
	  
	  CRUDOperations.addEmployee(ep, ec, ee, epro);
	  request.getRequestDispatcher("AddEmployeeDetailsPage.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
