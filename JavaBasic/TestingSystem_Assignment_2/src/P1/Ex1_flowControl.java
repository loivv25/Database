package P1;

import java.util.Date;

public class Ex1_flowControl {
	public static void main(String[] args) {
		
		Department dpm1= new Department();
		dpm1.DepartmentId=1;
		dpm1.DepartmentName="sale";
		
		Department dpm2= new Department();
		dpm2.DepartmentId=1;
		dpm2.DepartmentName="marketing";
		
		Department dpm3= new Department();
		dpm3.DepartmentId=1;
		dpm3.DepartmentName="IT";
		
		Position p2 = new Position();
		p2.positionId =1;
		p2.PositionName="Dev";
		
		Position p3 = new Position();
		p3.positionId =1;
		p3.PositionName="Test";
		
		Position p1 = new Position();
		p1.positionId =1;
		p1.PositionName="PM";
		
		
		Group gr1 = new Group();
		gr1.groupId=1;
		gr1.createDate= new Date("2020/09/05");
		gr1.groupName="N1";
	
		
		Group gr2 = new Group();
		gr2.groupId=2;
		gr2.createDate= new Date("2020/09/05");
		gr2.groupName="N1";
		
		Group gr3 = new Group();
		gr3.groupId=3;
		gr3.createDate= new Date("2020/09/05");
		gr3.groupName="N1";
		
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
		acc3.groupOfAccount= new Group[]{gr2};
		
		Account acc4 = new Account();
		acc4.accountId=4;
		acc4.createDate=new Date("2020/10/02");
		acc4.department =dpm2;
		acc4.email = "phamminh.com";
		acc4.fullname= "Pham Van Minh";
		acc4.position=p2;
		acc4.username="nhatpham";
		acc4.groupOfAccount= new Group[]{gr2};
		
		gr1.accountOfGroup = new Account[]{acc1, acc2};
		gr2.accountOfGroup = new Account[]{acc1};
		gr3.accountOfGroup = new Account[]{acc1, acc2, acc3};
		
		GroupAccount grAcc1 =new GroupAccount();
		grAcc1.account =acc1;
		grAcc1.group=gr1;
		grAcc1.joinDate = new Date("2020/10/01");
		
		GroupAccount grAcc2 =new GroupAccount();
		grAcc2.account =acc2;
		grAcc2.group=gr1;
		grAcc2.joinDate = new Date("2020/10/01");
		
		GroupAccount grAcc3 =new GroupAccount();
		grAcc3.account =acc1;
		grAcc3.group =gr3;
		grAcc3.joinDate = new Date("2020/10/01");
		
		GroupAccount grAcc[]={grAcc1, grAcc2, grAcc3};
		Account acc[]= {acc1, acc2, acc3, acc4};
		Department dpm[] ={dpm1, dpm2, dpm3};

		
		Ex1_flowControl ex1 = new Ex1_flowControl();
//		ex1.question1(acc2);
//		ex1.question2(acc2);
//		ex1.question3(acc1);
//		ex1.question4(acc1);
//		ex1.question5(gr3);
//		ex1.question6(acc3);
//		ex1.question7(acc2);
//		ex1.question8(acc);
//		ex1.question9(dpm);
//		ex1.question10(acc);
//		ex1.question11(dpm);
//		ex1.question12(dpm);
//		ex1.question13(acc);
//		ex1.question14(acc);
		ex1.question15();
		
	}
	
	public void question1(Account acc)
	{

	if (acc.department==null){
		System.out.println("Nhân viên này chưa có phòng ban");
	}
	else 
	{
		System.out.println("Phòng ban của nhân viên này là "+acc.department.DepartmentName);
	}
}
	public void question2(Account acc){
		
	if(acc.groupOfAccount.length==0)
	{
		System.out.println("Nhan vien nay chua co group");
	}
	
	if(acc.groupOfAccount.length==1||acc.groupOfAccount.length==2)
	{
		System.out.print("Group của nhân viên này là: ");
		for(int i=0;i<acc.groupOfAccount.length;i++){
			System.out.print(acc.groupOfAccount[i].toString());
		}
	
	}
	if(acc.groupOfAccount.length==3)
	{
		System.out.println("Nhan vien nay la nguoi quan trong, tham gia nhieu group");
	}
	if(acc.groupOfAccount.length>=4)
	{
		System.out.println("Nhân viên này là người hóng chuyện tham gia tất cả các group");
	}
	
	}
	
