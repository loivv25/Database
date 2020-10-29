package com.vti.entity;

public class Student {
	private int studentId;
	private String name;
	private String hometown;
	private float point;
	
public Student(String name, String homtown){
	this.name = name;
	this.hometown = homtown;
	this.point=0;	
}
public void setPoint(float point){
	this.point = point;
}

public void addPoint(float point){
	this.point = (this.point+point)/2;
}
public void showInfor(Student st){
	System.out.println("Tên sinh viên: "+st.name);
	System.out.println("Điểm trung bình: "+st.point);
	String xl= null;
	if (st.point<4) xl="yếu";
	if (st.point>=4 &&st.point<6) xl ="trung bình";
	if (st.point>=6 && st.point<8) xl ="khá";
	if(st.point>=8) xl = "giỏi";
	System.out.print("Xếp loại: "+xl);
}
}
