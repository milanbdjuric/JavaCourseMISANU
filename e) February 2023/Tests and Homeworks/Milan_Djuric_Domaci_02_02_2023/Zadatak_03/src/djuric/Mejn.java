package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// prvo unosimo generalno podatke o osobi
		
		System.out.print("Ime: ");
		String ime = sc.nextLine();
		
		System.out.print("Datum rodjenja: ");
		String datumRodjenja = sc.nextLine();
		
		System.out.print("Adresa: ");
		String adresa = sc.nextLine();
		
		// proveravamo da li je osoba djak ili zaposleni
		
		System.out.println("Da li je osoba djak ili zaposleni?");
		String djaposleni = sc.nextLine();
		
		if(djaposleni.equalsIgnoreCase("djak")) {			// ako je djak - unosimo dodatne podatke specificne za klasu djak
			
			System.out.print("Naziv skole: ");
			String nazivSkole = sc.nextLine();
			
			System.out.print("Naziv odeljenja: ");
			String razred = sc.nextLine();
			
			Djak djak = new Djak(ime, datumRodjenja, adresa, nazivSkole, razred);		// pravimo objekat klase djak u koji smestamo unete podatke
			
			System.out.println("Uneti su sledeci podaci: \n" + djak.toString());		// stampamo unete podatke do kojih dolazimo pozivom metode toString()
		}
		
		else if(djaposleni.equalsIgnoreCase("zaposleni")) {		// ako je zaposleni - unosimo dodatne podatke specificne za tu klasu
			
			System.out.print("Naziv firme: ");
			String nazivFirme = sc.nextLine();
			
			System.out.print("Naziv odeljenja: ");
			String nazivOdeljenja = sc.nextLine();
			
			Zaposleni zap = new Zaposleni(ime, datumRodjenja, adresa, nazivFirme, nazivOdeljenja);	// pravimo objekat klase zaposleni u koji smestamo unete podatke
			
			System.out.println("Uneti su sledeci podaci: \n" + zap.toString());		// // stampamo unete podatke do kojih dolazimo pozivom metode toString()
		}
		
		else
			System.out.println("Greska.");		// ukoliko ne unesemo stringove "djak" ili "zaposleni" (nezavisno od velikog ili malog slova), javljamo gresku
		
		sc.close();
	}
}
