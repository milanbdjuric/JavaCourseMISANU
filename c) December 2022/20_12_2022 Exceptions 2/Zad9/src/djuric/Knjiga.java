package djuric;

import java.util.Scanner;

public class Knjiga {
	
	String naziv, autor, izdavac;
		
	void unetiNazivKnjige() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite naziv knjige: ");
		naziv = sc.nextLine();
		if (naziv.isBlank()||naziv.isEmpty()) {
			System.out.println("Aj ponovo, null je.");
			unetiNazivKnjige();		
		}
	}
	void unetiAutoraKnjige() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite autora knjige: ");
		autor = sc.nextLine();
		if (autor.isBlank()||autor.isEmpty()) {
			System.out.println("Aj ponovo, null je.");
			unetiAutoraKnjige();
		}
	}
	void unetiIzdavacaKnjige() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite izdavaca knjige: ");
		izdavac = sc.nextLine();
		}
	public String toString() {
		return "Knjiga [naziv=" + naziv + ", autor=" + autor + ", izdavac=" + izdavac + "]";
	}
}
