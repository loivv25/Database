package entity.static_final;

public class Student {
private int id;
private String name;
private static String college ="�?ại h�?c Bách Khoa";
private static int moneyGroup =0;
public static int counter=0;
public static int maxStudent =7;


public Student(int id, String name) {

	this.id = id;
	this.name = name;
}

public Student(String name) throws Exception{// for question 5,6,7
	if (counter>7){throw new Exception("Không khởi tạo quá 7 sinh viên");}
	counter=counter+1;
	this.id =counter;
	this.name = name;
}

public void nopTien(int m){
	moneyGroup=moneyGroup+m;
}
public void tieuTien(int m){
	moneyGroup=moneyGroup-m;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static String getCollege() {
	return college;
}
public static void setCollege(String college) {
	Student.college = college;
}

public static int getMoneyGroup() {
	return moneyGroup;
}

public static void setMoneyGroup(int moneyGroup) {
	Student.moneyGroup = moneyGroup;
}





}
