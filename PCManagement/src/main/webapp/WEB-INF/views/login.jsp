<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>PCManagement</title>
</head>
<body>
<h2>ログイン画面</h2>
<form th:action="@{/login}" method="post">

    <div>
        <c:if ${session['SPRING_SECURITY_LAST_EXCEPTION'] != null} class="alert-danger">
        <span ${ユーザ名またはパスワードに誤りがあります }></span>
        </c:if>
    </div>

    <div style="width:160px;"><label for="username">ユーザ名：</label></div>
    <input type="text" name="username" autofocus="autofocus" />
    <br/>
    <div style="width:160px;"><label for="password">パスワード：</label></div>
    <input type="password" name="password" />
    <br/>
    <p><input type="submit" value="ログイン" /></p>
</form>
</body>
</html>