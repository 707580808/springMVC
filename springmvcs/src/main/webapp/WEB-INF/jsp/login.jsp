<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2016/11/3
  Time: 12:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form action="login.html" method="post">
    ${ERR_username}
    用户名<input name="username" type="text">
        ${ERR_password}
    密码<input name="password"  type="password">
     <input name="aso" type="submit">
</form>
</body>
</html>
