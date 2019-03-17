<%--
  Created by IntelliJ IDEA.
  User: 权
  Date: 2019-03-14
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
</head>
<body>
<form action="/login" method="post">
   账号:<input type="text" name="accno" > <br>
   密码:<input type="password" name="password" > <br>
    <input type="submit" value="登陆" >
</form>
</body>
<script>
    function robotVerified(){
        console.log('Verified: not robot');
    }
</script>
</html>
