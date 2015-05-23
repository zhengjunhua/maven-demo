<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ page isELIgnored="false" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
<% 
String path = request.getContextPath(); 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"; 
%> 
<script type="text/javascript" src="js/jquery-1.11.2.min.js"></script>
<script type="text/javascript">
	function addUser(){
		var formData = new Object();
		formData.username = "王小二";
		formData.userage = 23;
		formData.useraddress = "浦东新区";
		$.ajax({
			type: "POST",
            url: "testmybatis/addTestUser",
            dataType: "json",
            contentType: 'application/json',
            data: JSON.stringify(formData),
            success: function (data) {
                console.log(data);
            },
            error: function (data) {
            	console.log(data);
            }
		});
	}
</script>
</head>
<body>
<h1>所有的演示例子</h1>  
  
<h3><a href="./testmybatis/qryByID?user.id=1&user.username=老王&user2.id=2&user2.username=老李">根据ID查询</a></h3>  
<h3><a href="./testmybatis/qryList">查询用户列表</a></h3>  
<h3><a href="./testmybatis/testParam?username=王小二">测试参数</a></h3>  
<h3><a href="javascript:addUser()">新增用户</a></h3>  
<h3><a href="./testmybatis/updTestUser?id=2&username=王小三&userage=23&useraddress=浦东新区">更新用户</a></h3>  
<h3><a href="./testmybatis/delTestUser?id=3">删除用户</a></h3>  
<h3><a href="./testmybatis/getUserArticles?userID=1">获取用户课程</a></h3>  

</body>
</html>

