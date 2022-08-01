<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<h3>게시판 목록</h3>
	<table border="1">
		<tr><th>번호</th><th>제목</th><th>작성자</th><th>내용</th><th>작성일</th><th>조회수</th></tr>
		<c:forEach var="vo" items="${list }">
			<tr><td>${vo.seq }</td><td>${vo.title }
			</td><td>${vo.writer }</td><td>${vo.content }
			<td>${vo.writeDate }</td><td>${vo.visitCNT }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>