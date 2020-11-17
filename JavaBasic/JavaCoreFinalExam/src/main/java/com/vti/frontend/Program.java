//
package com.vti.frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

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

	public void showMenu() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		System.out.println("=============MENU==========");
		System.out.println("1, Get all project members");
		System.out.println("2, Get projects managers");
		System.out.println("3, Login");
		System.out.println("4, Exit");
		int key = ScannerUtils.inputInt("Value was not valid. Please enter again!");

		switch (key) {
		case 1: {
			System.out.print("Enter projet:");
			String projectName=ScannerUtils.inputName("Value was not valid. Please enter again!");
			ArrayList<User> listUser= projectController.getListUser(projectName);
			System.out.printf("%-25d%-25S%-25S%n", "ID User", "Fullname", "Email");
			for (User user: listUser) {
				System.out.printf("%-25d%-25S%-25S%n", user.getId(), user.getFulllName(), user.getEmail());
			}

		}
			showMenu();
			break;
		case 2: {
			ArrayList<Manager> listPM = projectController.getListPM();
			System.out.printf("%-25d%-25S%-25S%n", "ID Manager", "Fullname", "Email");
			for (Manager manager : listPM) {
				System.out.printf("%-25d%-25S%-25S%n", manager.getId(), manager.getFulllName(), manager.getEmail());
			}

		}
			showMenu();
			break;
		case 3: {
			System.out.print("Email: ");
			String email = ScannerUtils.inputPassword("Value was not valid. Please enter again!");
			System.out.print("Password: ");
			String password = ScannerUtils.inputPassword("Value was not valid. Please enter again!");
			User user = userController.getUser(email, password);
			if (user != null) {
				System.out.println("Login successfully. Welcome " + user.getFulllName() + " to website!");
			} else {
				System.out.println("Login failed. ");
			}

		}
			showMenu();
			break;

		case 4:
			break;
			
		default:
			showMenu();
		}

	}

	public static void main(String[] args)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		Program program = new Program();
		program.showMenu();

	}

}
