package com.vti.frontend;


import java.util.Scanner;

import com.vti.backend.Ex5_QuanLyCanBo;
import com.vti.entity.CanBo;
import com.vti.entity.Gender;

public class Ex5_Run_QuanLyCanBo {
	
	public static void main(String[] args) {
		CanBo cb1 = new CanBo("Vàng Văn Lợi",22,Gender.valueOf("NAM"),"Lai Châu");
		CanBo cb2 = new CanBo("Nguyễn Như Linh",22,Gender.valueOf("NỮ"),"Hà Nội");
		CanBo cb3 = new CanBo("Trần Văn Lực",23,Gender.valueOf("NAM"),"Hải Dương");
		CanBo cb4 = new CanBo("Nguyễn Thị Thảo",21,Gender.valueOf("NỮ"),"Hải Phòng");
		CanBo cb5 = new CanBo("Vàng Văn Tuấn",22,Gender.valueOf("NAM"),"Lai Châu");
		CanBo[] cb = {cb1, cb2, cb3, cb4, cb5};
		Scanner sc = new Scanner(System.in);
		Ex5_QuanLyCanBo ex5 = new Ex5_QuanLyCanBo();
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
				if(as.equals("không"))
				 break;
				else continue;
			
			
			
		}
		
		if (stt==2){
			System.out.println("Bạn đã nhập sai, mời nhập lại (giá trị 1-5)");
		}
		
		System.out.println("Nhập vào số tương ứng với chức năng muốn thực hiện:");
		System.out.println("1, Thêm cán bộ");
		System.out.println("2, Tìm kiếm cán bộ theo tên");
		System.out.println("3, Hiển thị danh sách cán bộ");
		System.out.println("4, Xóa cán bộ theo tên");
		System.out.println("5, Thoát");
		int mode =0;
		mode = sc.nextInt();
		if (mode >0 && mode <6){
			switch (mode){
			case 1: 
				CanBo[] cbt = new CanBo[cb.length+1]; 
				for (int i=0;i<cb.length;i++ ){ // Thêm cán bộ mới tạo vào mảng cán bộ
					cbt[i]=cb[i];
				}
				cbt[cb.length]=ex5.themCanBo();
				cb=cbt;
				break;
			
			case 2:{ 
				System.out.println("Nhập vào tên cán bộ muốn tìm kiếm: ");
				sc.nextLine();
				String fn = sc.nextLine();
				CanBo rs = ex5.timKiem(cb,fn.trim());
				if (rs==null){
					System.out.println("Không có kết quả trùn khớp");
				}
				else{
					System.out.println("Kết quả tìm kiếm: ");
					System.out.println(rs.toString());
				}
				break;}
			
			case 3: ex5.hienThiDS(cb);
					break;
			case 4: {
				System.out.println("Nhập vào tên cán bộ muốn xóa: ");
				sc.nextLine();
			    String fn = sc.nextLine().trim();
				boolean rs = ex5.xoaCanBO(cb, fn);
				if (rs==true) System.out.println("Xóa thành công");
				else System.out.println("Xóa thất bại, không tìm thấy tên trùng khớp");
				}
			    break;
			case 5: 
				b=false;
				break;
			}
			
		stt=1;
		}
		else stt=2;
		
	}

}
}
