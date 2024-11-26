<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>counting string</title>
</head>
<body>
<%	String s="Balaji";
	int count =0;
	
	for(int i=0; i<s.length(); i++)
	{	count++;
	}
	out.println(count);
%>

</body>
</html>