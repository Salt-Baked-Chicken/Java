<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>菜鸟教程(runoob.com)</title>
</head>
    <body>
        <h2>JSP使用，include案例</h2>
        <jsp:include page="index.jsp"/>
        <h2>Jsp 使用 JavaBean 实例</h2>
        <jsp:useBean id="test" class="com.runoob.main.TestBean" />
        <jsp:setProperty name="test"
                     property="message"
                     value="菜鸟教程...123" />
        <p>输出信息....</p>
        <jsp:getProperty name="test" property="message" />
        <h2>跳转页面代码在这一行下方，已注释掉</h2>
        <!--jsp:forward page="index.jsp"/-->
    </body>
</html>