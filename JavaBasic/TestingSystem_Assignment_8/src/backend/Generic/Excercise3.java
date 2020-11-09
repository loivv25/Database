package backend.Generic;

import java.util.ArrayList;

import entity.Generic.Employee;
import entity.Generic.MyMap;
import entity.Generic.Phone;
import entity.Generic.Staff;
import entity.Generic.Student;

public class Excercise3<T> {
	public void question123() {
		Student<Integer> stdInt = new Student(1, "Lợi");
		Student<Float> stdFloat = new Student<>(1.1f, "Lợi");
		Student<Long> stdLong = new Student<>(1l, "Lợi");

		System.out.println(stdInt.toString());
		System.out.println(stdFloat.toString());
		System.out.println(stdLong.toString());

		// Question2
		print(4);
		print(4.0);
		print(stdInt);

		// Question3
		Integer[] arrayInt = { 1, 2, 3 };
		Float[] arrayFloat = { 1.0f, 2.0f, 3.0f };
		Double[] arrayDouble = { 4.0d, 5.0d, 6.0d };
		printArray(arrayInt);
		printArray(arrayFloat);
		printArray(arrayDouble);

	}

	public void question4() {
		Integer[] salaryInt = { 1000, 1000, 1500 };
		Float[] salaryFloat = { 1000f, 2000f, 3000f };
		Double[] salaryDouble = { 1000d, 2000d, 3000d };
		Employee e1 = new Employee(1, "Minh", salaryInt);
		Employee e2 = new Employee(2, "Nhật", salaryFloat);
		Employee e3 = new Employee(3, "Lợi", salaryDouble);
		e1.showInfo();
		e2.showInfo();
		e3.showInfo();

	}
	public void question5() {
		Student std = new Student(3, "Loi");
		MyMap myMap = new MyMap(std.getId(), std.getName());
		System.out.println(myMap.toString());
	}
	
	public void question6(){
		Phone p1 = new Phone("vangvanloi97@gmail.com","0386300082");
		Phone p2 = new Phone(1,"386300082");
		Phone p3 = new Phone("Loi","386300082");
		System.out.println((String)p1.getPhoneNumber());
		System.out.println(p1.getKey());
		System.out.println((String)p2.getPhoneNumber());
		System.out.println(p2.getKey());
		System.out.println((String)p3.getPhoneNumber());
		System.out.println(p3.getKey());
	}
	
	public void question7(){
		Staff s1 = new Staff(1,"Loi");
		Staff s2 = new Staff(2l,"Loi");
		System.out.println("ID: "+s1.getId()+" Name: "+s1.getName());
		System.out.println("ID: "+s2.getId()+" Name: "+s2.getName());
		
	}

	private <T> void print(T a) {// For question2
		System.out.println(a);
	}

	private <E> void printArray(E[] arr) {// For question3
		for (E p : arr) {
			System.out.println(p);
		}
	}
}
