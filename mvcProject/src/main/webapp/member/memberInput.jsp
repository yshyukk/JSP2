<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>회원가입</h3>
	<form action="memberProc.jsp" method="post">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="passwd"><br>
		이름 : <input type="text" name="name"><br>
		이메일 : <input type="text" name="mail"><br>
		<input type="submit" value="입력">
	
	</form>
</body>
</html>