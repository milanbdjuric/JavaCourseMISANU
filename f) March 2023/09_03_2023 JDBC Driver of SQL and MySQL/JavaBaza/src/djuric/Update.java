package djuric;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println("Uspesna konekcija ka bazi. ");
			
			String sqlupdate = "UPDATE korisnici SET lozinka = ?, ime = ?, email = ? WHERE korisnickoIme = ?";
			
			PreparedStatement ps = conn.prepareCall(sqlupdate);
			
			ps.setString(1, "123korisnik");
			ps.setString(2, "Neko");
			ps.setString(3, "neko@gmail.com");
			
			ps.setString(4, "korisnik1");  // uslov!
			
			int promenjenPodatak = ps.executeUpdate();
			
			if(promenjenPodatak > 0) {
				System.out.println("Uspesno je izvrsena izmena! ");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
