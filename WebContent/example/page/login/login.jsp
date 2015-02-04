<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css"></style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My First  Pate</title>
</head>
<body>
		<div id='content'>
			<form  id='bashForm' action="<%=request.getContextPath()%>/j_spring_security_check" method="post">
				<input type="text" name="j_username"><br>
				<input type="text" name="j_password"><br>
				<button onclick="submit">登陆</button>
			</form>
		
		</div>
</body>
<script type="text/javascript">
	function submit(){
		document.getElementById("bashForm").action = "<%=request.getContextPath()%>/j_spring_security_check";
		document.getElementById("bashForm").submit();
	}


</script>
</html>