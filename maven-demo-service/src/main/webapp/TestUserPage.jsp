<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
	<style type="text/css">
        * {
            margin: 0;
        }

        html, body {
            height: 100%;
        }

        .wrapper {
            min-height: 100%;
            height: auto !important;
            height: 100%;
            margin: 0 auto -155px;
        }

        .footer, .push {
            height: 155px;
        }

        table.gridtable {
            font-family: verdana, arial, sans-serif;
            font-size: 11px;
            color: #333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
            margin: 5px auto;
        }

        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #dedede;
        }

        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #ffffff;
        }

        .middle {
            text-align: center;
            margin: 0 auto;
            width: 600px;
            height: auto;
        }

        .info {
            font-size: 12px;
            text-align: center;
            line-height: 20px;
            padding: 40px;
        }

        .info a {
            margin: 0 10px;
            text-decoration: none;
            color: green;
        }
    </style>
</head>
<body>
		<form action="testPage" method="post">
            <table class="gridtable" style="width:100%;">
                <tr>
                	<th>用户名称：</th>
                    <td><input type="text" name="username"/></td>
                    <th>每页显示条数：</th>
                    <td><input type="text" name="pageSize"/></td>
                    <td><input type="hidden" name="pageNum" value="1"/></td>
                    <td><input type="submit" value="查询"/></td>
                </tr>
            </table>
        </form>
        ${username}
        <c:if test="${page!=null}">
            <table class="gridtable" style="width:100%;">
                <thead>
                <tr>
                    <th colspan="3">查询结果</th>
                </tr>
                <tr>
                    <th>ID</th>
                    <th>用户名</th>
                    <th>用户年龄</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${page.list}" var="user">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.username}</td>
                        <td>${user.userage}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <table class="gridtable" style="width:100%;text-align: center;">
                <tr>
                    <c:if test="${page.hasPreviousPage}">
                        <td><a href="${pageContext.request.contextPath}/testPage?username=${username}&pageNum=${page.prePage}&pageSize=${page.pageSize}">前一页</a></td>
                    </c:if>
                    <c:forEach items="${page.navigatepageNums}" var="nav">
                        <c:if test="${nav == page.pageNum}">
                            <td style="font-weight: bold;">${nav}</td>
                        </c:if>
                        <c:if test="${nav != page.pageNum}">
                            <td><a href="${pageContext.request.contextPath}/testPage?username=${username}&pageNum=${nav}&pageSize=${page.pageSize}">${nav}</a></td>
                        </c:if>
                    </c:forEach>
                    <c:if test="${page.hasNextPage}">
                        <td><a href="${pageContext.request.contextPath}/testPage?username=${username}&pageNum=${page.nextPage}&pageSize=${page.pageSize}">下一页</a></td>
                    </c:if>
                </tr>
            </table>
        </c:if>
</body>
</html>