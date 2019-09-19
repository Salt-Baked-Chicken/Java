<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session</title>
</head>
<body>
    <%
        request.setCharacterEncoding("UTF-8");
        String name = "admin";
        String psw = "admin";
        if ("admin".equals(name) && "admin".equals(psw)) {
            // 在session中存键值对
            // 这里把name变量值admin作为session会话中一个对象的名字login存储下来
            // 起名目的是在session会话中调用
            session.setAttribute("login", name);
            // 设置session过期时间
            session.setMaxInactiveInterval(600);
            request.getRequestDispatcher("admin_on.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    %>
</body>
</html>