	public void question3(Account acc){
		System.out.println(acc.department == null ? "nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là "+ acc.department.DepartmentName);
	}
	
	public void question4(Account acc){
		System.out.println(acc.position.PositionName=="dev" ? "Đây là developer" : "Đây không phải là Developer");
	}
	
	public void question5(Group gr){
		switch (gr.accountOfGroup.length){
		case 0:
			System.out.println("Nhóm không có thành viên nào");
			break;
		case 1:
			System.out.println("Nhóm có một thành viên");
			break;
		case 2:
			System.out.println("Nhóm có hai thành viên");
			break;
		case 3:
			System.out.println("Nhóm có ba thành viên");
			break;
		default:
			System.out.println("Nhóm có nhiều thành viên");
		}
		;
	}
	
	public void question6(Account acc){
		switch (acc.groupOfAccount.length){
		case 0:
			System.out.println("Nhân viên này chưa có nhóm nào");
			break;
		default:
		{
			System.out.print("Nhóm của nhân viên này là: ");
			for(int i=0;i<acc.groupOfAccount.length;i++){
				System.out.print(acc.groupOfAccount[i].toString());
				System.out.println();
		}
		}
	}
	
}
public void question7(Account acc){
		switch (acc.position.PositionName){
			case "dev":
				System.out.println("Nhân viên này là Developer");
				break;
			default:
				System.out.println("Nhân viên này không phải Dev");
		}		
	}
  public void question8(Account[] acc){
	  for(Account ac: acc){
		  System.out.println(ac.email+ac.fullname+ac.department.DepartmentName);
	  } 
  }
  
  public void question9(Department[] dpm){
	  for(Department d: dpm){
		 System.out.println(d.DepartmentId + " "+ d.DepartmentName); 
	  }
  }
 public void question10(Account[] acc){
	 for(int i=0; i<acc.length; i++){
		 System.out.println("Thông tin account thứ "+(i+1)+" là:");
		 System.out.println("Email: "+ acc[i].email);
		 System.out.println("Full name: "+acc[i].fullname);
		 System.out.println("Phòng ban: "+acc[i].department.DepartmentName);
		 System.out.println(); // cách dòng giữa các account
	 }
	 
 }
 public void question11(Department[] dpm){
	 for(int i=0;i<dpm.length;i++){
		 System.out.println("Thông tin departmet thứ "+(i+1)+" là:");
		 System.out.println("	ID: "+ dpm[i].DepartmentId);
		 System.out.println("	Name: "+ dpm[i].DepartmentName);
		 System.out.println();
	 }
 }
 
public void question12(Department[] dpm){
	for(int i=0; i<2;i++){
		 System.out.println("Thông tin departmet thứ "+(i+1)+" là:");
		 System.out.println("	ID: "+ dpm[i].DepartmentId);
		 System.out.println("	Name: "+ dpm[i].DepartmentName);
		 System.out.println();
	}
}
public void question13(Account[] acc){
	for(int i=0; i<acc.length;i++){
		if(i!=1){
			 System.out.println("Thông tin account thứ "+(i+1)+" là:");
			 System.out.println("Email: "+ acc[i].email);
			 System.out.println("Full name: "+acc[i].fullname);
			 System.out.println("Phòng ban: "+acc[i].department.DepartmentName);
			 System.out.println();
		}
		else {
			 continue;	
		}
	}
}
public void question14(Account[] acc){
	for(int i=0; i<acc.length;i++){
		if(acc[i].accountId<4){
			 System.out.println("Email: "+ acc[i].email);
			 System.out.println("Full name: "+acc[i].fullname);
			 System.out.println("Phòng ban: "+acc[i].department.DepartmentName);
			 System.out.println();

		}
		else{
			continue;
		}
	}
}

public void question15(){
	for(int i=0;i<=20;i++)
	{
		if (i%2==0){
			System.out.println(i);
		}
		else 
			continue;
	}
}
}
