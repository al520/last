<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<script type="text/javascript">
					
</script>
<body>
<table>

<tr>
<td>日期</td>
<td>警告级别</td>
</tr>

<c:forEach items="${list }" var="b">
<tr>
<td>${b.ydate }</td>
<td>${b.jing }</td>
</tr>
</c:forEach>

</table>
</body>
</html>