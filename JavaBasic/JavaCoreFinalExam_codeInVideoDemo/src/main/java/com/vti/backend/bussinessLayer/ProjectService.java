//
package com.vti.backend.bussinessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.vti.backend.dataLayer.ProjectRepository;
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
public class ProjectService {
	ProjectRepository projectRepository = new ProjectRepository();

	public ArrayList<User> getListUser(String projectName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		return projectRepository.getMemberProject(projectName);
	}
	
	public ArrayList<Manager> getListPM() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException{
		return projectRepository.getListPM();
	}

}
