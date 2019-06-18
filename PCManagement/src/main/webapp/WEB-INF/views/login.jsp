<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
 <link rel="stylesheet" href="/css/login.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.1.2/css/bulma.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
<meta charset="UTF-8">
<title>PCManagement</title>
</head>
<body>
<h2>ログイン画面</h2>
<form th:action="@{/login}" method="post">

    <div>
        <c:if test=${session['SPRING_SECURITY_LAST_EXCEPTION'] != null} class="alert-danger">
        <span ${ユーザーIDまたはパスワードに誤りがあります }></span>
        </c:if>
    </div>

    <div style="width:160px;"><label for="username">ユーザーID：</label></div>
    <input type="text" name="username" autofocus="autofocus" />
    <br/>
    <div style="width:160px;"><label for="password">パスワード：</label></div>
    <input type="password" name="password" />
    <br/>
    <p><input type="submit" class = "button is-primary" value="ログイン" /></p>
</form>
</body>
</html>