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

	<h3>����ID��ѯ</h3>�0�2�0�2
	${testUser.username}
	${result}
	<h3>��ѯ�û��б�</h3>�0�2�0�2
	<table border="1">
	<c:forEach items="${testUserList}" var="user">
	 	<tr>
		     <td>${user.id}</td>
		     <td>${user.username}</td>
		     <td>${user.userage}</td>
	 	</tr>
 	</c:forEach>
	</table>
	
	<h3>���Բ�������</h3>
	${mapResult }  ${modelResult }  ${modelViewResult }
	
	<h3>�����û�</h3>
	${affectCount }
	
	<h3>�����û�</h3>
	${affectCount }
	
	<h3>ɾ���û�</h3>
	${affectCount }
</body>
</html>