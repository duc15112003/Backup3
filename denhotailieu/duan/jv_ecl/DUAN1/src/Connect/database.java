package Connect;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database  {
	
	public final static String url = "jdbc:sqlserver://localhost:1433;databaseName=qlcuahanggiaydb";
	public final static String user = "phat";
	public final static String password = "123";
	private static Statement stmt;
	private static ResultSet rs;
	private database() {
		
	}
	public static Connection getConnection() throws SQLException{
		Connection con = null;
		con = DriverManager.getConnection(url, user, password);
		stmt = con.createStatement();
		 return con;
	}
	
	public static ResultSet executeSelect(String query) throws SQLException  {
		rs = stmt.executeQuery(query);
		return rs;
	}
	public static int executeUpdate(String query) throws SQLException {
		int rowAffected = 0;
		rowAffected = stmt.executeUpdate(query);
		return rowAffected;
	}
	
	 public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            stmt.close();
            getConnection().close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
