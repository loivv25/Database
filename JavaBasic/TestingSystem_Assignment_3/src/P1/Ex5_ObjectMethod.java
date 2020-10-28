package P1;

import java.util.Date;

public class Ex5_ObjectMethod {

	public static void main(String[] args) {


		Position p2 = new Position();
		p2.positionId =1;
		p2.PositionName="Dev";
		
		Position p3 = new Position();
		p3.positionId =1;
		p3.PositionName="Test";
		
		Position p1 = new Position();
		p1.positionId =1;
		p1.PositionName="PM";
		
		Department dpm1= new Department();
		dpm1.DepartmentId=1;
		dpm1.DepartmentName="Sale";
		
		Department dpm2= new Department();
		dpm2.DepartmentId=2;
		dpm2.DepartmentName="Marketing";
		
		Department dpm3= new Department();
		dpm3.DepartmentId=3;
		dpm3.DepartmentName="IT";
		
		Department dpm4= new Department();
		dpm4.DepartmentId=4;
		dpm4.DepartmentName="Accounting";
		
		Department dpm5= new Department();
		dpm5.DepartmentId=5;
		dpm5.DepartmentName="Waiting Room";
		
		Account acc1 = new Account();
		acc1.accountId=1;
		acc1.createDate=new Date("2020/10/02");
		acc1.department = dpm1;
		acc1.email = "loivang@gmail.com";
		acc1.fullname= "Vang Van Loi";
		acc1.position=p1;
		acc1.username="loivang";
		
		Account acc2 = new Account();
		acc2.accountId=2;
		acc2.createDate=new Date("2020/10/02");
		acc2.department=dpm2;
		acc2.email = "thaodo@gmail.com";
		acc2.fullname= "Do Thi Thao";
		acc2.position=p2;
		acc2.username="thaodo";
		
		Account acc3 = new Account();
		acc3.accountId=3;
		acc3.createDate=new Date("2020/10/02");
		acc3.department =dpm2;
		acc3.email = "phamnhat.com";
		acc3.fullname= "Pham Van Nhat";
		acc3.position=p2;
		acc3.username="nhatpham";
		
		Department[] dpm = {dpm1,dpm2,dpm3,dpm4,dpm5};
		
		Ex5_ObjectMethod ex5 = new Ex5_ObjectMethod();
	//	ex5.question1(dpm1);
	//	ex5.question2(dpm);
	//	ex5.question3(dpm1);
	//	System.out.println(ex5.question4(dpm1));
	//	System.out.println(ex5.question5(dpm1,dpm5));
	//	ex5.question6(dpm);
	//	ex5.question6(dpm);
		ex5.question7(dpm);
	}
public void question1(Department d){// In ra thông tin của Department thứ nhất sử dụng toString
	System.out.println(d.toString());
	
}
public void question2(Department[] d){// In ra thông tin tất cả Department thứ nhất sử dụng toString
	for(int i=0; i<d.length;i++){
		System.out.println(d[i].toString());
	}
}
public void question3(Department d){//In ra địa chỉ của phòng ban thứ 1
	System.out.println(d.hashCode());
}
public boolean question4(Department d){//Kiểm tra phòng ban thứ nhất có tên là "Phòng A" không?
return d.DepartmentName.equals("Phòng A");	
}

public boolean question5(Department d1, Department d2){//So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
return d1.DepartmentName.equals(d2.DepartmentName);
}

public void question6(Department[] d){ //	Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)	
	Department t=null;
	for(int i=0; i<d.length-1;i++){//Bubble sort
		for(int j=0; j<d.length-1-i;j++){
			if (d[j].DepartmentName.charAt(0)> d[j+1].DepartmentName.charAt(0)){// so sánh ký tự đầu tiên của tên phòng ban{
				t=d[j];
				d[j]=d[j+1];
				d[j+1]=t;
			}	
		}
	}
	for(int i=0; i<d.length;i++){
		System.out.println(d[i].DepartmentName);// In ra tên các phòng ban đã được sắp xếp
	}
}
public void question7(Department[] d){//Khởi tạo 1 array phồng ban gồm 5 Phòng ban, sau đó in ra danh sách phòng ban được sắp xếp theo kí tự đầu tiên của từ cuối cùng trong tên phòng ban
	Department t=null;
	for(int i=0; i<d.length-1;i++){//Bubble sort
		for(int j=0; j<d.length-1-i;j++){
			String[] Dpn1 = d[j].DepartmentName.split(" ");// tách tên phòng ban thành mảng các từ 
			String[] Dpn2 = d[j+1].DepartmentName.split(" ");
			char a = Dpn1[Dpn1.length-1].charAt(0);// lấy ra ký tự đầu tiên trong từ cuối cùng của tên phòng ban
			char b = Dpn2[Dpn2.length-1].charAt(0);
			if (a>b){// so sánh 2 ký tự
				t=d[j];
				d[j]=d[j+1];
				d[j+1]=t;
			}
		}
	}
	for(int i=0; i<d.length;i++){
		System.out.println(d[i].DepartmentName);// In ra tên các phòng ban đã được sắp xếp 
	}
	
}

}
