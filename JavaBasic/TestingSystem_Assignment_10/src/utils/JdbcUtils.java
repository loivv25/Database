package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import utils.properties.DatabaseProperties;

public class JdbcUtils {
	private DatabaseProperties databaseProperties;
	private Connection connection;
	
	public JdbcUtils() throws FileNotFoundException, IOException{
		databaseProperties = new DatabaseProperties();
	}
	public void connectForTesting() throws SQLException{
		String url = databaseProperties.getProperty("url");
		String username = databaseProperties.getProperty("username");
		String password = databaseProperties.getProperty("password");
		
		connection = DriverManager.getConnection(url, username, password);
		System.out.println("Connect successfully");
	}
	
	public Connection connect() throws SQLException{
		if(connection==null){
		String url = databaseProperties.getProperty("url");
		String username = databaseProperties.getProperty("username");
		String password = databaseProperties.getProperty("password");
		
		connection = DriverManager.getConnection(url, username, password);}
		return connection;	
	}
	public void disconnect() throws SQLException{
		if(connection!=null){
			if(!connection.isClosed()){
				connection.close();	
			}
			
		}
	}
	

}
