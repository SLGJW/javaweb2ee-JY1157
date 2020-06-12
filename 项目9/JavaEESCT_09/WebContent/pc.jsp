<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>个人中心</title>
		<link rel="stylesheet" href="css/pc.css" />
		
		 <script type="text/javascript">
    function fileClick() {
    document.getElementById('file').click()
    }
    function upCh(file){
        let img = document.getElementById('fileimg')
    let formData = new FormData()
    let imgUrl = file.files[0];
    if (imgUrl){
        formData.append('file',imgUrl);
        imgUrl.src = window.URL.createObjectURL(imgUrl)
    }
}
   </script>
	</head>
	<body>
		<div id="header">
			<h1 class="bt0"个人中心></h1>
			<body bgcolor="#HH00FF">
		</div>
		<div id="content">
			<div class="btl1">
				<img src="img/sy1.png" />&nbsp;
				<b> <a href="index.jsp">首页</a></b> &nbsp;&nbsp;
				<img src="img/yjt1.png">&nbsp;&nbsp;
				<span>个人中心</span>
				<hr />
			</div>
			
			<h2><b>用户名:</b><%=session.getAttribute("name") %></h2>
			<h2><b>电子邮箱:</b><%=request.getAttribute("email") %></h2>
			<h2><b>性别:</b><%=request.getAttribute("sex") %></h2>
			</div>
			<a href ="showMessage.jsp">我的好友列表</a>
			</body>

</html>