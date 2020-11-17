package frontend;

import java.nio.channels.ShutdownChannelGroupException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import backend.DepartmentDao;
import entity.Department;

public class Program2 {
	public void showMenu() throws Exception {
		System.out.println("=====MENU======");
		System.out.println("1, Get the department list");
		System.out.println("2, Get a department by id ");
		System.out.println("3, Check for the existence of department name");
		System.out.println("4, Create department");
		System.out.println("5, Update department");
		System.out.println("6, Delete department");
		System.out.println("7, Exit ");

		DepartmentDao ex2 = new DepartmentDao();
		int key = new Scanner(System.in).nextInt();
		switch (key) {
		case 1: // Question1
		{
			List<Department> listDepartment = ex2.getDepartments();
			for (Department dpm : listDepartment) {
				System.out.println("ID: " + dpm.getId() + " Department: " + dpm.getName());
			}
		}
			showMenu();
			break;
		case 2: {
			// Question 2+3
			System.out.println("Enter the department id: ");
			int id = new Scanner(System.in).nextInt();
			Department dpm = ex2.getDepartmentById(id);
			if (dpm != null) {
				System.out.println("Department ID: " + id + " Department name: " + dpm.getName());
			}

		}
			showMenu();
			break;
		case 3: {

			// Question4
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter department name: ");
			sc.nextLine();
			String name = sc.nextLine();
			boolean rs = ex2.isDepartmentNameExists(name);
			if (rs) {
				System.out.println("Department is existed");
			} else
				System.out.println("Depatment is not existed");

		}
			showMenu();
			break;
		case 4: {
			// Question 5
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter department name: ");
			String name = sc.nextLine();
			ex2.createDepartment(name);

		}
			showMenu();
			break;
		case 5: {
			//question 6
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter department ID:");
			int id = sc.nextInt();
			System.out.println("Enter department name:");
			sc.nextLine();
			String name = sc.nextLine();
			ex2.updateDepartment(id, name);

		}
			showMenu();
			break;
		case 6: {
			//question 7
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter department ID:");
			int id = sc.nextInt();
			ex2.deleteDepartment(id);
			

		}
			showMenu();
			break;
		case 7: {
			break;
		}

		default:
			showMenu();
		}

	}

	public static void main(String[] args) throws Exception {
		Program2 program2 = new Program2();
		program2.showMenu();

	}

}
