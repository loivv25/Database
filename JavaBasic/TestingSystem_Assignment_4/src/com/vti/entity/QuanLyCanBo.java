package com.vti.entity;

import java.util.Scanner;

public class QuanLyCanBo {
public CanBo themCanBo(){
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Nhập vào thông tin cán bộ: ");
	System.out.println("Họ tên:");
	String hoTen = sc.nextLine();
	System.out.println("Tuổi: ");
	int tuoi = sc.nextInt();
	System.out.println("Giới tính: ");
	String gd =sc.next();
	Gender gender = Gender.valueOf(gd);
	System.out.println("Địa chỉ: ");
	String diaChi =sc.next();
	CanBo cb = new CanBo(hoTen, tuoi,gender, diaChi);
	return cb;
		
}
public CanBo timKiem(String fullName){
	CanBo result = null;
	
	
	return result;
}
public void hienThiDS(){
	
}
public void xoaCanBO(String fullname){
	
}

}
