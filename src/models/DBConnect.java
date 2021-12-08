package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnect {
	
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/gym";
	
	static final String USER = "root";
	
	static final String PASS = "";
	
	public Connection connection() throws SQLException {
		return DriverManager.getConnection(DB_URL, USER, PASS);
	}
	
	
}
