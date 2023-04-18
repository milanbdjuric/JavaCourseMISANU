package djuric;

import java.sql.*;

public class PrikaziPoslasticare {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/sljadoljed";
		String user = "root";
		String pass = "";
		
		try(Connection c = DriverManager.getConnection(url, user, pass)){
			
			System.out.println("Povezasmo se! ");
			
			String sel = "SELECT * FROM poslasticare";
			
			Statement s = c.createStatement();
			
			ResultSet r = s.executeQuery(sel);
			
			while(r.next()) {
				
				String naziv = r.getString(2);
				String grad = r.getString(3);
				String ulica = r.getString(4);
				String broj = r.getString(5);
				
				StringBuilder b = new StringBuilder();
				
				b.append("NAZIV: ");
				b.append(naziv);
				b.append("\nGRAD: ");
				b.append(grad);
				b.append("\nULICA: ");
				b.append(ulica);
				b.append("BROJ: ");
				b.append(broj);
				
				System.out.println(b.toString());

			}			

		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
