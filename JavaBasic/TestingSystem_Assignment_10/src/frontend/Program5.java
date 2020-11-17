package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import utils.JdbcUtils;

public class Program5 {

	public static void main(String[] args) throws FileNotFoundException, IOException, SQLException {
		JdbcUtils jdbcUtils = new JdbcUtils();
		jdbcUtils.connectForTesting();
		
	}

}
