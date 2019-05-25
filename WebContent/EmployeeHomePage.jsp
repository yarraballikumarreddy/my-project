<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
    <style>
       body{background:linear-gradient(to bottom right,white,#bcbdc4);margin:0px;padding:0px;opacity:0.9;height:1000px;text-decoration:none;}
      .header{position:fixed;width:100%;height:70px;background:#073935;top:0;left:0;color:white;}
      #profilearea{top:25px;margin-left:1250px;height:15px;font-size:20px;} 
      #profilearea1{top:25px;margin-left:1400px;height:15px;font-size:20px;}
      #pf{text-align:center;color:pink;}
      .a{height:500px; width:550px;margin-top:100px; border: 1px solid black;}
     </style> 
</head>
<body>
    <%  HttpSession se =request.getSession();
          String id= (String) se.getAttribute("id"); %>
    
    <div class ="header">
		<div id = "pf" class = "header"><h1>Employee Details</h1></div>
		<div id = "profilearea" class = "header"><a href ="Home"><font color="white">Home</font></a></div>
		 <div id = "profilearea1" class = "header"><a href ="logout"><font color="white">Logout</font></a></div>
    </div>
    
    
    <div class="a">
    
       <a href="SearchEmployee?employeeid=<%=id %>&number=id">View Profile</a>
    
    </div>
    
</body>
</html>