//
package com.vti.backend.presentationLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import com.vti.backend.bussinessLayer.UserService;
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
public class UserController {
UserService userService = new UserService();
public User getUser(String email, String password) throws ClassNotFoundException, FileNotFoundException, SQLException, IOException{
	return userService.getUser(email, password);
}
}
