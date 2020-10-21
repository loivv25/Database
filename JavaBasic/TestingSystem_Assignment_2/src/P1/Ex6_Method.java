package P1;

import java.util.Date;

public class Ex6_Method {

	public static void main(String[] args) {
		
Ex6_Method ex6 = new Ex6_Method();

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
dpm1.DepartmentName="sale";

Department dpm2= new Department();
dpm2.DepartmentId=1;
dpm2.DepartmentName="marketing";

Department dpm3= new Department();
dpm3.DepartmentId=1;
dpm3.DepartmentName="IT";

Group gr1 = new Group();
gr1.groupId=1;
gr1.createDate= new Date("2020/09/05");
gr1.groupName="N1";

Group gr2 = new Group();
gr2.groupId=2;
gr2.createDate= new Date("2020/09/05");
gr2.groupName="N2";

Group gr3 = new Group();
gr3.groupId=3;
gr3.createDate= new Date("2020/09/05");
gr3.groupName="N3";


Account acc1 = new Account();
acc1.accountId=1;
acc1.createDate=new Date("2020/10/02");
acc1.department = dpm1;
acc1.email = "loivang@gmail.com";
acc1.fullname= "Vang Van Loi";
acc1.position=p1;
acc1.username="loivang";
acc1.groupOfAccount= new Group[]{gr1,gr2};

Account acc2 = new Account();
acc2.accountId=2;
acc2.createDate=new Date("2020/10/02");
acc2.department=dpm2;
acc2.email = "thaodo@gmail.com";
acc2.fullname= "Do Thi Thao";
acc2.position=p2;
acc2.username="thaodo";
acc2.groupOfAccount= new Group[]{gr1,gr2,gr3};

Account acc3 = new Account();
acc3.accountId=3;
acc3.createDate=new Date("2020/10/02");
acc3.department =dpm2;
acc3.email = "phamnhat.com";
acc3.fullname= "Pham Van Nhat";
acc3.position=p2;
acc3.username="nhatpham";
acc3.groupOfAccount= new Group[]{gr1};

Account[] acc = {acc1, acc2, acc3};
//ex6.question1();
ex6.question2(acc);
//ex6.question3();

	}
public void question1(){// in ra các số nguyên dương chẵn nhỏ hơn 10
	for (int i=0; i<10; i++){
		if (i%2==0){
			System.out.println(i);
		}
	}
}

public void question3(){//in ra các số nguyên dương nhỏ hơn 10
	for (int i=0; i<10; i++){
			System.out.println(i);
		}
	}
public void question2(Account[] acc){// in ra thông tin các account
	for(int i=0; i<acc.length; i++){
		 System.out.println("Thông tin account thứ "+ (i+1) + " là:");
		 System.out.println("Account ID "+ acc[i].accountId);
		 System.out.println("Email: "+ acc[i].email);
		 System.out.println("Full name: "+acc[i].fullname);
		 System.out.println("Username: "+ acc[i].username);
		 System.out.println("Phòng ban: "+acc[i].department.DepartmentName);
		 System.out.println("Position "+ acc[i].position.PositionName);
		 System.out.print("Các nhóm đã tham gia: ");
		 for(Group gr: acc[i].groupOfAccount)
		 {
			System.out.print(gr+" "); 
		 }
		 System.out.println();
		 System.out.println("Ngày tạo: "+ acc[i].createDate);
		 System.out.println(); // cách dòng giữa các account
	}
}
}
