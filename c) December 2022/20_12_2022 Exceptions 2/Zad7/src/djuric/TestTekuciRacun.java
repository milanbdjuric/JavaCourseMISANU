package djuric;

import java.util.Scanner;

public class TestTekuciRacun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		TekuciRacun korisnik = new TekuciRacun();
		
		System.out.print("BROJ: ");
		String broj = sc.nextLine();
		System.out.print("VLLASNIK: ");
		String vlasnik = sc.nextLine();
		System.out.print("IZNOS: ");
		double iznos = sc.nextDouble();
		
		try {
			korisnik.setBroj(broj);
			korisnik.setIznos(iznos);
			korisnik.setVlasnik(vlasnik);
			System.out.println(korisnik.toString());
		} catch (IzTeRa e) {
			System.out.println("Greska: " + e.getMessage());
		}
			
			
			
			
		
		
		

	}

}
