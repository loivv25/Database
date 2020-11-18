//
package com.vti.backend.presentationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.backend.bussinessLayer.ProjectService;
import com.vti.entity.Manager;
import com.vti.entity.User;

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
public class ProjectController {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: LoiVV
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LoiVV
	 * @modifer_date: Nov 17, 2020
	 * @param args
	 */
	ProjectService projectService = new ProjectService();

	public ArrayList<User> getListUser(String projectName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return projectService.getListUser(projectName);

	}
	public ArrayList<Manager> getListPM() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		return projectService.getListPM();
	}

}
