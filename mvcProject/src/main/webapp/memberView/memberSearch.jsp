<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원검색</title>
</head>
<body>
	<h3>회원검색</h3>
	${error }
	
	<form action="${pageContext.request.contextPath}/memberSearch.do" method="post">
		아이디 : <input type="text" name="id"><br>
		<input type="hidden" name="job" value="search">
		<input type="submit" value="조회">
	</form>
	
</body>
</html>