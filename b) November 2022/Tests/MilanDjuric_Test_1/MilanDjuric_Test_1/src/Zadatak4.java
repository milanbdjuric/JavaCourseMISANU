import java.io.*;
import java.text.DecimalFormat;

public class Zadatak4 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		
		double xa, ya, xb, yb, d;
		
		System.out.print("Unesite koordinatu x tacke a (xa): ");
		xa = Double.parseDouble(in.readLine());
		System.out.print("Unesite koordinatu y tacke a (ya): ");
		ya = Double.parseDouble(in.readLine());
		System.out.print("Unesite koordinatu x tacke b (xb): ");
		xb = Double.parseDouble(in.readLine());
		System.out.print("Unesite koordinatu y tacke b (yb): ");
		yb = Double.parseDouble(in.readLine());
		
		d = Math.sqrt(Math.pow((xa - xb), 2) + Math.pow((ya - yb), 2));
		
		System.out.print("Rastojanje izmedju tacaka a i b je: " + df.format(d));

	}

}
