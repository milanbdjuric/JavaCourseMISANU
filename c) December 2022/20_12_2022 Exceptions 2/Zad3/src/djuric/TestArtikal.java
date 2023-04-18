package djuric;

import java.util.Scanner;

public class TestArtikal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Naziv artikla: ");
		String naziv = sc.nextLine();
		System.out.print("Proizvodjac: ");
		String proizvodjac = sc.nextLine();
		System.out.print("Barkod: ");
		String barkod = sc.nextLine();
		System.out.print("Cena: ");
		double cena = sc.nextDouble();
		
		Artikal a = new Artikal();
		
		try {
			a.setNaziv(naziv);
			a.setProizvodjac(proizvodjac);
			a.setBarkod(barkod);
			a.setCena(cena);
		} catch(IzuzetakArtikal e) {
			System.out.println("Greska: " + e.getMessage());
		}
			


	}

}
