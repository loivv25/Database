package backend.dataLayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Utils.JdbcUltils;
import entity.Accounts;

public class AccountRepository {
	public ArrayList<Accounts> getListAccounts()
			throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		ArrayList<Accounts> listAccounts = new ArrayList<>();
		JdbcUltils jdbcUltils = new JdbcUltils();
		Connection connection = jdbcUltils.connect();
		String query = "select account_id, fullname from accounts";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			Integer id = rs.getInt(1);
			String name = rs.getString(2);
			Accounts a = new Accounts(id, name);
			listAccounts.add(a);

		}
		return listAccounts;
	}

}
