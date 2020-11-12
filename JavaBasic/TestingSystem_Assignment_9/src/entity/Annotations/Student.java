package entity.Annotations;

public class Student {
	private static int id = 0;;
	private String name;


	@SuppressWarnings("static-access")
	public Student(String name) {
		super();
		id = id+1;
		this.id = id;
		this.name = name;
	}

	public static int getId() {
		return id;
	}

	public static String getIdV2() {

		return "MSV: " + id;
	}

	public String getName() {
		return name;
	}

}
