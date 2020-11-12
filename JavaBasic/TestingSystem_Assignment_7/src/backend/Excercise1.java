package backend;

import java.util.Scanner;

import entity.static_final.HinhChuNhat;
import entity.static_final.HinhHoc;
import entity.static_final.HinhTron;
import entity.static_final.MyMath;
import entity.static_final.PrimaryStudent;
import entity.static_final.SecondaryStudent;
import entity.static_final.Student;

public class Excercise1 {
	Student student[] = new Student[3];
	
	public void initStudent() {
		student[0] = new Student(1,"Lợi");
		student[1] = new Student(2,"Thảo");
		student[2] = new Student(3,"Mai");
		
	}
	
	public void question1(){
		for(Student std:student){
			System.out.println("ID: "+std.getId()+" Name: "+std.getName()+" College: "+std.getCollege());
		}
		Student.setCollege("Đại học Công Nghệ");
		
		for(Student std:student){
			System.out.println("ID: "+std.getId()+" Name: "+std.getName()+" College: "+std.getCollege());
		}
	}
	


	public void question2(){
		System.out.println("Tiền quỹ hiện tại là: "+ Student.getMoneyGroup());
			for(Student std: student){
				std.nopTien(100);}
		System.out.println("Tiền quỹ sau khi cả lớp nộp quỹ là: "+ Student.getMoneyGroup());
		student[1].tieuTien(50);
		System.out.println("Tiền quỹ sau khi student 1 tiêu 50k: "+ Student.getMoneyGroup());
		student[1].tieuTien(20);
		System.out.println("Tiền quỹ sau khi student 2 tiêu 20k "+ Student.getMoneyGroup());
		student[1].tieuTien(30);
		System.out.println("Tiền quỹ sau khi studetn 3 tiêu 30k "+ Student.getMoneyGroup());
		
		}
	
	public void question3(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào hai số nguyên a và b:");
		System.out.print("a= ");
		int a = sc.nextInt();
		System.out.print("b= ");
		int b = sc.nextInt();
		System.out.println("Min cuả a và b là: "+MyMath.min(a,b));
		System.out.println("Max cuả a và b là: "+MyMath.max(a,b));
		System.out.println("Tổng cuả a và b là: "+MyMath.sum(a,b));
			
	}
	
	public void question4(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên trường: ");
		Student.setCollege(sc.nextLine());
		System.out.println("Tên trường đã được cập nhật là: "+Student.getCollege());	
	}
	
	public void question5() throws Exception{
		Student std[] = new Student[10];
		std[0] = new Student("Lợi");
		std[1] = new Student("Thảo");
		std[2] = new Student("Mai");
		System.out.println("Số student đã tạo là: "+Student.counter);
	}
	public void question6() throws Exception{
		Student priStudent[] = new PrimaryStudent[2];
		Student seconStudent[] = new SecondaryStudent[4];
		priStudent[0]= new PrimaryStudent("Lợi");
		priStudent[1]= new PrimaryStudent("Mai");
		seconStudent[0]= new SecondaryStudent("Tuấn");
		seconStudent[1]= new SecondaryStudent("Hải");
		seconStudent[2]= new SecondaryStudent("Hậu");
		seconStudent[3]= new SecondaryStudent("Tùng");
		
		System.out.println("Tổng số student: "+ Student.counter);
		System.out.println("Số Primary Student: "+ PrimaryStudent.counterPri);
		System.out.println("Số Secondary Student: "+ SecondaryStudent.counterSecon);
	}
	
	public void question7() throws Exception{
		Student priStudent[] = new PrimaryStudent[2];
		Student seconStudent[] = new SecondaryStudent[7];
		priStudent[0]= new PrimaryStudent("Lợi");
		priStudent[1]= new PrimaryStudent("Mai");
		seconStudent[0]= new SecondaryStudent("Tuấn");
		seconStudent[1]= new SecondaryStudent("Hải");
		seconStudent[2]= new SecondaryStudent("Hậu");
		seconStudent[3]= new SecondaryStudent("Tùng");
		seconStudent[4]= new SecondaryStudent("Hải");
		seconStudent[5]= new SecondaryStudent("Hậu");
		seconStudent[6]= new SecondaryStudent("Tùng");
	}
	
	public void question8() throws Exception{
		HinhHoc tron1 = new HinhTron();
		HinhHoc tron2= new HinhTron();
		HinhHoc tron3 = new HinhTron();
		HinhHoc tron4  = new HinhTron();
		HinhHoc cnh1  = new HinhChuNhat();
		HinhHoc cnh2  = new HinhChuNhat();
		HinhHoc cnh3  = new HinhChuNhat();
		System.out.println("đã chạy đến đêy");
		
		
		
	}
}
