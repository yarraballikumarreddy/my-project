<%@page import="com.regnant.db.EmployeeProfessional"%>
<%@page import="com.regnant.db.EmployeeEducational"%>
<%@page import="com.regnant.db.EmployeeContact"%>
<%@page import="java.util.List"%>
<%@page import="com.regnant.db.EmployeePersonal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
 <head>
 <meta charset="ISO-8859-1">
 <title>Insert title here</title>
   <style>
   .header{position:fixed;width:100%;height:70px;background:#073935;top:0;left:0;color:white;}
      #profilearea{top:29px;margin-left:1100px;height:15px;font-size:20px;} 
      #profilearea1{top:29px;margin-left:1200px;height:15px;font-size:20px;}
      #pf{color:pink;margin-left: 550px;}
       body{background:linear-gradient(to bottom right,white,#bcbdc4);margin:0px;
       padding:0px;opacity:0.9;height:1300px;text-decoration:none;}
                          
      .id{margin-top: 150px;margin-left: 20px;}                   
      .id1{margin-top: 150px;margin-left: 50px;}                       
      .tableclass{border:1px solid black;border-collapse: collapse;  height:150px; width:740px;margin-left: 10px;}                             
       th,td{border:1px solid black;}
      
       .img{width:180px;height:200px;border: 1px solid black;float: right;margin-top: 0px;margin-right: 140px;}
       div.a{border: 1px solid red;margin-left:200px;text-align: center; height:350px; width:760px; box-shadow: 0px 5px 6px #222;margin-top: 90px;}
       div.b{border: 1px solid red;margin-left:200px;text-align: center;height:200px; width:760px;box-shadow: 0px 5px 6px #222;margin-top: 20px;}
       div.c{border: 1px solid red;margin-left:200px;text-align: center;height:250px; width:760px;box-shadow: 0px 5px 6px #222;margin-top: 20px;}
       div.d{border: 1px solid red;margin-left:200px;text-align: center;height:175px; width:760px;box-shadow: 0px 5px 6px #222;margin-top: 20px;}           
   
   </style>
 </head>
 <body>
	<div class ="img"><p align="center">profile</p></div>
    <div class ="header">
        <div id = "pf" class = "header"><h1>View Employee Profile </h1></div>
        <div id = "profilearea" class = "header"><a href ="Home"><font color="white">Home</font></a></div>
    <div id = "profilearea1" class = "header"><a href ="logout"><font color="white">Logout</font></a></div>
    </div>
	<div class = "a">
	 <% EmployeePersonal ep=(EmployeePersonal)request.getAttribute("EmployeePersonal"); %>
	  <h2>EMPLOYEE PERSONAL DETAILS</h2>
	  EMPLOYEE ID :<%=ep.employeeId %> <br><br> 
	  FIRST NAME :<%=ep.firstname %> &emsp; &emsp; &emsp; &emsp;
	  LAST NAME :<%=ep.lastname %> <br><br>
	   DATE OF BIRTH:<%=ep.dateofbirth %> &emsp; &emsp; &emsp; &emsp;&emsp; &emsp;
	   GENDER:<%=ep.gender %> <br><br>
	   MARITAL STATUS:<%=ep.maritalStatus %>  &emsp; &emsp; &emsp; &emsp;
	   NATIONALITY:<%=ep.nationality %><br><br>
	   FATHER NAME:<%=ep.fatherName %>  &emsp;&emsp;&emsp;&emsp;
	   MOTHER NAME:<%=ep.motherName %><br><br>
	   LANGUAGE:<%=ep.languageString %><br><br>
	   BLOOD GROUP:<%=ep.bloodGroup %> &emsp;&emsp;&emsp;&emsp;
	   MOBILE NUMBER:<%=ep.phoneNumber %><br><br>
	   EMAIL:<%=ep.email %>             &emsp;&emsp;&emsp;&emsp;
	   PASSWORD:<%=ep.password %><br>
    </div>  
	<div class = "b">
      <h2>EMPLOYEE CONTACT DETAILS </h2 >
      <% List<EmployeeContact> contactlist=(List<EmployeeContact>)request.getAttribute("EmployeeContact"); 
         for(EmployeeContact ec:contactlist) 
         {   %>
            ADDRESS:<%=ec.address %>   &emsp;&emsp;&emsp;&emsp;
            HOME PHONE NUMBER:<%=ec.homenumber %><br><br>
            CITY:<%=ec.city %>   &emsp;&emsp;&emsp;&emsp;  &emsp;&emsp;&emsp;&emsp;
            STATE:<%=ec.state %><br><br>
            COUNTRY:<%=ec.country %>  &emsp;&emsp;&emsp;&emsp;   &emsp;&emsp;&emsp;&emsp;   
            PINCODE:<%=ec.pincode %><br><br>
      <%
         }
      %>
    </div>  
	<div class = "c">
      <h2>EMPLOYEE EDUCATIONAL DETAILS </h2>
      <%EmployeeEducational ee=(EmployeeEducational)request.getAttribute("EmployeeEducational"); %>
      <table class="tableclass">
        <thead>
           <tr>
               <th>Course </th>        
               <th>Name of School/College </th>
               <th>Board/University </th>
               <th>Year of Passing </th>
               <th>Percentage or CGPA</th> 
           </tr>
        </thead> 
        <tbody>
           <tr>
               <td><%=ee.ssc %></td>
               <td><%=ee.schoolName %></td>  
               <td><%=ee.sscBoard %></td>
               <td><%=ee.sscYearOfPassing %></td>
               <td><%=ee.sscpercentage %></td>
           </tr> 
           <tr>
               <td><%=ee.intermediate %></td>
               <td><%=ee.collegeName %></td>  
               <td><%=ee.intermediateBoard %></td>
               <td><%=ee.intermediateYearOfPassing %></td>
               <td><%=ee.intermediatePercentage %></td>
           </tr> 
           <tr>
               <td><%=ee.graduate %></td>
               <td><%=ee.collegeName2 %></td>  
               <td><%=ee.graduateUniversity %></td>
               <td><%=ee.graduateYearOfPassing %></td>
               <td><%=ee.graduatePercentage %></td>
           </tr>
           
           <%if(!(ee.masters==null)) {  %>
           <tr>
               <td><%=ee.masters %></td>
               <td><%=ee.collegeName3 %></td>  
               <td><%=ee.mastersUniversity %></td>
               <td><%=ee.mastersYearOfPassing %></td>
               <td><%=ee.mastersPercentage %></td>
           </tr> 
           <% } %> 
           
           <%if(!(ee.phdCourse==null)) { %>
           <tr>
               <td><%=ee.phdCourse %></td>
               <td><%=ee.collegeName4 %></td>  
               <td><%=ee.phdUniversity %></td>
               <td><%=ee.phdYearOfPassing %></td>
               <td><%=ee.phdPercentage %></td>
           </tr> 
           <% } %>           
         </tbody>
      </table> 
    </div>  
	<div class = "d">
        <h2>EMPLOYEE PROFFESIONAL DETAILS</h2>
      <%EmployeeProfessional epro= (EmployeeProfessional)request.getAttribute("EmployeeProfessional"); %>
         DATE OF JOINING:<%=epro.dateofjoining %>  &emsp;&emsp;&emsp;&emsp;
         DATE OF RELIEVING:<%=epro.dateofrelieving %><br> <br>
         JOB TITLE:<%=epro.jobtitle %>  &emsp;&emsp;&emsp;&emsp;  &emsp;&emsp;&emsp;&emsp;
         SALARY:<%=epro.salary %><br> <br>
         WORKING EXPERIENCE:<%=epro.workexperience %>  &emsp;&emsp;&emsp;&emsp;
         NEXT COMPANY NAME:<%=epro.nextcompany %><br>
    </div>  
       
 </body>
</html>