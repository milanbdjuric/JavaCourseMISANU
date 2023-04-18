import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi stranicu kocke: ");
		
		double a = input.nextDouble();
		
		System.out.println("Povrsina je: " + (6 * a * a) + " a zapremina " + (a * a * a));
		

	}

}


// profesorov kod: package algoritam; import java.io.*; public class Zadatak3 { public static void main(String[] args) throws Exception { // a - stranica kocke // p - površina kocke // v - zapremina kocke double a, p, v;   BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));   // Unos stranice kocke System.out.print("Unesite stranicu kocke a: "); a = Double.parseDouble(ulaz.readLine()); // Izračunavanje površine i zapremine kocke p = 6 * a * a; v = Math.pow(a, 3);   // Štampanje vrednosti površine i zapremine kocke System.out.println("Za unetu stranicu kocke a = " + a + " izračunata površina je " + p + " a zapremina " + v); } }