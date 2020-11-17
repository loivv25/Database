package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Basic {
	private String url = "jdbc:mysql://localhost:3306/Entry_Tests_Management";
	private String username = "root";
	private String password = "365Pass";
	private Connection connection;

	public void question1() throws SQLException {
		// Tạo connection tới database Testing System In ra "Connect success!"
		// khi kết nối thành công.

		connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();

		if (statement != null)
			System.out.println("Connect success!");
		connection.close();
	}

	public void question2() throws SQLException {
		// Tạo method để in ra các thông tin của position gồm có id, name
		connection = DriverManager.getConnection(url, username, password);
		Statement statement = connection.createStatement();

		String query = "SELECT position_id, position_name FROM position";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			Integer id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			System.out.println("Position ID: " + id + " Position name: " + name);

		}
	}

	public void question3() throws SQLException {
		// Tạo method để tạo position, user sẽ nhập vào name.

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào tên phòng ban: ");
		String positionName = sc.nextLine();

		connection = DriverManager.getConnection(url, username, password);

		String query = "INSERT INTO position (position_name) VALUES (?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, positionName);
		int e = preparedStatement.executeUpdate();

		if (e == 1) {
			System.out.println("Insert complete!");
		}
		connection.close();
	}

	public void question4() throws SQLException {
		// Tạo method để update tên của position gồm có id = 5 thành "Dev"
		connection = DriverManager.getConnection(url, username, password);
		String query = "UPDATE position SET position_name = 'Dev' WHERE position_id=5";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int e = preparedStatement.executeUpdate();
		if (e == 1) {
			System.out.println("Update complete!");
		}
		connection.close();

	}

	public void question5() throws SQLException {
		// Tạo method để delete của position theo id và user sẽ nhập vào id
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập vào id: ");
		int id = sc.nextInt();
		connection = DriverManager.getConnection(url, username, password);
		String query = "DELETE FROM position WHERE position_id = ?";
		PreparedStatement pePreparedStatement = connection.prepareStatement(query);
		pePreparedStatement.setInt(1, id);
		int e = pePreparedStatement.executeUpdate();
		if (e == 1) {
			System.out.println("Deleted successfully");
		}

		connection.close();
	}
}
