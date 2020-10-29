package com.vti.frontend;

import com.vti.backend.Ex5_QuanLyCanBo;
import com.vti.entity.Student;

public class Ex4_Run_Encapsulation {

	public static void main(String[] args) {
	Student st = new Student("Lợi","Lai Châu");
	st.setPoint(9);
	st.addPoint(6);
	st.showInfor(st);
	}

}
