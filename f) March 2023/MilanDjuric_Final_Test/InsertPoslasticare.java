package djuric;

import java.sql.*;

public class InsertPoslasticare {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/sljadoljed";
		String user = "root";
		String pass = "";
		
		try(Connection c = DriverManager.getConnection(url, user, pass)){
			
			System.out.println("Povezasmo se! ");
			
			String insert = "INSERT INTO poslasticare(naziv, grad, ulica, broj) VALUES (?, ?, ?, ?)";
			
			PreparedStatement p = c.prepareCall(insert);
			
			p.setString(1, "Bekimi");
			p.setString(2, "Valjevo");
			p.setString(3, "Uzicka");
			p.setString(4, "BB");
			
			int x = p.executeUpdate();
			
			if (x>0) {
				System.out.println("Uspesno ste uneli podatke! Hvala! ");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		

	}

}
