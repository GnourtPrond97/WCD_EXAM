<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/21/2021
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/employee/create" method="post">
    <div>
        Full name <input type="text" name="fullName">
    </div>
    <div>
        Birth day <input type="text" name="birthDay">
    </div>
    <div>
        Address <input type="text" name="address">
    </div>
    <div>
        Position <input type="text" name="position">
    </div>
    <div>
        Department. <input type="text" name="department">
    </div>
    <div>
        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </div>
</form>

</body>
</html>
