//
package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.ErrorManager;

import javax.swing.text.Utilities;

import com.vti.backend.presentationLayer.ProjectController;
import com.vti.backend.presentationLayer.UserController;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

/**
 * This class is .
 * 
 * @Description: .
 * @author: LoiVV
 * @create_date: Nov 17, 2020
 * @version: 1.0
 * @modifer: LoiVV
 * @modifer_date: Nov 17, 2020
 */
public class Program {
	ProjectController projectController = new ProjectController();
	UserController userController = new UserController();
	String erorrMessage ="The value was not valid. Please enter again!";

	public void showMenu() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("=============MENU=============");
		System.out.println("1, Get all project members");
		System.out.println("2, Get projects managers");
		System.out.println("3, Login");
		System.out.println("4, Exit");
		System.out.println("==============================");
		
		int key = ScannerUtils.inputInt(erorrMessage);

		switch (key) {
		case 1: {
			System.out.print("Enter a project name: ");
			String projectName = ScannerUtils.inputString(erorrMessage);
			ArrayList<User> listUser = projectController.getListUser(projectName);
			System.out.printf("%-20S%-25S%-25S%n", "ID User", "Fullname", "Email");
			for (User user : listUser) {
				System.out.printf("%-20d%-25s%-25s%n", user.getId(), user.getFulllName(), user.getEmail());
			}

		}
			askContinue();
			break;
		case 2: {
			ArrayList<Manager> listPM = projectController.getListPM();
			System.out.printf("%-10S%-25S%-25S%n", "ID", "Fullname", "Email");
			for (Manager manager : listPM) {
				System.out.printf("%-10d%-25s%-25s%n", manager.getId(), manager.getFulllName(), manager.getEmail());
			}

		}
			askContinue();
			break;
		case 3: {
			System.out.print("Email: ");
			String email = ScannerUtils.inputEmail(erorrMessage);
			System.out.print("Password: ");
			String password = ScannerUtils.inputPassword(erorrMessage);
			User user = userController.getUser(email, password);
			if (user != null) {
				System.out.println("Login successfully. Welcome " + user.getFulllName() + " to website!");
			} else {
				System.out.println("Login failed. ");
			}

		}
			askContinue();
			break;

		case 4:
			break;

		default:
			System.out.println(erorrMessage);
			showMenu();
		}

	}

	public void askContinue() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("==============================");
		System.out.println("Do you want continue? (yes/no)");
		boolean a = ScannerUtils.inputYesNo(erorrMessage);
		if (a) {
			showMenu();
		} else
			System.out.println("Goodbye!");

	}

	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Program program = new Program();
		program.showMenu();

	}

}
