
package djuric;

import java.util.Scanner;

public class Automobil{
	
	String naziv, proizvodjac;
	int godiste;
	double potrosnja;
	
	void unetiNazivAutomobila() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite naziv automobila: ");
		naziv = sc.nextLine();
	}
	void unetiProizvodjacaAutomobila() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite proizvodjaca automobila: ");
		proizvodjac = sc.nextLine();
	}
	void unetiGodisteAutomobila() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite godiste automobila: ");
			godiste = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Niste dobro uneli broj. ");
				unetiGodisteAutomobila();
		}
	}
	void unetiPotrosnjuAutomobila() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite potrosnju automobila: ");
			potrosnja = sc.nextDouble();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			unetiPotrosnjuAutomobila();
		}
	}
	public String toString() {
		return "Automobil " + naziv + " marke " + proizvodjac + " godiste " + godiste + " trosi " + potrosnja;
	} 

}
