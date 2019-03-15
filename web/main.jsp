<%--
  Created by IntelliJ IDEA.
  User: 权
  Date: 2019-03-15
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>转账</title>
</head>
<body>
欢迎${ac.name}登陆 <br>
<form action="/transfer" method="post">
    金额:<input type="text" name="balance" > <br>
    转入账号：<input type="text" name="accIn"> <br>
    转入名称: <input type="text" name="name" > <br>
    <input type="submit" value="提交" >
</form>


</body>
</html>
