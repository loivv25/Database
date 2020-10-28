package P1;

import java.util.Date;
import java.util.Scanner;

public class Ex4_String {

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
		dpm1.DepartmentName="sale";
		
		Department dpm2= new Department();
		dpm2.DepartmentId=1;
		dpm2.DepartmentName="marketing";
		
		Department dpm3= new Department();
		dpm3.DepartmentId=1;
		dpm3.DepartmentName="IT";
		
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
		
		
		Group gr1 = new Group();
		gr1.groupId=1;
		gr1.createDate= new Date("2020/09/05");
		gr1.groupName="Java";
		
		Group gr2 = new Group();
		gr2.groupId=2;
		gr2.createDate= new Date("2020/09/05");
		gr2.groupName="PHP";
		
		Group gr3 = new Group();
		gr3.groupId=3;
		gr3.createDate= new Date("2020/09/05");
		gr3.groupName="Python";
		
		Group[] grArr = {gr1, gr2, gr3};
		
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
		
		
	
		
Ex4_String ex = new Ex4_String();
//ex.question1();
//ex.question2();
//ex.question3();
//ex.question4();
//ex.question5();
//ex.question6();
//ex.question7();
//ex.question8(grArr);
ex.question8(grArr);



	}
public void question1(){
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào chuỗi:");
	str=sc.nextLine();
	System.out.println("Số lượng ký tự: "+ str.length());	
}
public void question2(){
	String str1 = new String();
	String str2 = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào chuỗi 1:");
	str1=sc.nextLine();
	System.out.println("Nhập vào chuỗi 2:");
	str2=sc.nextLine();
	System.out.println(str1.concat(str2));	
}

public void question3(){//Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào ten:");
	str=sc.nextLine();
	str=str.toLowerCase();
	String fc = String.valueOf(str.charAt(0));
	str.trim().toLowerCase();
	System.out.println(str.replaceFirst(fc,fc.toUpperCase()));

		}
public void question4(){//Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào tên:");
	str=sc.nextLine();
	for (int i=0; i<str.length();i++){
		String ch = String.valueOf(str.charAt(i));
	System.out.println("Ký tự thứ "+(i+1)+" là: "+ch.toUpperCase());	
	}
}
public void question5(){// Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu ngườidùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
	String ho = new String();
	String ten = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào ho:");
	ho=sc.nextLine();
	System.out.println("Nhập vào tên:");
	ten=sc.nextLine();
	System.out.println("Họ tên: "+ho.trim()+" "+ten.trim());
}
public void question6(){//Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào họ tên:");
	str=sc.nextLine();
	String[] strArr = str.split(" "); // Tách chuỗi họ tên thành các mảng string tại các blankspace
	for(int i=0; i<strArr.length;i++){
	if (i==0){
		System.out.println("Họ là: "+strArr[i]);
	}
	if (i==1){
		System.out.print("Tên đệm là: "+strArr[i]);
	}
	if (i>1&& i<strArr.length-1){ // Điều kiện này để hiển thị đầy đủ tên đệm của người có nhiều tên đệm
		System.out.print(" "+strArr[i]);
	}
	if (i==strArr.length-1){
		System.out.println();
		System.out.println("Tên là: "+ strArr[i]);
	}
	}
}

public void question7(){//Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ
	String str = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào chuỗi:");
	str=sc.nextLine();
	str=str.toLowerCase();//Chuyển toàn bộ chuỗi nhập vào thành chữ thường
	String result=" ";
	String[] subStr = str.split(" ");//Tách chuỗi nhận được thành mảng các chuỗi, tách tại vị trí có blankspace
	for(int i=0;i<subStr.length;i++){
		if(subStr[i].trim().length()==0) continue;// Loại bỏ các chuỗi chỉ gồm blankspace 
		else{
		String fc = String.valueOf(subStr[i].charAt(0));//Chuyển kí tự đầu tiên của mỗi chuỗi thành string, gán cho biến fc
		subStr[i]=subStr[i].replaceFirst(fc,fc.toUpperCase());// Thay thế các kí tự đầu tiên thành ký tự in hoa
		result=result+" "+(subStr[i]);	
}
	}
}

public void question8(Group[] grArr){//In ra tất cả các group có chứa chữ "Java"
	for (int i=0; i<grArr.length; i++){
		if (grArr[i].groupName.toLowerCase().contains("java"))
			System.out.println(grArr[i].groupName);
	}
	
}
public void question9(Group[] grArr){//In ra tất cả các group "Java"
	for (int i=0; i<grArr.length; i++){
		if (grArr[i].groupName.compareToIgnoreCase("java")==0)
			System.out.println(grArr[i].groupName);
	}
}
}


