//
package com.vti.backend.dataLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.vti.entity.Manager;
import com.vti.entity.Project;
import com.vti.entity.User;
import com.vti.utils.JdbcUltils;

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
public class ProjectRepository implements IProjectRepository{

	public ArrayList<User> getMemberProject(String projectName)
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {

		ArrayList<User> listUser = new ArrayList<User>();
		JdbcUltils jdbcUltils = new JdbcUltils();
		Connection connection = jdbcUltils.connect();

		 String query = "SELECT userID, FullName, Email FROM User INNER JOIN"
		 		+ "Manager ON User.UserID=manager.ManagerID INNER JOIN project ON"
		 		+ "manager.ManagerID = project.ManagerID WHERE Project.ProjectName=?"
		 		+ "UNION SELECT userID, FullName,Email FROM User INNER JOIN Employee ON"
		 		+ "user.UserID=employee.EmployeeID INNER JOIN project ON"
		 		+ "employee.ProjectID = project.ProjectID WHERE Project.ProjectName=?";
		

		PreparedStatement preparedStatement = connection.prepareStatement(query);

		 preparedStatement.setString(1, projectName);
		 preparedStatement.setString(2, projectName);
		
		ResultSet rs = preparedStatement.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("userID");
			String name = rs.getString("FullName");
			String email = rs.getString("Email");
			System.out.println("Name =" + name);
			User user = new User(id, name, email, null);
			listUser.add(user);
		}
		for (User user : listUser) {
			System.out.println(user.getEmail());
		}

		jdbcUltils.disconnect();
		return listUser;
	}

	public ArrayList<Manager> getListPM()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		ArrayList<Manager> listPM = new ArrayList<Manager>();
		JdbcUltils jdbcUltils = new JdbcUltils();
		Connection connection = jdbcUltils.connect();
		String query = "SELECT User.userID, User.FullName, User.Email, manager.expInYear, project.ProjectID, project.ProjectName FROM User INNER JOIN Manager ON User.UserID=manager.ManagerID INNER JOIN project ON manager.ManagerID = project.ManagerID";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);

		while (rs.next()) {
			int managerId = rs.getInt(1);
			String fullName = rs.getString(2);
			String email = rs.getString(3);
			System.out.println(fullName);
			Integer expInYear = rs.getInt(4);
			Manager manager = new Manager(managerId, fullName, email, null, expInYear);

//			int projectId = rs.getInt(5);
//			String projectName = rs.getString(6);
//			int teamSize = getTeamSize(projectId);
//			Project project = new Project(projectId, teamSize, managerId);
			listPM.add(manager);
		}
		return listPM;
	}

//	public int getTeamSize(int projectID)
//			throws SQLException, FileNotFoundException, ClassNotFoundException, IOException {
//
//		JdbcUltils jdbcUltils = new JdbcUltils();
//		Connection connection = jdbcUltils.connect();
//		String query = "SELECT count(userID) as countMember FROM (SELECT userID, FullName, Email FROM User INNER JOIN Manager  "
//				+ "ON User.UserID=manager.ManagerID " + "INNER JOIN project"
//				+ "ON manager.ManagerID = project.ManagerID " + "WHERE Project.ProjectID=?" + "UNION"
//				+ "SELECT userID, FullName,Email FROM User INNER JOIN Employee "
//				+ "ON user.UserID=employee.EmployeeID INNER JOIN project ON employee.ProjectID = project.ProjectID "
//				+ "WHERE Project.ProjectID=?) as tb;";
//		PreparedStatement preparedStatement = connection.prepareStatement(query);
//		preparedStatement.setInt(1, projectID);
//		preparedStatement.setInt(2, projectID);
//		ResultSet rs = preparedStatement.executeQuery();
//		int teamSize = rs.getInt(1);
//		return teamSize;
//
//	}

}
