package Main;

import java.sql.Connection;
import java.sql.SQLException;

import Connect.database;

public class maincheck {
	public static void main(String[] args) {
		try {
			Connection con = database.getConnection();
			if(con != null) {
				System.out.println("database connected");
			}
				
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error");
		}
	}

}
