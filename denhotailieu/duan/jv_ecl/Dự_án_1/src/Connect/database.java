package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database  {
	
	public final static String url = "jdbc:sqlserver://localhost:1433;databaseName=qlcuahanggiaydb";
	public final static String user = "phat";
	public final static String password = "123";
	
	private database() {
		
	}
	public static Connection getConnection() throws SQLException{
		Connection con = null;
		con = DriverManager.getConnection(url, user, password);
		 return con;
	}

}
