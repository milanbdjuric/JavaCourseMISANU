package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Osoba o1 = new Osoba();
		
		System.out.print("IME: ");
		o1.setIme(sc.nextLine());
		System.out.print("DATUM RODJENJA: ");
		o1.setDatumRodjenja(sc.nextLine());
		System.out.print("ADRESA: ");
		o1.setAdresaStanovanja(sc.nextLine());
		
		System.out.println("\n" + o1.toString());
		
		

	}

}
