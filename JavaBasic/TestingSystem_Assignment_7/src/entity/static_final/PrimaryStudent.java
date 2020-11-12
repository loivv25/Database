package entity.static_final;

public class PrimaryStudent extends Student {
	public static int counterPri=0;

	public PrimaryStudent(String name) throws Exception {
		super(name);
		counterPri++;
		
	}

}
