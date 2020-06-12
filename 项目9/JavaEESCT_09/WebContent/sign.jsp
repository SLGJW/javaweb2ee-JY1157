<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>注册页面</title>
		<script src="js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/sign-js.js" type="text/javascript" charset="utf-8"></script>
		
	</head>
	<body>
					<div id = 'bg'>
						<form action="InsertServlet" method="post" class = 'fr'>
							<h3 align='center' id='title'>欢迎注册</h3>
							<table border="0" class='tb'>
								<tr class="tr">
									<td>用户名：</td>
									<td><input type='text' name = 'username' class="input" id = 'username' value="" placeholder='请输入用户名'>*</td>
								</tr >
								<tr class="tr">
									<td>电子邮箱：</td>
									<td><input type="email" name = 'email' id="email" class="input" value="" placeholder='请输入邮箱'/>*</td>
								</tr>
								<tr class="tr">
									<td>性别：</td>
									<td><input type="radio" name = 'sex' id="sex" value="男"  checked = "checked"/>男 <input type="radio" name = 'sex' id="sex" value="女" />女</td>
								</tr>
								<tr class="tr">
									<td>密码：</td>
									<td><input type='password' id = 'pwd' class="input" name = 'password' value=''>*</td>
								</tr>
								<tr class="tr">
									<td>确认密码：</td>
									<td><input type = 'password' id = 'pwd2' class="input" name = 'password2' value = "">*</td>
								</tr>
							</table>
							<h3 align="center">
								<%if(session.getAttribute("info") != null){
								%>
									<%=session.getAttribute("info") %>
									<%session.invalidate(); %>
							<%
								} %>
							</h3>
							<center><input type="button" value='马上注册' id='zc' onclick="t1()" class="input" ></center>
						</form>
					</div>
	</body>
</html>
