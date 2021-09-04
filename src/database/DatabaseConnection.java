package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection conn;
	
	public static Connection getConnection() {
		if(conn==null) {
			try {
				conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
			
			
			} catch (SQLException e) {
				throw new DataBaseException(e.getMessage());
			}
		}
		return conn;
	}
	
	public static void closeStatement(PreparedStatement ps) {
		if(ps!=null) {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new DataBaseException(e.getMessage());
			}
		}
	}
	public static void closeResultSet(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				throw new DataBaseException(e.getMessage());
			}
		}
	}
	
	
}
