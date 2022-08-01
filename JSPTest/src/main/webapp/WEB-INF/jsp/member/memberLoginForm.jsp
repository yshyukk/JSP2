<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">
	function formCheck() {
		if (frm.memberId.value == "") {
			alert("아이디를 입력하세요.");
			frm.memberId.focus();
			return false;
		}

		if (frm.memberPassword.value == "") {
			alert("패스워드를 입력하세요.");
			frm.memberPassword.focus();
			return false;
		}

		frm.submit();
	}
</script>
<div align="center">
	<div>
		<h1>로그인</h1>
	</div>
	<div>
		<form id="frm" name="frm" action="memberLogin.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th width="150">아이디</th>
						<td width="300"><input type="text" id="memberId" name="memberId"></td>
					</tr>
					<tr>
						<th width="150">패스워드</th>
						<td width="300"><input type="password" id="memberPassword" name="memberPassword"></td>
					</tr>
				</table>
			</div><br />
			<div>
				<button type="button" onclick="formCheck()">로그인</button>&nbsp;&nbsp;&nbsp;
				<button type="reset">취 소</button>&nbsp;&nbsp;&nbsp;
				<button type="button" onclick="location.href='main.do'">홈</button>
			</div>
		</form>
	</div>
</div>