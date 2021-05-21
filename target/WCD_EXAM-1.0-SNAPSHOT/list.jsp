
<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Employee" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/21/2021
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
        ArrayList<Employee> listEmployee = (ArrayList<Employee>) request.getAttribute("listEmployee")
%>
<html>
<head>
    <title>List employee</title>
</head>
<body>
<h1>List employee</h1>
<ul>
    <% if(listEmployee != null && listEmployee.size() > 0){
        for(int i = 0; i < listEmployee.size(); i++){
    %>
    <li>
        <%= listEmployee.get(i).getId()%>
        <%= listEmployee.get(i).getFullName()%>
        <%= listEmployee.get(i).getAddress()%>
        <%= listEmployee.get(i).getBirthDay()%>
        <%= listEmployee.get(i).getPosition()%>
        <%= listEmployee.get(i).getDepartment()%>
        <%= listEmployee.get(i).getId()%>
    </li>
    <%
            }
        }
    %>

</ul>
</body>
</html>
