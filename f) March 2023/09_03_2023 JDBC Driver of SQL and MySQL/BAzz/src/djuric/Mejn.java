package djuric;

import java.sql.*;

public class Mejn {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3036/28feb";
		String user = "root";
		String pass = "";
		
		try(Connection c = DriverManager.getConnection(url, user, pass)){
			
			String SELECT = "SELECT * FROM radnici";
			
			Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery(SELECT);
			
			
			
			
			
		}catch(Exception e) {
					e.printStackTrace();
				}

	}

}
