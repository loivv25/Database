<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table, td, th {
  border: 1px solid black;
  width: 500px;
}

table {
  border-collapse: collapse;
}

</style>

</head>
<body>

<div class="table">
<table>
<thead>
<tr>
<th>STT</th>
<th>Họ tên</th>
<th>Năm sinh</th>
<th>Giới tính</th>
<th>Số điện thoại</th>
</tr>
</thead>
<tbody id="tbody">
<tr>
<td>
</td>
<td>
<%=request.getParameter("hoTen") %>
</td>
<td>
<%=request.getParameter("ngaySinh") %>
</td>
<td>
<%=request.getParameter("gender") %>
</td>
<td>
<%=request.getParameter("dienThoai") %>
</td>

</tr>
</tbody>

</table>
</div>

</body>
</html>