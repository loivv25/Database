package backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import entity.FileIO.Student;

public class Excercise5 {
	ArrayList<Student> listStudent;
	
	public void initStudent() throws IOException {
		
		listStudent = new ArrayList();
		File f = new File("C:\\Users\\Admin\\Desktop\\myStudent.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào 3 student: ");
		
		for(int i=0; i<3;i++){
			System.out.println("ID: ");
			int id = sc.nextInt();
			System.out.println("Ten: ");
			sc.nextLine();
			String name = sc.nextLine();
			Student a = new Student(id,name);
			listStudent.add(a);

		}
}
	public void writeStudent() throws IOException{
		File file = new File("C:\\Users\\Admin\\Desktop\\fileStudent.txt");
		String pathFile ="C:\\Users\\Admin\\Desktop\\fileStudent.txt";
		FileOutputStream fos = new FileOutputStream(pathFile);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student b = new Student(3,"Hữu");
	oos.writeObject(b);
//		for(Student std:listStudent){
//			System.out.println(std.toString());
//			oos.writeObject(std);
//		}
		
		
	}
}