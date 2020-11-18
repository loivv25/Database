//
package com.vti.entity;

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
public class User {
	private int id;
	private String fulllName;
	private String email;
	private String password;

	public User(int id, String fulllName, String email, String password) {
		super();
		this.id = id;
		this.fulllName = fulllName;
		this.email = email;
		this.password = password;
	}

	/**
	 * Constructor for class User.
	 * 
	 * @Description: .
	 * @author: LoiVV
	 * @create_date: Nov 17, 2020
	 * @version: 1.0
	 * @modifer: LoiVV
	 * @modifer_date: Nov 17, 2020
	 * @param id2
	 * @param name
	 */


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFulllName() {
		return fulllName;
	}

	public void setFulllName(String fulllName) {
		this.fulllName = fulllName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
