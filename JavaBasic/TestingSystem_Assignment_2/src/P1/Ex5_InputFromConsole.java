package P1;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Ex5_InputFromConsole {

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
		
		TypeQuestion tp1 = new TypeQuestion();
		tp1.typeId=1;
		tp1.typeName="essay";
		
		TypeQuestion tp2 = new TypeQuestion();
		tp2.typeId=1;
		tp2.typeName="Multi-choice";
		
		CategoryQuestion cateQ1 = new CategoryQuestion();
		cateQ1.categoryId=1;
		cateQ1.categoryName="Database";
		
		CategoryQuestion cateQ2 = new CategoryQuestion();
		cateQ2.categoryId=1;
		cateQ2.categoryName="Javabasic";
		
		CategoryQuestion cateQ3 = new CategoryQuestion();
		cateQ3.categoryId=1;
		cateQ3.categoryName="Front-end";
		
		Question q1 = new Question();
		q1.questionId=1;
		q1.category=cateQ1;
		q1.Content="KhÃ³a chÃ­nh lÃ  gÃ¬?";
		q1.createDate = new Date("2020/08/02");
		q1.type = tp1;
		q1.creator=acc1;
		
		Question q2 = new Question();
		q2.questionId=1;
		q2.category=cateQ2;
		q2.Content="KhÃ³a ngoáº¡i lÃ  gÃ¬";
		q2.createDate = new Date("2020/07/02");
		q2.type=tp1;
		q2.creator=acc2;
		
		Question q3 = new Question();
		q3.questionId=1;
		q3.category=cateQ2;
		q3.Content="so sÃ¡nh unique vÃ  primary key";
		q3.createDate = new Date("2020/08/02");
		q3.type=tp2;
		q3.creator=acc3;
	
		Answer asw1 = new Answer();
		asw1.answerId=1;
		asw1.content="";
		asw1.isCorrect=true;
		
		Answer asw2 = new Answer();
		asw2.answerId=2;
		asw2.content="";
		asw2.isCorrect=true;
		
		Answer asw3 = new Answer();
		asw3.answerId=3;
		asw3.content="";
		asw3.isCorrect=true;
		
		Exam exam1= new Exam();
		exam1.examId=1;
		exam1.category = cateQ1;
		exam1.code = "TEST01";
		exam1.createDate = new Date("2020/10/01");
		exam1.creator=acc2;
		exam1.duration=60;
		exam1.title="Database Testing 1";
		
		Exam exam2= new Exam();
		exam2.examId=3;
		exam2.category = cateQ2;
		exam2.code = "TEST02";
		exam2.createDate = new Date("2020/10/01");
		exam2.creator=acc3;
		exam2.duration=60;
		exam2.title="Database Testing 1";
	
		Exam exam3= new Exam();
		exam3.examId=3;
		exam3.category = cateQ2;
		exam3.code = "TEST02";
		exam3.createDate = new Date("2020/10/01");
		exam3.creator=acc1;
		exam3.duration=60;
		exam3.title="Database Testing 1";

		
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
		
		Position[] p = {p1,p2,p3};
		Account[] acc = {acc1, acc2, acc3};
		Group[] gr = {gr1, gr2, gr3};
		
	Ex5_InputFromConsole ex5 = new Ex5_InputFromConsole();
//	ex5.question1();
//	ex5.question2();
//	ex5.question3();
//	ex5.question4();
//	ex5.question5(p);
//	ex5.question6();
//	ex5.question7();
//	ex5.question8()
//  ex5.question9(acc,gr);
//  ex5.question10(p,gr,acc);
	ex5.question11(p, gr, acc);
	

	}
public void question1(){
	int a;
	int b;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào số nguyên a:");
	a= sc.nextInt();
	System.out.println("Nhập vào số nguyên b:");
	b= sc.nextInt();
	System.out.println("Nhập vào số nguyên c:");
	c= sc.nextInt();		
	}

public void question2(){
	float a;
	float b;
	float c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào số thực a:");
	a= sc.nextInt();
	System.out.println("Nhập vào số thực b:");
	b= sc.nextInt();
	System.out.println("Nhập vào số thực c:");
	c= sc.nextInt();		
	}
