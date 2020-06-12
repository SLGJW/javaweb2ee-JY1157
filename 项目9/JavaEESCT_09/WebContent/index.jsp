<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<link rel="stylesheet" type="text/css" href="css/bar.css"/>
	<script src="js/jquery-1.8.3.js" type="text/javascript" charset="utf-8"></script>
	<script type="text/javascript" src="js/bar.js"></script>
	<body>
			<div class = "inner_title">
				<div class = "web_name">
					<b>logo</b>
				</div>
				<ul class = "cen_title">
					<li><a href="index.jsp">首页</a></li>
					<li><a href="bar.jsp">商城/合作</a></li>
				</ul>
				<div class="login_title"><%if(session.getAttribute("name") != null){ %>
						您好！<a href="Pc"><%=session.getAttribute("name") %></a>

					<%}else{ %>
					亲爱的用户，欢迎<a href="login.jsp">登录</a>
					<%} %></div>
			</div>
			
			
			
	</body>
</html>