package entity.static_final;

public class MyMath {
	
public static int max(int a, int b){
	int rs=0;
	if (a==b) rs =a;
	else
		if (a>b) rs =a;
		else rs=b;
	return rs;
}

public static int min(int a, int b){
	int rs=0;
	if (a==b) rs =a;
	else
		if (a<b) rs =a;
		else rs=b;
	return rs;
}

public static int sum(int a, int b){
	return a+b;
}
}