public void question3(){
	String name = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào họ và tên:");
	name = sc.nextLine();
}
public void question4(){
	String date = null;
	Scanner sc = new Scanner(System.in);	
	System.out.println("Nhập vào ngày sinh:");
	date = sc.next();
}
public void question5(Position[] p){
	Account acc= new Account();
	Scanner sc= new Scanner(System.in);
	
	System.out.print("Account ID:");
	acc.accountId = sc.nextInt();
	
	System.out.print("Email:");
	acc.email = sc.next();
	
	System.out.print("Full name:");
	sc.nextLine(); // lệnh này để hấp thụ dòng mới
	acc.fullname = sc.nextLine();
	System.out.print("Position:");
	int pId = sc.nextInt();
	
	for (int i=0; i<p.length;i++){ // Gán position cho account
	if(p[i].positionId==pId){
	 acc.position = p[i];
	}
	Date date = new Date();
	acc.createDate = date;
	}
	System.out.println(acc.toString());
}
public void question6(){//Viết method cho phép người dụng tạo Department
	Department dpm = new Department();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào id phòng ban: ");
	dpm.DepartmentId = sc.nextInt();
	System.out.println("Nhập vào tên phòng ban: ");
	sc.nextLine();//
	dpm.DepartmentName=sc.nextLine();

 System.out.println(dpm.toString());	
}
public void question7(){//Nhập số chẵn từ console
	int evenNum;
	
	Scanner sc = new Scanner(System.in);
	do{ evenNum = sc.nextInt();}
	while (evenNum%2!=0);
	System.out.println("Even number ="+evenNum);
		
	}
public void question8(Position[] p){
	Scanner sc = new Scanner(System.in);
	int select;
	int times =0;// Đếm số lần nhập
	Ex5_InputFromConsole ex = new Ex5_InputFromConsole();
	do{	
		if(times==1){
		System.out.println("Bạn đã nhập sai, mời bạn nhập lại!");// times =0 nhập lần đầu, times=1 đã nhập sai ít nhất 1 lần, hiển thị nội dung mời nhập lại
	}
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng:");
		System.out.println("1, Tạo account");
		System.out.println("2, Tạo deparment");
		times=1;
		select=sc.nextInt();}
	while (select!=1 && select !=2);
	
	if (select==1){
		ex.question5(p);
	}
	else
	{
		ex.question6();
	}	
}

public void question9(Account[] acc, Group[] gr){// Viết method cho phép người dùng thêm account vào group theo flow sau:
//Buoc1: in ra cac username cho nguoi dung xem
	System.out.println("Username của các users:"); 
	for(int i =0; i<acc.length; i++){
		System.out.println(acc[i].username);
	}	
//Buoc 2: nguoi dung nhap vao 1 username:
	String inUsername = new String();
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhập vào username:");
	inUsername = sc.next();
	
//Buoc3: in ra ten cac group cho nguoi dung xem
	System.out.println("Cac groups:"); 
	for(int i =0; i<gr.length; i++)
	{
		System.out.println(gr[i].groupName);
	}
//Buoc4: Yêu cầu người dùng nhập vào tên Group
	String inGroup = new String();
	System.out.println("Nhập vào tên Group:");
	sc.nextLine();
	inGroup = sc.nextLine();
//Buoc5: Thêm group vào mảng các group của Account
	
	for(int i =0; i<acc.length; i++){
		
		
		if(acc[i].username.equals(inUsername)){// Tìm ra Account mà người dùng vừa nhập vào username ở Bước 2
	
			Group[] grOfAcc =new Group[acc[i].groupOfAccount.length+1]; // Tạo mới một mảng (trung gian) mới để chứa mảng các group cũ + 1 group mới thêm vào
			for(int j=0; j<gr.length;j++){ //Tìm group theo GroupName mà người dùng nhập vào ở Bước 3
				if(gr[j].groupName.equals(inGroup)){
				grOfAcc[0]=gr[j];	// Thêm group tìm được vào vị trí đầu tiên của mảng mới tạo ở trên.
				}
			}
			int n=1;
		for(int k=0; k<acc[i].groupOfAccount.length;k++){ // Chuyển các group cũ trong mảng groupOfAccount sang mảng trung gian 
			grOfAcc[n]=acc[i].groupOfAccount[k];
			n=n+1;
			
		}
		
		acc[i].groupOfAccount=grOfAcc;
		System.out.println(acc[i]);// Gán thuộc tính groupOfAccount bằng mảng trung gian grOfAcc
		}
		}
// Sau đó ta cần thêm account vào mảng các account trong lớp Group, tương tự như trên. 
}



