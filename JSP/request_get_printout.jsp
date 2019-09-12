<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2019/9/12
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
try_some_word</br>
    <%  request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String psw = request.getParameter("psw");
        String ckbox = request.getParameter("ckbox");   %>

        <%  out.print(name);    %></br>
        <%  out.print(psw); %></br>
        <%  out.print(ckbox);   %></br>
</body>
</html>
