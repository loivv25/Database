package entity.Generic;

public class Employee<E> {
	private int id;
	private String name;
	private E salary[];

	public Employee(int id, String name, E[] salary) {
		super();
		id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public E[] getSalary() {
		return salary;
	}

	public void setSalary(E[] salary) {
		this.salary = salary;
	}

	public void showInfo() {
		System.out.print("ID: " + id + " Name: " + name);
		System.out.println(" The last month salary: " + salary[salary.length - 1]);

	}
}
