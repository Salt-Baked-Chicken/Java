<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form name="form1" method="post" action="request_get_printout.jsp">
        <table border="0" align="center">
            <tr> <td>用户名</td><td> <input type="text" name="name"></td></tr>
            <tr><td>密码</td><td > <input type="password" name="psw"> </td></tr>
            <tr> <td>信息来源</td><td>
                <input type="checkbox" name="ckbox" value="报刊">报刊
                <input type="checkbox" name="ckbox" value="网络">网络
                <input type="submit" name="a">
            </tr>
        </table>
    </form>
</body>
</html>
