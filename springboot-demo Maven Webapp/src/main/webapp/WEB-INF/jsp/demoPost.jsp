<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8">
<title>post请求</title>
<script src="${ctx}/js/jquery.min.js" type="text/javascript"></script>
<script>
    $(function() {
    	
		$("#tj").click(function(){
			var name = $("#text").val();
			//alert(name);
			
			$.ajax({
	    		url:"${ctx}/springboot-demo/demoPost?name="+name,
				async:true,
				type:'post',
				success:function(result){
						alert(result);
				}
			});
		});
	});
        
        
    </script>

</head>

<body>
	Welcome
	<br /> 请输入您的姓名：
	<input id="text" type="text" />
	<input id="tj" type="button" value='确定' />
	<div id="message"></div>

</body>


</html>