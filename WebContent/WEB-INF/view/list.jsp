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
					function tigao(){
						var ids="";
						$(":checkbox[name='check']:checked").map(function(){
							ids+=","+$(this).val();
						})
						ids=ids.substring(1);
						location.href="/baoyu/totigao?id="+ids;
					}
					function jiang(){
						var ids="";
						$(":checkbox[name='check']:checked").map(function(){
							ids+=","+$(this).val();
						})
						ids=ids.substring(1);
						location.href="/baoyu/jiang?id="+ids;
					}
					function tocha(){
						var id=$(":checkbox:checked").val();
						location.href="/baoyu/tocha?id="+id;
					}
</script>
<body>
<table>
<tr><td>${login.username}
<c:if test="${login.username!=null }">
<a href="loginout.action">退出</a>
</c:if></td></tr>
<tr>
<td><input type="button" value="提高等级" onclick="tigao()"/></td>
<td><input type="button" value="降低等级" onclick="jiang()"/></td>
<td><input type="button" value="查看详情" onclick="tocha()"/></td>
</tr>
<tr>
<td>区县</td>
<td>警告级别</td>
</tr>

<c:forEach items="${list }" var="b">
<tr>
<td><input type="checkbox" value="${b.id }" name="check"/></td>
<td>${b.xian }</td>
<td>${b.jing }</td>
</tr>
</c:forEach>

</table>
</body>
</html>