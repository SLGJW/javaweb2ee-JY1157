<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>	
	
		
		<div  class="mar">
				<div class="title" align="center"><b><i>_______登录_______</i></b></div>
			<div class="content" align="center">
				<form action="LoginServlet" method="post">
					<div class = "tm">
					<p><input type="text" class = "text" name = "name" placeholder="账号"/></p>
					<p><input type="password" class="text" name = "password" placeholder="密码"/></p><br />
					</div>
					<span><%if(session.getAttribute("info") != null){ %>
					<%=session.getAttribute("info") %>
					<%session.invalidate(); %>
					<%} %></span><br>
					<input type="submit" value="登录" class="but"/><br />
					<div class="sign">
						<p></p>
						<div class="sign1"><a href = "#">忘记密码？</a></div>
						<div class="sign2"align="right"><a href = "sign.jsp">注册账号</a></div>
					</div>
				</form>
			</div>
		</div>
		
	</body>
</html>
