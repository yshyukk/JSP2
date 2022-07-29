<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록 페이지</title>
</head>
<body>
	<h3>회원목록</h3>
	<table border="1">
		<tr><th>아이디</th><th>이름</th><th>이메일</th><th>비밀번호</th></tr>
		<c:forEach var="vo" items="${list }">
			<tr><td>${vo.id }</td><td>${vo.name }
			</td><td>${vo.mail }</td><td>${vo.passwd }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>