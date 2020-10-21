package P1;
import java.util.Date;  
import java.text.SimpleDateFormat;
public class Ex2_SystemOutPrintf {

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
		
	Ex2_SystemOutPrintf ex2 = new Ex2_SystemOutPrintf();
//	ex2.question1();
//	ex2.question2();
//	ex2.question3();
//	ex2.question4();
//	ex2.question5();
	ex2.question6(acc);
	}
public void question1(){
	int i=5;
	System.out.printf("i=%d\n",i);
}

public void question2(){
	int i=100000000;
	System.out.printf("i=%,d\n",i);
}
public void question3(){
	float i=5.567098f;
	System.out.printf("i=%.4f\n",i);
}
public void question4(){
	String fn = "Vàng Văn Lợi";
	System.out.printf("Tôi tên là \"%s\" và tôi đang độc thân\n",fn);
}
public void question5(){
	String pattern ="dd/MM/yyyy HH:mm:ss";
	SimpleDateFormat df = new SimpleDateFormat(pattern);
	Date date= new Date();
	System.out.println(df.format(date));
}
public void question6(Account[] acc){
	System.out.printf("%-25S%-25S%-25S%n","Email","Fullname","Department");
	for(Account ac: acc){
		  System.out.printf("%-25s%-25s%-25s%n",ac.email,ac.fullname,ac.department.DepartmentName);
	  } 
}
}
