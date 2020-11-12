package backend;

import entity.Annotations.Student;

public class Excercise2 {
	public int test;

	@SuppressWarnings("static-access")
	public void question2() {
		Student s1 = new Student("Nguyễn Văn A");
		System.out.println("Tên của student: " + s1.getName());
		System.out.println(s1.getIdV2());
		Student s2 = new Student("Nguyễn Văn B");
		System.out.println("Tên của student: " + s2.getName());
		System.out.println(s2.getIdV2());

	}
}
