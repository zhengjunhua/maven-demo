<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>

	<h3>根据ID查询</h3>  
	${testUser.username}
	${result}
	<h3>查询用户列表</h3>  
	<table border="1">
	<c:forEach items="${testUserList}" var="user">
	 	<tr>
		     <td>${user.id}</td>
		     <td>${user.username}</td>
		     <td>${user.userage}</td>
	 	</tr>
 	</c:forEach>
	</table>
	
	<h3>测试参数传递</h3>
	${mapResult }  ${modelResult }  ${modelViewResult }
	
	<h3>新增用户</h3>
	${affectCount }
	
	<h3>更新用户</h3>
	${affectCount }
	
	<h3>删除用户</h3>
	${affectCount }
</body>
</html>