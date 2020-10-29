package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.Gender;

public class Ex5_QuanLyCanBo {
	
	public CanBo themCanBo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhập vào thông tin cán bộ: ");
		System.out.println("Họ tên:");
		String hoTen = sc.nextLine();
		System.out.println("Tuổi: ");
		int tuoi = sc.nextInt();
		System.out.println("Giới tính: ");
		String gd = sc.next();
		Gender gender = Gender.valueOf(gd.toUpperCase());
		System.out.println("Địa chỉ: ");
		sc.nextLine();
		String diaChi = sc.nextLine();
		CanBo cb = new CanBo(hoTen, tuoi, gender, diaChi);
		return cb;
	}

	public CanBo timKiem(CanBo[] cb, String fullName) {
		CanBo result = null;
		for (int i=0;i<cb.length;i++){
			if (cb[i].getFullName().equals(fullName)){
				result=cb[i];
			}
		}

		return result;
	}

	public void hienThiDS(CanBo[] cb) {
		System.out.println("DANH SÁCH CÁN BỘ:");
		System.out.printf("%-20S%-10S%-10S%-20S%n","Họ tên", "Tuổi", "Giới tính", "Địa chỉ");
		for(int i=0; i<cb.length;i++){
		if(cb[i] != null){ // bỏ qua các object null sau khi xóa
		System.out.printf("%-20s%-10s%-10s%-20s%n", cb[i].getFullName(), cb[i].getAge(), cb[i].getGender(), cb[i].getAddress());	
		}
		else continue;
	}
	}

	public boolean xoaCanBO(CanBo[] cb, String fullName) {
		boolean rs = false;
		for (int i=0;i<cb.length;i++){
			if (cb[i].getFullName().equals(fullName)){
				cb[i]=null;
				rs=true;
			}
		}
	 return rs;
	}

	public void thoat() {

	}
}