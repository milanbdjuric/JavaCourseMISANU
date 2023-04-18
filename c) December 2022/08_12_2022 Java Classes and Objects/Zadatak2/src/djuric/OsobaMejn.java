package djuric;

import java.util.Scanner;

public class OsobaMejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Osoba covek = new Osoba();
		
		System.out.println("Unesite ime osobe: ");
		covek.ime = sc.nextLine();
		
		System.out.println("Unesite datum rodjenja osobe: ");
		covek.datum = sc.nextLine();
		
		System.out.println("Unesite adresu osobe: ");
		covek.adresa = sc.nextLine();
		
		System.out.println(covek.ispisi());

	}

}
