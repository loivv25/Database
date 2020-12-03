<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
*{
box-sizing: border-box;
font-family: sans-serif;
font-size: 18px;
margin-bottom: 10px;
}

input{
position: position;
left: 50px;
}
</style>
</head>
<body>
<form action="question6.jsp">
<label>Họ tên</label>
<input type="text" name="hoTen"></input><br>

<label>Ngày sinh</label>
<input type="date" name="ngaySinh"></input><br>

<label>Giới tính</label><br>
<input type="radio" id="male" name="gender" value="male">
  <label for="male">Male</label><br>
  <input type="radio" id="female" name="gender" value="female">
  <label for="female">Female</label><br>
  <input type="radio" id="other" name="gender" value="other">
  <label for="other">Other</label><br>
  
<label>Số điện thoại</label>
<input type="number" name="dienThoai"></input>

<button type="submit" value="Lưu">Lưu</button>
<button onclick="resetForm()" type="button" value="Hủy">Hủy</button>

</form>
</body>

<script type="text/javascript">
function resetForm(){
	$("#ten").val("");
	$("#hang").val("");
	$("#ngay").val("");
	$("#gia").val("");
}
</script>
</html>