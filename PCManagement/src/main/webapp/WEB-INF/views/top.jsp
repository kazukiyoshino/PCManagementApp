<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>ログイン成功</h1>

<form action="#" th:action="@{/logout}" method="post">
        <input type="submit" value="ログアウト" />
        </form>

</body>
</html>