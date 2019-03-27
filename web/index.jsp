<%--
  Created by IntelliJ IDEA.
  User: peny
  Date: 2019/3/8
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
    <h1>这是首页</h1>
    <a href="/springmvc01/hello1">点击跳转</a>
  </body>

  <hr>
    <fieldset>
      <legend>登录窗口</legend>
      <figure>
        <form action="/springmvc01/user/test1" method="get">
          用户名：<input type="text" id="username" name="username"> <br>
          密丶码：<input type="password" id="password" name="password"> <br>
          <input type="submit" value="登录">
        </form>
      </figure>
    </fieldset>
  <hr/>
</html>
