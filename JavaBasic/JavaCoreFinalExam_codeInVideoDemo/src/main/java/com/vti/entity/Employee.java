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
public class Employee extends User {
	private int projectId;
	private String proSkill;
	public Employee(int id, String fulllName, String email, String password, int projectId, String proSkill) {
		super(id, fulllName, email, password);
		this.projectId = projectId;
		this.proSkill = proSkill;
	}
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
}
