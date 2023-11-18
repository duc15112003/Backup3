package Main;

import java.sql.Connection;
import java.sql.SQLException;

import Connect.database;

public class maincheck {
	
	public static void main(String[] args)throws SQLException{
		Connection con = database.getConnection();
		if(con != null) {
			System.out.println("database connected");
			System.out.println(database.executeSelect("select * from tblnhacungcap"));
			
		}
	}

}
