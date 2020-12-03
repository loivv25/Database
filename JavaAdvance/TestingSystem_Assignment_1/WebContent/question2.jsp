<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
float a = Float.parseFloat(request.getParameter("a"));
float b = Float.parseFloat(request.getParameter("b"));
String operator = request.getParameter("operator");
switch (operator) {
case "add": {
	out.print(a+"+"+b+"="+(a+b));
}
break;
case "sub": out.print(a+"-"+b+"="+(a-b));
break;

case "mul":out.print(a+"x"+b+"="+(a*b));
break;

case "div":out.print(a+"/"+b+"="+(a/b));
break;

}


%>

</body>
</html>