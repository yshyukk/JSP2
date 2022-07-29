<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<thead>
			<tr><th>아이디</th><th>이름</th><th>이메일</th><th>비밀번호</th></tr>
		</thead>
		<tbody id="list"></tbody>
	</table>
	<!-- Ajax(비동기방식 처리) -->
	<script>
		let i = 0;

		let xhtp = new XMLHttpRequest(); //비동기방식 처리(Ajax)
		xhtp.open('get', 'memberJson.do');
		xhtp.send();
		xhtp.onreadystatechange = callBackThree;
		
		function callBackOne() {
			if (this.readyState == 4 && this.status == 200) {
				let data = JSON.parse(this.responseText);
				console.log(data);
				
				let name = document.createElement('p');
				name.innerText = data.name;
				let age = document.createElement('p');
				age.innerText = data.age;

				document.querySelector('body').append(name, age);
			}
		}
		
		function callBackTwo(){
			if (this.readyState == 4 && this.status == 200) {
				let data = JSON.parse(this.responseText);
				console.log(data);
				
				let ul = document.createElement('ul'); //<ul></ul>출력됨
				for (let obj of data){
					let li = document.createElement('li');
					li.innerHTML = obj.name + obj. age; //=<li>hong, 15<li>
					ul.append(li);
				}
				console.log(ul);
				document.querySelector('body').append(ul);
			}
		}
		let fields = ['id', 'name','mail','pass'];
		function callBackThree(){
			if (this.readyState == 4 && this.status == 200) {
				let data = JSON.parse(this.responseText);
				console.log(data);
				
				let tbody = document.getElementById('list');
				
				for (let obj of data){
					let tr = document.createElement('tr');
					
					for(let field of fields){
						let td1 = document.createElement('td');
						td1.innerText = obj[field];
						tr.append(td1);
					}
					
					tbody.append(tr);
				}
				
			}
		}
	</script>
</body>
</html>