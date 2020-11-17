//
package com.vti.backend.dataLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.vti.entity.User;
import com.vti.utils.JdbcUltils;

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
public class UserRepository {
	public User getUser(String email, String password) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{
		User user = null;
		JdbcUltils jdbcUltils = new JdbcUltils();
		Connection connection = jdbcUltils.connect();
		String query ="SELECT userID, FullName,Email FROM User WHERE Email=? AND password=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, email);
		preparedStatement.setString(2,password);
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next()){
			int id = rs.getInt(1);
			String fullName = rs.getString(2);
			user = new User(id, fullName, email, null);
			}
		return user;
		}

}
