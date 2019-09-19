<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员页面</title>
</head>
<body>
    管理员登陆成功？或者…
    <%
        String login = (String) session.getAttribute("login");
        // 检查登录信息正确，如果正确就输出登录信息
        // 原本应是如果不正确则跳转登陆页面
        if (login == "admin") {
            out.print(login);
        return;
        }
    %>
</body>
</html>
