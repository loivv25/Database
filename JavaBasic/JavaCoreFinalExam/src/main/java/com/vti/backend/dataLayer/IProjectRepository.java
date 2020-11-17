//
package com.vti.backend.dataLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.vti.entity.Manager;
import com.vti.entity.User;

/**
 * This class is .
 * 
 * @Description: .
 * @author: LoiVV
 * @create_date: Nov 18, 2020
 * @version: 1.0
 * @modifer: LoiVV
 * @modifer_date: Nov 18, 2020
 */
public interface IProjectRepository {
	public ArrayList<User> getMemberProject(String projectName) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

	public ArrayList<Manager> getListPM() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException;

}
