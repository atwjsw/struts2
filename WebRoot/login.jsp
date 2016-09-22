<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginAction.action" method="post">
	<!-- 参数传递方法一： 单个字段名匹配 -->
	<!-- 用户名：<input type="text" name="username"><br>
	密码：<input type="password" name="password"><br> -->
	
	<!-- 参数传递方法二： 对象字段名匹配 -->
	<!-- 用户名：<input type="text" name="user.username"><br>
	密码：<input type="password" name="user.password"><br> -->
	
	<!-- 参数传递方法三： ModelDriven接口 -->
	用户名：<input type="text" name="username"><s:fielderror><s:param>username</s:param></s:fielderror><br>
	密码：<input type="password" name="password"><s:fielderror><s:param>password</s:param></s:fielderror><br>
	书籍1用户名：<input type="text" name="bookList[0].username"><br>
	书籍1密码：<input type="text" name="bookList[0].password"><br>
	书籍2用户名：<input type="text" name="bookList[1].username"><br>
	书籍2密码：<input type="text" name="bookList[1].password"><br>
	<input type="submit" value="提交">
	</form>
</body>
</html>