//
package com.vti.entity;

import java.util.List;

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
public class Project {
	private int projectId;
	private int teamSize;
	private int idManager;

	public Project(int projectId, int teamSize, int idManager) {
		super();
		this.projectId = projectId;
		this.teamSize = teamSize;
		this.idManager = idManager;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public int getIdManager() {
		return idManager;
	}

	public void setIdManager(int idManager) {
		this.idManager = idManager;
	}

}
