//
package com.vti.backend.bussinessLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.dataLayer.UserRepository;
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
public class UserService {
	
	UserRepository userRepository = new UserRepository();
	public User getUser(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
		return userRepository.getUser(email, password);
	}
	

}