public void question10(Position[] p, Group[] gr, Account[] acc){
	int i =1; 
	int mode =0;
	int select =0;
	Scanner sc = new Scanner(System.in);
	Ex5_InputFromConsole ex = new Ex5_InputFromConsole();
	while (i==1)
	{
		if(mode == 1)
			{System.out.println("Bạn đã nhập sai, mời bạn nhập lại!");}
		if(mode == 2)
			{
			System.out.println("Bạn có muốn tiếp tục không? (trả lời yes/no)");
			String ask = new String();
			ask=sc.next();
			if (ask.equals("yes"))
			{
				mode=0;
			}
			if (ask.equals("no"))
				return; // thoát khỏi hàm tại đây
			//(hoặc mode =0)
			
			}
		
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng:");
		System.out.println("1, Tạo account");
		System.out.println("2, Tạo deparment");
		System.out.println("3, Thêm group cho account");
	   
		select = sc.nextInt();
		if(select != 1 && select !=2 && select !=3){
		mode =1;	
		}
		else 
		{
			switch (select)
			{
			case 1:
				ex.question5(p);
				break;
			case 2:
				ex.question6();
				break;
			case 3:
				ex.question9(acc, gr);
				break;
			}
			mode =2;
		}
	}
	return;
}

public void addRandomGroup(Account[] acc, Group[] gr){// Viết method cho phép người dùng thêm account vào group theo flow sau:
	//Buoc1: in ra cac username cho nguoi dung xem
		System.out.println("Username của các users:"); 
		for(int i =0; i<acc.length; i++){
			System.out.println(acc[i].username);
		}	
	//Buoc 2: nguoi dung nhap vao 1 username:
		String inUsername = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào username:");
		inUsername = sc.next();
		
	//Buoc3: Chọn random 1 group
		Random rd = new Random();
		int rdInt = rd.nextInt(gr.length);
		Group rdg = gr[rdInt];
		
	//Buoc4: Thêm group ở bước 3 vào mảng các group của Account
		
		for(int i =0; i<acc.length; i++){
			
			if(acc[i].username.equals(inUsername)){// Tìm ra Account mà người dùng vừa nhập vào username ở Bước 2
		
			Group[] grOfAcc =new Group[acc[i].groupOfAccount.length+1]; // Tạo mới một mảng (trung gian) mới để chứa mảng các group cũ + 1 group mới thêm vào
			grOfAcc[0]=rdg;	// Thêm group tìm được vào vị trí đầu tiên của mảng mới tạo ở trên.
					
				
				int n=1;
			for(int k=0; k<acc[i].groupOfAccount.length;k++){ // Chuyển các group cũ trong mảng groupOfAccount sang mảng trung gian 
				grOfAcc[n]=acc[i].groupOfAccount[k];
				n=n+1;	
			}
			acc[i].groupOfAccount=grOfAcc;
			System.out.println(acc[i]);// Gán thuộc tính groupOfAccount bằng mảng trung gian grOfAcc
	 	}
	}
	// Sau đó ta cần thêm account vào mảng các account trong lớp Group, tương tự như trên. 
	}

public void question11(Position[] p, Group[] gr, Account[] acc){
	int i =1; 
	int mode =0;
	int select =0;
	Scanner sc = new Scanner(System.in);
	Ex5_InputFromConsole ex = new Ex5_InputFromConsole();
	while (i==1)
	{
		if(mode == 1)
			{System.out.println("Bạn đã nhập sai, mời bạn nhập lại!");}
		if(mode == 2)
			{
			System.out.println("Bạn có muốn tiếp tục không? (trả lời yes/no)");
			String ask = new String();
			ask=sc.next();
			if (ask.equals("yes"))
			{
				mode=0;
			}
			if (ask.equals("no"))
				return; // thoát khỏi hàm tại đây
			//(hoặc mode =0)
			
			}
		
		System.out.println("Mời bạn nhập vào chức năng muốn sử dụng:");
		System.out.println("1, Tạo account");
		System.out.println("2, Tạo deparment");
		System.out.println("3, Thêm group cho account");
		System.out.println("4, Thêm group ngẫu nhiên cho account");
	   
		select = sc.nextInt();
		if(select != 1 && select !=2 && select !=3 && select !=4){
		mode =1;	
		}
		else 
		{
			switch (select)
			{
			case 1:
				ex.question5(p);
				break;
			case 2:
				ex.question6();
				break;
			case 3:
				ex.question9(acc, gr);
				break;
			case 4:
			{	ex.addRandomGroup(acc, gr);
				break;
			}
			}
			mode =2;
		}
	}
	return;
}

}




