<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

*{
margin-top:10px;
}
h1 {
margin-left: 70px;
}

#add {
margin-left: 100px;
}
</style>
</head>
<body>
<form action="question2.jsp">
<h1>Caculator</h1>
<label>Number 1</label>
<input type="number" step="any" name="a"></input>
<br>
<label>Number 2</label>
<input type="number" step="any" name="b"></input>
<br>
<button type="submit" name="operator" value ="add" id="add">+</button>
<button type="submit" name="operator" value="sub">-</button>
<button type="submit" name="operator" value="mul">x</button>
<button type="submit" name="operator" value="div">/</button>
<br>
<label>Result:</label>
<input></input>
</form>

</body>
</html>