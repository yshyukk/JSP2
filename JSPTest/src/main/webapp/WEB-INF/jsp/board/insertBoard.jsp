<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 입력</title>
</head>
<body>
	<h3>게시글 입력</h3>
	<form action="insertBoard.do" method="post">
		작성자 : <input type="text" name="writer"><br>
		제목 : <input type="text" name="title"><br>
		내용 : <input type="text" name="content"><br>
		<input type="submit" value="입력">
	</form>
</body>
</html>

