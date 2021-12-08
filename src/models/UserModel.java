package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserModel {
	public DBConnect conn = null;
	public Statement stmt = null;
	
	public UserModel() {
		conn = new DBConnect();
	}

	public ResultSet retrieveRecords() {
		try {
			
			System.out.println("Selecting records into the table");
			ResultSet rs = null;
			stmt = conn.connection().createStatement();
			String sql = "SELECT * from jerry_510_lab4_tab";
			rs = stmt.executeQuery(sql);
			conn.connection().close();
			return rs;
		}
		catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}
	
	public ResultSet recordswithPep() {
		try {
			System.out.println("Filtering data into the table");
			ResultSet rs = null;
			stmt = conn.connection().createStatement();
			String sql = "SELECT pep, sum(income) as total, count(*) as count from jerry_510_lab4_tab GROUPBY pep";
			rs = stmt.executeQuery(sql);
			conn.connection().close();
			return rs;
		}
		catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
	}
}
