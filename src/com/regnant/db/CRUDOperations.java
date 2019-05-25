package com.regnant.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CRUDOperations 
{
    public static void addEmployee(EmployeePersonal ep,EmployeeContact ec,EmployeeEducational ee,EmployeeProfessional epro)
    { 
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
		    String insertQuery="insert into employee_personal_data values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		    PreparedStatement pstmt=conn.prepareStatement(insertQuery);
			pstmt.setString(1,ep.employeeId );
			pstmt.setString(2,ep.firstname );
			pstmt.setString(3,ep.lastname );
			pstmt.setString(4,ep.dateofbirth );
			pstmt.setString(5,ep.gender );
			pstmt.setString(6,ep.maritalStatus );
			pstmt.setString(7,ep.fatherName );
			pstmt.setString(8,ep.motherName );
			pstmt.setString(9,ep.nationality );
			pstmt.setString(10,ep.bloodGroup );
			pstmt.setString(11,ep.phoneNumber );
			pstmt.setString(12,ep.email );
			pstmt.setString(13,ep.password );
			ep.languageString=Arrays.toString(ep.language);
			pstmt.setString(14,ep.languageString );
			int x1=pstmt.executeUpdate();
    	    System.out.println("insert rows: "+x1);
    	    
    	    Statement stmt1=conn.createStatement();
    	    String insertQuery1 ="insert into employee_contact_data values('"+ep.employeeId+"','"+ec.homenumber+"','"
    	                          +ec.address+"','"+ec.city+"','"+ec.state+"','"+ec.country+"','"+ec.pincode+"')";
    	    int x2=stmt1.executeUpdate(insertQuery1);
    	    System.out.println("insert rows: "+x2);
    	    
    	   
    	    Statement stmt2=conn.createStatement();
    	    String insertQuery2 ="insert into employee_educational_qualifications_data values('"+ep.employeeId+"','"+ee.ssc+"','"
    	                          +ee.schoolName+"','"+ee.sscBoard+"','"+ee.sscYearOfPassing+"','"+ee.sscpercentage+"')";
    	    int x3=stmt2.executeUpdate(insertQuery2);
    	    System.out.println("insert rows: "+x3);
    	    
    	    Statement stmt3=conn.createStatement();
    	    String insertQuery3 ="insert into employee_educational_qualifications_data values('"+ep.employeeId+"','"+ee.intermediate+"','"
    	                          +ee.collegeName+"','"+ee.intermediateBoard+"','"+ee.intermediateYearOfPassing+"','"+ee.intermediatePercentage+"')";
    	    int x4=stmt3.executeUpdate(insertQuery3);
    	    System.out.println("insert rows: "+x4);
    	    
    	    Statement stmt4=conn.createStatement();
    	    String insertQuery4 ="insert into employee_educational_qualifications_data values('"+ep.employeeId+"','"+ee.graduate+"','"
    	                          +ee.collegeName2+"','"+ee.graduateUniversity+"','"+ee.graduateYearOfPassing+"','"+ee.graduatePercentage+"')";
    	    int x5=stmt4.executeUpdate(insertQuery4);
    	    System.out.println("insert rows: "+x5);
    	    
    	    if(!ee.masters.equals(""))
    	    {
	    	    Statement stmt5=conn.createStatement();
	    	    String insertQuery5 ="insert into employee_educational_qualifications_data values('"+ep.employeeId+"','"+ee.masters+"','"
	    	                          +ee.collegeName3+"','"+ee.mastersUniversity+"','"+ee.mastersYearOfPassing+"','"+ee.mastersPercentage+"')";
	    	    int x6=stmt5.executeUpdate(insertQuery5);
	    	    System.out.println("insert rows: "+x6);
    	    }
    	    
    	    if(!ee.phdCourse.equals("")) 
    	    {
	    	    Statement stmt6=conn.createStatement();
	    	    String insertQuery6 ="insert into employee_educational_qualifications_data values('"+ep.employeeId+"','"+ee.phdCourse+"','"
	    	                          +ee.collegeName4+"','"+ee.phdUniversity+"','"+ee.phdYearOfPassing+"','"+ee.phdPercentage+"')";
	    	    int x7=stmt6.executeUpdate(insertQuery6);
	    	    System.out.println("insert rows: "+x7);
    	    }
    	    
    	    Statement stmt7=conn.createStatement();
    	    String insertQuery7 ="insert into employee_professional_data values('"+ep.employeeId+"','"+epro.dateofjoining+"','"
    	                          +epro.dateofrelieving+"','"+epro.jobtitle+"','"+epro.salary+"','"+epro.workexperience+"','"+epro.nextcompany+"')";
    	    int x8=stmt7.executeUpdate(insertQuery7);
    	    System.out.println("insert rows: "+x8);
    	    
    	} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
    
    
    
    
    
    public static EmployeePersonal searchEmployeePersonal(String employeeId)
    {   
    	EmployeePersonal ep=new EmployeePersonal();
    	try 
    	{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
	        Statement stmt=conn.createStatement();
    	    ResultSet rs= stmt.executeQuery("select * from employee_personal_data  where EmployeeID='"+employeeId+"'");
    	  // EmployeePersonal ep=new EmployeePersonal();
    	   if( rs.next()) {
    	    ep.employeeId=rs.getString(1);    	
    	    ep.firstname=rs.getString(2);
    	    ep.lastname=rs.getString(3);
    	    ep.dateofbirth=rs.getString(4);
    	    ep.gender=rs.getString(5);
    	    ep.maritalStatus=rs.getString(6);
    	    ep.fatherName=rs.getString(7);
    	    ep.motherName=rs.getString(8);
    	    ep.nationality=rs.getString(9);
    	    ep.bloodGroup=rs.getString(10);
    	    ep.phoneNumber=rs.getString(11);
    	    ep.email=rs.getString(12);
    	    ep.password=rs.getString(13);
    	    ep.languageString=rs.getString(14);
    	               
    	   System.out.println(ep);
    	   return ep; 
    	   }
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ep;
    	
    }
    
    
    
    
    
    
    public static List searchEmployeeContact(String employeeId)
    {   
    	List<EmployeeContact> contactlist=new ArrayList<EmployeeContact>();
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
			Statement stmt=conn.createStatement();
			ResultSet rs1= stmt.executeQuery("select * from employee_contact_data  where EmployeeID='"+employeeId+"'");
    	   rs1.next();                                                                                                                                //while()
    	    {
    	    	EmployeeContact ec=new EmployeeContact();
               	
    	    	ec.homenumber=rs1.getString(2);
    	    	ec.address=rs1.getString(3);
    	    	ec.city=rs1.getString(4);
    	    	ec.state=rs1.getString(5);
    	    	ec.country=rs1.getString(6);
    	    	ec.pincode=rs1.getString(7);
    	    	contactlist.add(ec);
    	    	System.out.println(ec);
    	    }
    	    return contactlist;
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactlist;
    	
    }
    
    
    
    
    
    
    
    public static EmployeeEducational searchEmployeeEducation(String employeeId)
    {   
    	
    	EmployeeEducational ee=new EmployeeEducational();
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
			Statement stmt=conn.createStatement();
			ResultSet rs= stmt.executeQuery("select * from employee_educational_qualifications_data  where EmployeeID='"+employeeId+"'");
    	    rs.next();
    	    ee.ssc= rs.getString(2);
    	    ee.schoolName=rs.getString(3);
    	    ee.sscBoard= rs.getString(4);
    	    ee.sscYearOfPassing=rs.getString(5);
    	    ee.sscpercentage=rs.getString(6);
    	    rs.next();
    	    ee.intermediate= rs.getString(2);
    	    ee.collegeName=rs.getString(3);
    	    ee.intermediateBoard= rs.getString(4);
    	    ee.intermediateYearOfPassing=rs.getString(5);
    	    ee.intermediatePercentage=rs.getString(6);
            rs.next();   	
            ee.graduate= rs.getString(2);
    	    ee.collegeName2=rs.getString(3);
    	    ee.graduateUniversity= rs.getString(4);
    	    ee.graduateYearOfPassing=rs.getString(5);
    	    ee.graduatePercentage=rs.getString(6);
    	    if(rs.next())
    	    {
    	    	ee.masters= rs.getString(2);
        	    ee.collegeName3=rs.getString(3);
        	    ee.mastersUniversity= rs.getString(4);
        	    ee.mastersYearOfPassing=rs.getString(5);
        	    ee.mastersPercentage=rs.getString(6);	
    	    }
    	    if(rs.next())
    	    {
    	    	ee.phdCourse= rs.getString(2);
        	    ee.collegeName4=rs.getString(3);
        	    ee.phdUniversity= rs.getString(4);
        	    ee.phdYearOfPassing=rs.getString(5);
        	    ee.phdPercentage=rs.getString(6);	
    	    }    	    
    	    System.out.println(ee);
    	    return ee;
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ee;
    	
    }
    
    
    
    
    
    
    public static EmployeeProfessional searchEmployeeProfessional(String employeeId)
    {   
    	
    	EmployeeProfessional epro=new EmployeeProfessional();
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
			Statement stmt=conn.createStatement();
			ResultSet rs= stmt.executeQuery("select * from employee_professional_data  where EmployeeID='"+employeeId+"'");
    	    rs.next();
    	    epro.dateofjoining=rs.getString(2);    	    
    	    epro.dateofrelieving=rs.getString(3);    	    
    	    epro.jobtitle=rs.getString(4);    	    
    	    epro.salary=rs.getString(5);    	    
    	    epro.workexperience=rs.getString(6);    	    
    	    epro.nextcompany=rs.getString(7);    	    
    	    System.out.println(epro);
    	    return epro;
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return epro;
    	
    }
    
    
    
    
    
    
    
    
    public static int updateEmployeeDetails(String employeeId, String columnName, String updatingValue, String tableName )
    {   
    	int x=0;
    	try 
    	{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
	        Statement stmt=conn.createStatement();
    	    x= stmt.executeUpdate("UPDATE "+tableName+" SET "+columnName+"='"+updatingValue+"' WHERE EmployeeID='"+employeeId+"'");
    	    return x; 
    	    
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
    }
    
    
    
    
    
    
    
    public static int updateEmployeeEducational(String employeeId, String columnName, String updatingValue )
    {   //if we write directly then for particular column with same id every value will changes 
    	int x=0;
    	try 
    	{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
	        Statement stmt=conn.createStatement();
	        EmployeeEducational ee=searchEmployeeEducation(employeeId);
	        int y= Integer.parseInt(columnName);
	        if(y==1 || y==6 || y==11 || y==16 || y==21)
	        {
	        	columnName="Course";
	        }
	        if(y==2 || y==7 || y==12 || y==17 || y==22)
	        {
	        	columnName="Name_of_SchoolOrCollege";
	        }
	        if(y==3 || y==8 || y==13 || y==18 || y==23)
	        {
	        	columnName="BoardOrUniversity";
	        }
	        if(y==4 || y==9 || y==14 || y==19 || y==24)
	        {
	        	columnName="Year_of_Passing";
	        }
	        if(y==5 || y==10 || y==15 || y==20 || y==25)
	        {
	        	columnName="Percentage_or_CGPA";
	        }
	        if(y>=1 && y<=5)
	        {
	        	x= stmt.executeUpdate("UPDATE employee_educational_qualifications_data SET "+columnName+"='"+updatingValue+"' WHERE EmployeeID='"
	                                     +employeeId+"' AND  Course='"+ee.ssc +"'");
	        	return x; 
	        	
	        }
	        else if(y>=6 && y<=10)
	        {
	        	x= stmt.executeUpdate("UPDATE employee_educational_qualifications_data SET "+columnName+"='"+updatingValue+"' WHERE EmployeeID='"
                        +employeeId+"' AND  Course='"+ee.intermediate +"'");
                return x; 
	        }
	        else if(y>=11 && y<=15)
	        {
	        	x= stmt.executeUpdate("UPDATE employee_educational_qualifications_data SET "+columnName+"='"+updatingValue+"' WHERE EmployeeID='"
                        +employeeId+"' AND  Course='"+ee.graduate +"'");
                return x; 
	        }
	        else if(y>=16 && y<=20)
	        {
	        	if(ee.masters!=null)
	        	{
	        	
	        		x= stmt.executeUpdate("UPDATE employee_educational_qualifications_data SET "+columnName+"='"+updatingValue+"' WHERE EmployeeID='"
                            +employeeId+"' AND  Course='"+ee.masters +"'");
                	return x;	
	        	}
	        }
	        else if(y>=21 && y<=25)
	        {
	        	if(ee.phdCourse!=null)
	        	{
	        	  
	        		x= stmt.executeUpdate("UPDATE employee_educational_qualifications_data SET "+columnName+"='"+updatingValue+"' WHERE EmployeeID='"
                            +employeeId+"' AND  Course='"+ee.phdCourse +"'");
  	                return x; 		
	        	}
	        }
    	    
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
    }
    public static boolean loginvalidation(String id, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/regnant-portal-db", "root", "Kumar@116");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee_personal_data where EmployeeID='" + id + "'  AND Password='" + password + "'");
			if (rs.next()) {
				return true;
			} else {
				return false;
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
