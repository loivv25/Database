<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style type="text/css">
*{
box-sizing: border-box;
font-family: sans-serif;
font-size: 18px;
}
.table{
margin-top: 20px;
margin-left: 5%;
margin-right: 5%;
float: left;
width: 60%;
}
.form{
margin-right: 5%;
padding:20px 20px 20px 20px;
float:left;
width: 20%;
}

form {
padding: 20px;
width: 100%;
border: 1px solid black;
}

table, td, th {
  border: 1px solid black;
}

table {
 width:100%;
  border-collapse: collapse;
}
th {
width: 90px;
}
button {
margin-right: 20px;
}
input {
width: 100%;
	margin-bottom: 20px;
}

</style>
</head>
<body>
<div class="table">
<table>
<thead>
<tr>
<th>STT</th>
<th>Tên VXL</th>
<th>Hãng sx</th>
<th>Ngày ra mắt</th>
<th>Giá (VNĐ)</th>
</tr>
</thead>
<tbody id="tbody">

</tbody>

</table>
</div>
<div class="form">
<form>
<label>Tên VXL:</label> 
<br>
<input type="text" id="ten" name="ten"></input>
<br>
<label>Hãng sản xuất:</label>
<br>
<input type="text" id="hang" name="hang"></input>
<br>
<label>Ngày ra mắt:</label>
<br>
<input type="text"id = "ngay" name="ngay"></input>
<br>
<label>Đơn giá:</label>
<br>
<input type="text" id="gia" name="gia"></input>
<br>
<button  onclick="add()" type="submit" value="Lưu">Lưu</button>
<button onclick="resetForm()" type="button" value="Hủy">Hủy</button>
</form>
</div>

</body>

<script type="text/javascript">
var stt=0;

function add(){
	stt++;
	var ten = $("#ten").val();
	var hang = $("#hang").val();
	var ngay = $("#ngay").val();
	var gia = $("#gia").val();
	
	
	$("#tbody").append(
	'<tr>' +
	'<td>'+ stt +'</td>'+
	'<td>'+ ten +'</td>'+
	'<td>'+ hang +'</td>'+
	'<td>'+ ngay +'</td>'+
	'<td>'+ gia +'</td>'+
	'</tr>'
	)
 	
}

function resetForm(){
	$("#ten").val("");
	$("#hang").val("");
	$("#ngay").val("");
	$("#gia").val("");
}

</script>

</html>