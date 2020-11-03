package com.vti.backend;

import com.vti.entity.Student;

public class MyStudent {
	Student  student[] = new Student[10];
public void initStudent(){
	student[0]=new Student(1,"Lợi",1);
	student[1]=new Student(2,"Thảo",2);
	student[2]=new Student(3,"Dương",3);
	student[3]=new Student(4,"Minh",1);
	student[4]=new Student(5,"Huyền",2);
	student[5]=new Student(6,"Nhật",3);
	student[6]=new Student(7,"Hùng",1);
	student[7]=new Student(8,"Hà",2);
	student[8]=new Student(9,"Hải",3);
	student[9]=new Student(10,"Hậu",1);
	}
public void caLopDiemDanh(){
	for(Student std:student){
		std.diemDanh();
	}
}

public void goiHocBai(){
	for(Student std:student){
		if (std.getGroup()==1){
			std.hocBai();
		}
	}
}

public void goiDonVeSinh(){
	for(Student std: student){
		if(std.getGroup()==2){
			std.donVeSinh();
		}
	}
}
}
