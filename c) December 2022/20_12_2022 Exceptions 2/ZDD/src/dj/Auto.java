package dj;

import java.util.Scanner;

public class Auto {
	
	String naziv, proizvodjac;
	int godiste;
	double potrosnja;
	
	void unetiNaziv() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Naziv: ");
		naziv = sc.nextLine();
	}
	void unetiProizvodjaca() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Proizvodjac: ");
		proizvodjac = sc.nextLine();
	}
	void unetiGodiste() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Godiste: ");
			godiste = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Greska. Unesite ceo broj. " + e.getMessage());
			unetiGodiste();
		}
	}
	void unetiPotrosnju() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Potrosnja: ");
			potrosnja = sc.nextDouble();
		} catch(Exception e) {
			System.out.println("Greska. Unesite realan broj." + e.getMessage());
			unetiPotrosnju();
		}
	}
	public String toString() {
		return "Auto [naziv=" + naziv + ", proizvodjac=" + proizvodjac + ", godiste=" + godiste + ", potrosnja="
				+ potrosnja + "]";
	}

}
