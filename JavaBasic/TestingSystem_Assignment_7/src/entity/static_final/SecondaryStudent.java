package entity.static_final;

public class SecondaryStudent extends Student {
	public static int counterSecon=0;
	public SecondaryStudent(String name) throws Exception {
		super(name);
		counterSecon++;
		
	}

}
