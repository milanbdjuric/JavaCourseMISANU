package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);					// uvodimo klasu Scanner								
		
		System.out.print("Unesite broj predmeta: ");			// unosimo broj predmeta
		int n = sc.nextInt();
		
		Predmet pr[] = new Predmet[n];							// deklarisemo niz predmeta
		
		double ukupnaTezina = 0;								// inicijaluzujemo brojac sume tezine na 0
		
		for (int i=0; i<n; i++) {
			System.out.print("Unesite slovo 'S' za sferu ili 'K' za kvadar: ");	 // pitamo koji je predmet u pitanju
			char slovo = sc.next().charAt(0);
			
			if (slovo == 'S') {							// ako je sfera
				Sfera s = new Sfera();					// pravimo instancu klase sfera
				s.unos();								// metodom unos unosimo podatke
				ukupnaTezina += s.tezina();				// dodajemo njenu tazinu (izracunatu pozivanjem metode tezina) ukupnoj sumi
				pr[i] = s;								// smestamo sferu u niz predmeta
				pr[i].setOznakaVrste('S');				// postavljamo joj oznaku vrste
			}
			else if (slovo == 'K'){						// ako je kvadar - analogni postupak...
				Kvadar k = new Kvadar();
				k.unos();
				ukupnaTezina += k.tezina();
				pr[i] = k;
				pr[i].setOznakaVrste('K');
			}
			else {
				System.out.println("Greska, `ajde sve ponovo!");		// javljamo gresku i restartujemo program
				main(args);
			}	
		}
		
		System.out.println("Predmeti cija je tezina iznad proseka su: ");
		
		for (int i=0; i<n; i++) {
			if (pr[i].getOznakaVrste() == 'S') {					// ako je clan niza predmeta sfera...
				Sfera x = (Sfera)pr[i];								// pravimo objekat tipa sfera
				if((ukupnaTezina/n)<x.tezina()) {					// kako bi mogli da pozovemo njegovu funkciju za izracunavanje tezine da bi videli da li je veca od proseka
					System.out.println("- " + x.toString());		// stampamo ako je tezina veca od proseka
				}
			}
			if (pr[i].getOznakaVrste() == 'K'){						// analogni postupak ako je kvadar...
				Kvadar y = (Kvadar)pr[i];
				if((ukupnaTezina/n)<y.tezina()) {
					System.out.println("- " + y.toString());
				}
			}
		}
		sc.close();							
	}
}
