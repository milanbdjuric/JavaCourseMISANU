package vjedjba2;

import java.util.Scanner;

public class OsobaMejnara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Osoba a = new Osoba();
		
		System.out.println("Unesite ime: ");
		String ime = sc.nextLine();
		System.out.println("Unesite datum rodjenja: ");
		String datum = sc.nextLine();
		System.out.println("Unesite adresu: ");
		String adresa = sc.nextLine();
		
		a.setIme(ime);
		a.setDatum(datum);
		a.setAdresa(adresa);
		
		a.ispis();

	}

}
