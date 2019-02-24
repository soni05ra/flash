<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "bean.web.Alien" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

//Alien a = (Alien) request.getAttribute("alien");
//out.println(a.getAid() + " " + a.getAname() + " " + a.getTech());



%>
<table>
 <tr>
   <th>Aid</th>
   <th>Aname</th>
   <th>Tech</th>
   
 </tr>
 
  <tr>
  <% Alien a = (Alien) request.getAttribute("alien"); %>
   <td> <% a.getAid(); %> </td>
   <td> <% a.getAname();%> </td>
   <td> <% a.getAname(); %> </td>
   
 </tr>

</table>
</body>
</html>