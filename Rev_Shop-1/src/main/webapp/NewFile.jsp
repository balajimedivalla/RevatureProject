<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>reverse string</title>
</head>
<body>

<%	String s= "balaji";
	String temp ="";
	for(int i=s.length()-1; i>=0;i++)
	{
		temp = temp+ s.charAt(i);
	}
	
	%>
	<%= out.println(temp); %>
</body>
</html>