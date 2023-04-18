package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);			// uvodimo klasu skener
		
		System.out.println("Unesite binarni broj: ");	// stampamo korisniku sta da radi
		
		try {												// ulazimo u try-catch blok da uhvatimo eventualan pogresan unos
			int b = sc.nextInt();							// unosimo broj
			
			int x = b;										// inicijalizujemo promenljivu x i dajemo joj vrednost unetog broja (zbog ispitivanja da li je uneti broj binaran)

			boolean bin = true;								// inicijalizujemo boolean kojim cemo iskazati da li je uneti broj binaran ili ne
			
			while(x > 0) {									// while petljom ispitujemo cifru po cifru unetog broja
				if(x % 10 == 0 || x % 10 == 1) {			// ako je cifra 0 ili 1 broj je binaran i boolean x ostaje true
				}
				else
					bin = false;							// ako su cifra razlicite on 0 i 1 broj nije binaran
				x/=10;
			}
			
			if(bin) {										// ako je unet binarni broj...
				int n = 0, s = 0;							// ... inicijalizujemo brojace n i s na 0 
				while(b>0) {								// ponovo while petljom proveravamo cifru po cifru binarnog broja, pocev s desna				
					s+=Math.pow(2, n)*(b%10);				// decimalni broj se racuna kao suma (pocev s desna) odvojenih cifara, puta 2 na n (n=0,1,2...do broja cifara-1) 
					n++;
					b/=10;
				}	
				System.out.println("To je decimalni broj " + s); // imamo broj
			}
			else {
				System.out.println("Broj nije binaran. Pokusajte ponovo!"); // ili nije binaran broj. pretpostavljamo da je korisnik pogresio pri unosu i...
				main(args);									// ... pozivamo main klasu i program pokrecemo ispocetka
			}
		} catch (Exception e) {
			System.out.println("Pogresan unos. Pokusajte ponovo! ");	// hvatamo pogresan unos
			main(args);													// i pokrecemo program ponovo
		}
		sc.close();
	}
}
