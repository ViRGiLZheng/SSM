<%--
  Created by IntelliJ IDEA.
  User: 权
  Date: 2019-03-16
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>更改密码</title>
</head>
<body>
<form action="/changePassword" method="post">
账户：<input type="text" name="accNo" > <br>
原密码：<input type="text" name="password" > <br>
新密码：<input type="text" name="newPassword" > <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
