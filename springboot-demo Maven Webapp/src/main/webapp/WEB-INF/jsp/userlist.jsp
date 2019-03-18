<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>mybatis-demo</title>
<script src="${ctx}/js/jquery.min.js" type="text/javascript"></script>
<script>
    $(function() {
    	
		$("#save").click(function(){
			var names = $("#names").val();
			var ages = $("#ages").val();
			
			$.ajax({
	    		url:"${ctx}/springboot-mybatis/saveUser?name="+names+"&age="+ages,
				async:true,
				type:'post',
				success:function(result){
						location.reload();
				}
			});
			
		});
		$("#tj").click(function(){
			var name = $("#name").val();
			var age = $("#age").val();
			var id = $("#user_id").val();
			
			$.ajax({
	    		url:"${ctx}/springboot-mybatis/editUser",
	    		data:{name:name,age:age,id:id},
				async:true,
				type:'post',
				success:function(result){
						location.reload();
				}
			});
			
		});
	});
    function getUser(id)
    {
    	
    	$.ajax({
	    		url:"${ctx}/springboot-mybatis/getUser?id="+id,
				async:true,
				type:'get',
				success:function(data){
					var dataObj=eval("("+data+")");
					$("#name").val(dataObj.name);
					$("#user_id").val(dataObj.id);
					$("#age").val(dataObj.age);
					document.getElementById("update").style.display="";
				}
		});
    	
    	
    }    
    function delUser(id)
    {
    	$.ajax({
	    		url:"${ctx}/springboot-mybatis/delUser?id="+id,
				async:true,
				type:'get',
				success:function(data){
					location.reload();
				}
		});
    }      
    </script>

</head>

<body>

	<div id="insert" >
		姓名：<input type="text" id="names"/> &nbsp;&nbsp; 年龄：<input type="text" id="ages"/>&nbsp;&nbsp;<input id="save" type="button" value="添加"/>
	</div>
	
	<div>
		<table>
			<tr><td>id</td><td>name</td><td>age</td><td>操作</td></tr>
			<c:forEach var="user" items="${userList}"  varStatus="status">
			<tr><td>${user.id }</td><td>${user.name }</td><td>${user.age }</td><td><a href="#" onclick="getUser(${user.id})">修改</a>&nbsp;&nbsp;<a href="#"onclick="delUser(${user.id})">删除</a></td></tr>
			</c:forEach>
		</table>
	</div>
	
	<div id="update" style="display:none;">
		<input id="user_id" type="hidden"/>
		姓名：<input type="text" id="name"/> &nbsp;&nbsp; 年龄：<input type="text" id="age"/>&nbsp;&nbsp;<input id="tj" type="button" value="修改"/>
	</div>

</body>


</html>