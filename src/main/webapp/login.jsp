<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/adminAction_login.action">
		用户名：<input type="text" name="name"/><br/>
		密码：<input type="text" name="password"/><br/>
		验证码：<input type="text" name="checkCode"/>
		<img id="codeImg" src="${pageContext.request.contextPath}/checkImgServlet" onclick="refreshCode()"/>
		<input type="submit" value="登陆"/>
	</form>
	<script type="text/javascript">
	function refreshCode() {
		$("#codeImg").attr("src", "${ctx}/checkImgServlet?" + Math.random());
	}
	</script>
</body>
</html>