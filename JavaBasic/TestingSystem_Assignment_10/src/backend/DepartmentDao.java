package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ietf.jgss.MessageProp;

import com.mysql.cj.protocol.Message;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

import entity.Department;

public class DepartmentDao {
	private String url = "jdbc:mysql://localhost:3306/Entry_Tests_Management";
	private String username = "root";
	private String password = "365Pass";
	private Connection connection;

	public List<Department> getDepartments() throws SQLException {
		// Tạo method để lấy ra danh sách tất cả các Department
		List<Department> listDepartment = new ArrayList<Department>();
		connection = DriverManager.getConnection(url, username, password);
		java.sql.Statement statement = connection.createStatement();
		String query = "SELECT* FROM Department";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			Department department = new Department(id, name);
			listDepartment.add(department);
		}
		connection.close();
		return listDepartment;

	}

	public Department getDepartmentById(int id) throws Exception {
		// Tạo method để lấy ra Department có id do người dùng nhập vào

		connection = DriverManager.getConnection(url, username, password);
		String query = "SELECT* FROM Department WHERE Department_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			Department department = new Department(resultSet.getInt(1), resultSet.getString(2));
			connection.close();
			return department;
		} else {
			connection.close();
			throw new Exception("Cannot find department which has id = " + id);
		}
	}

	public boolean isDepartmentNameExists(String name) throws SQLException {
		connection = DriverManager.getConnection(url, username, password);
		String query = "SELECT* FROM Department WHERE Department_name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, name);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			connection.close();
			return true;
		} else {
			connection.close();
			return false;
		}
	}

	public void createDepartment(String name) throws Exception {
		// Tạo department theo department name nhập vào
		if (isDepartmentNameExists(name)) {
			throw new Exception("Department name is Existed");
		} else {
			connection = DriverManager.getConnection(url, username, password);
			String sql = "INSERT INTO Department(Department_name) VALUES (?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			int e = preparedStatement.executeUpdate();
			if (e == 1) {
				System.out.println("Insert completed");
			} else
				throw new Exception("Insert failed");
		}

	}

	public boolean isDepartmentIdExisits(int id) throws SQLException {
		connection = DriverManager.getConnection(url, username, password);
		String query = "SELECT* FROM Department WHERE Department_id=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, id);
		ResultSet resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			connection.close();
			return true;
		} else {
			connection.close();
			return false;
		}
	}

	public void updateDepartment(int id, String name) throws Exception {
		if (isDepartmentIdExisits(id)) {
			if (isDepartmentNameExists(name)) {
				throw new Exception("Department Name is Exists!");
			} else {
				connection = DriverManager.getConnection(url, username, password);
				String sql = "UPDATE Department SET Department_name =? WHERE Department_id=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, name);
				preparedStatement.setInt(2, id);
				int e = preparedStatement.executeUpdate();
				if (e == 1) {
					System.out.println("Update completed!");
				} else
					System.out.println("Update failed!");
				
				connection.close();
			}
		} else {
			throw new Exception("Cannot found department which has id = " + id);
		}
	}

	public void deleteDepartment(int id) throws Exception {
		if (isDepartmentIdExisits(id)) {
			connection = DriverManager.getConnection(url, username, password);
			String sql = "DELETE FROM Department WHERE Department_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			int e = preparedStatement.executeUpdate();
			if (e == 1) 
				System.out.println("Delete comleted!");
			 else
				System.out.println("Delete failed!");
			connection.close();
		} else
			throw new Exception("Cannot found department which has id = " + id);
	}
}
