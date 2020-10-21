package P1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Ex4_RandomNumber {

	public static void main(String[] args) {
	Ex4_RandomNumber ex4 = new Ex4_RandomNumber();
//	ex4.question1();
//	ex4.question2();
//	ex4.question3();
//	ex4.question4();
//	ex4.question5();
	ex4.question6();
//	ex4.question7();

	}
public void question1(){
	Random rd = new Random();
	int i = rd.nextInt();
	System.out.println(i);
}
public void question2(){
	Random rd = new Random();
	float i = rd.nextFloat();
	System.out.println(i);
}

public void question3(){
	String[] hs = new String[]{"Lợi", "Thảo", "Tú", "Nhật"};
	Random rd = new Random();
	int i= rd.nextInt(hs.length);
	System.out.println(hs[i]);	
}
public void question4(){
	Random rd = new Random();
	int minDay = (int) LocalDate.of(1995,07,24).toEpochDay();
	int maxDay = (int) LocalDate.of(1995,12,20).toEpochDay();
	long randomInt = minDay + rd.nextInt(maxDay - minDay);
	LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
	System.out.println(randomDay);
}

public void question5(){
	Random rd = new Random();
	Date  date = new Date();
	int maxDay = (int) LocalDate.of(date.getYear()+1900, date.getMonth()+1, date.getDate()).toEpochDay();
	long randomInt = maxDay-rd.nextInt(366);
	LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
	System.out.println(randomDay);
}

public void question6(){
	Random rd = new Random();
	Date date = new Date();
	int maxDay = (int) LocalDate.of(date.getYear()+1900, date.getMonth()+1, date.getDate()).toEpochDay();
	long randomInt = maxDay-rd.nextInt(maxDay);
	LocalDate randomDay = LocalDate.ofEpochDay(randomInt);
	System.out.println(randomDay);
}

public void question7(){
	Random rd = new Random();
	int i = rd.nextInt(1000-100+1)+100;
	System.out.println(i);
}


}
