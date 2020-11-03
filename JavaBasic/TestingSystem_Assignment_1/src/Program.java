import java.util.Date;

public class Program {

	public static void main(String[] args){
		
		Account acc1 = new Account();
		acc1.accountId=1;
		acc1.createDate=new Date("2020/10/02");
		acc1.departmentId =1;
		acc1.email = "loivang@gmail.com";
		acc1.fullname= "Vang Van Loi";
		acc1.positionId=1;
		acc1.username="loivang";
		
		Account acc2 = new Account();
		acc2.accountId=2;
		acc2.createDate=new Date("2020/10/02");
		acc2.departmentId =2;
		acc2.email = "thaodo@gmail.com";
		acc2.fullname= "Do Thi Thao";
		acc2.positionId=1;
		acc2.username="thaodo";
		
		Account acc3 = new Account();
		acc3.accountId=3;
		acc3.createDate=new Date("2020/10/02");
		acc3.departmentId =1;
		acc3.email = "phamnhat.com";
		acc3.fullname= "Pham Van Nhat";
		acc3.positionId=1;
		acc3.username="nhatpham";
		
		Question q1 = new Question();
		q1.questionId=1;
		q1.categoryId=1;
		q1.Content="Khóa chính là gì?";
		q1.createDate = new Date("2020/08/02");
		q1.typeId=1;
		q1.creatorId=1;
		
		Question q2 = new Question();
		q2.questionId=1;
		q2.categoryId=1;
		q2.Content="Khóa ngoại là gì";
		q2.createDate = new Date("2020/07/02");
		q2.typeId=1;
		q2.creatorId=2;
		
		Question q3 = new Question();
		q3.questionId=1;
		q3.categoryId=1;
		q3.Content="so sánh unique và primary key";
		q3.createDate = new Date("2020/08/02");
		q3.typeId=2;
		q3.creatorId=3;
	
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
		
		CategoryQuestion cateQ1 = new CategoryQuestion();
		cateQ1.categoryId=1;
		cateQ1.categoryName="Database";
		
		CategoryQuestion cateQ2 = new CategoryQuestion();
		cateQ2.categoryId=1;
		cateQ2.categoryName="Javabasic";
		
		CategoryQuestion cateQ3 = new CategoryQuestion();
		cateQ3.categoryId=1;
		cateQ3.categoryName="Front-end";
		
		Department dpm1= new Department();
		dpm1.DepartmentId=1;
		dpm1.DepartmentName="sale";
		
		Department dpm2= new Department();
		dpm2.DepartmentId=1;
		dpm2.DepartmentName="marketing";
		
		Department dpm3= new Department();
		dpm3.DepartmentId=1;
		dpm3.DepartmentName="IT";
		
		TypeQuestion tp1 = new TypeQuestion();
		tp1.typeId=1;
		tp1.typeName="essay";
		
		TypeQuestion tp2 = new TypeQuestion();
		tp2.typeId=1;
		tp2.typeName="Multi-choice";
		
		Exam exam1= new Exam();
		exam1.examId=1;
		exam1.categoryId = 1;
		exam1.code = "TEST01";
		exam1.createDate = new Date("2020/10/01");
		exam1.creatorId=1;
		exam1.duration=60;
		exam1.title="Database Testing 1";
		
		Exam exam2= new Exam();
		exam2.examId=3;
		exam2.categoryId = 1;
		exam2.code = "TEST02";
		exam2.createDate = new Date("2020/10/01");
		exam2.creatorId=1;
		exam2.duration=60;
		exam2.title="Database Testing 1";
	
		Exam exam3= new Exam();
		exam3.examId=3;
		exam3.categoryId = 1;
		exam3.code = "TEST02";
		exam3.createDate = new Date("2020/10/01");
		exam3.creatorId=2;
		exam3.duration=60;
		exam3.title="Database Testing 1";

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
		
		GroupAccount grAcc1 =new GroupAccount();
		grAcc1.AccountId =1;
		grAcc1.groupId=1;
		grAcc1.joinDate = new Date("2020/10/01");
		
		GroupAccount grAcc2 =new GroupAccount();
		grAcc2.AccountId =1;
		grAcc2.groupId=1;
		grAcc2.joinDate = new Date("2020/10/01");
		
		GroupAccount grAcc3 =new GroupAccount();
		grAcc3.AccountId =1;
		grAcc3.groupId=1;
		grAcc3.joinDate = new Date("2020/10/01");
		
		
		Position p2 = new Position();
		p2.positionId =1;
		p2.PositionName="Dev";
		
		Position p3 = new Position();
		p3.positionId =1;
		p3.PositionName="Test";
		
		Position p1 = new Position();
		p1.positionId =1;
		p1.PositionName="PM";
		
		System.out.println(acc1.email);
		System.out.println(acc2.fullname);
		System.out.println(acc3.accountId);
		
		System.out.println(q1.categoryId);
		System.out.println(q2.Content);
		System.out.println(q3.creatorId);
		
		System.out.println(dpm1.DepartmentName);
		System.out.println(dpm2.DepartmentId);
		System.out.println(dpm3.DepartmentName);
		
		System.out.println(q1.categoryId);
		System.out.println(q2.creatorId);
		System.out.println(q3.Content);
		
		System.out.println(exam1.categoryId);
		System.out.println(exam2.code);
		System.out.println(exam3.duration);
		
		System.out.println(gr1.creatorId);
		System.out.println(gr2.groupName);
		System.out.println(gr3.creatorId);
		
		System.out.println(grAcc1.AccountId);
		System.out.println(grAcc2.groupId);
		System.out.println(grAcc3.joinDate);
		
		System.out.println(asw1.answerId);
		System.out.println(asw2.content);
		System.out.println(asw3.content);
		
		System.out.println(p1.positionId);
		System.out.println(p2.PositionName);
		System.out.println(p3.PositionName);
	
	}
}


