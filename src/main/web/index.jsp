<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>test mvc</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名<input type="text" name="username"  /><br/>
    密码<input type="password" name="password"  /><br/>
    <button type="submit">登录</button>
  </form>
  </body>
</html>
