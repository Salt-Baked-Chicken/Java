<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2019/9/17
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        //验证的账号密码为sa
        String name = request.getParameter("name");
        String psw = request.getParameter("psw");
        String ckbox = request.getParameter("ckbox");
        if("sa".equals(name) && "sa".equals(psw)) {
            //建requestdispatch对象，调用forward方法
            //在跳转时会转发服务器的请求响应信息（如账号密码信息）
            //地址栏不会改变成被跳转的浏览器地址
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request,response);
        }
        else{
            //普通的重定向方法，在再次跳转时，服务器会失去保留的jsp请求响应信息
            //地址栏会显示跳转后的地址
            response.sendRedirect("request_indexform.jsp");
        }
    %>
</body>
</html>
