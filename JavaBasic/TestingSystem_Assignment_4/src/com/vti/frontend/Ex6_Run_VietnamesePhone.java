package com.vti.frontend;

import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.Contact;
import com.vti.entity.Phone;
import com.vti.entity.VietnamesePhone;

public class Ex6_Run_VietnamesePhone {

	public static void main(String[] args) {
		Phone vnp = new VietnamesePhone();
		
		
		
		Scanner sc = new Scanner(System.in);
		boolean b=true;
		int stt =0; //lưu trạng thái để hiển thị nội dung phù hợp: 0: nhập lần đầu, 1: không phải lần đầu, 2: sau lần nhập sai
		while (b){
		
		if (stt==1){
			System.out.println("Bạn có muốn tiếp tục không? (trả lời: có/không)");
			String as = sc.next().trim().toLowerCase();
			if (as.equals("có")){
				stt=0;
				continue;
			}
			else	
				if(as.equals("không")){
					 break;			
				}
		
				else continue;
	
		}
		
		if (stt==2){
			System.out.println("Bạn đã nhập sai, mời nhập lại (giá trị 1-5)");
		}
		
		System.out.println("Nhập vào số tương ứng với chức năng muốn thực hiện:");
		System.out.println("1, Thêm một liên hệ");
		System.out.println("2, Hiển thị danh sách liên hệ");
		System.out.println("3, Sửa một liên hệ");
		System.out.println("4, Xóa một liên hệ theo tên");
		System.out.println("5, Thoát");
		
		int mode =0;
		mode = sc.nextInt();
		if (mode >0 && mode <6){
			switch (mode){
			case 1:{ 
				System.out.println("Nhập vào tên: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Nhập vào số ĐT: ");
				String number = sc.next();
				vnp.insertContact(name,number);
				break;}
			case 2: vnp.displayContact();
			break;
			case 3:{
				System.out.println("Nhập vào tên liên hệ muốn cập nhật số ĐT: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Nhập vào số ĐT mới: ");
				String number = sc.next();
				sc.nextLine();vnp.updateContact(name,number);
				break;}
			case 4: {
				System.out.println("Nhập vào tên muốn xóa liên hệ: ");
				sc.nextLine();
				String name = sc.nextLine();
				vnp.removeContact(name);
				break;}
			
			case 5: b=false;
				break;
		} 
			stt=1;
		}
		else stt=2;	
	}
}
}
