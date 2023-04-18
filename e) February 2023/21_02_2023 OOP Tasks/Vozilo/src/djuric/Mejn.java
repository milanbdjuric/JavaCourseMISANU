package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite izdrzljivost mosta: ");
		double izdrz = sc.nextDouble();
		
		System.out.println("Koje je vozilo u pitanju? ");
		char x = sc.next().charAt(0);
		
		System.out.println("Kolika je tezina vozila? ");
		double tezinaVozila = sc.nextDouble();
		
		
		if(x=='T') {
			
			System.out.println("Unesite teret: ");
			double teret = sc.nextDouble();
			TeretnoVozilo tv = new TeretnoVozilo(tezinaVozila, teret);
			if(tv.izracunajTezinu()<izdrz)
				System.out.println("PROLAZIIII" + tv.toString());
			else
				System.out.println("NAZAAAD" + tv.toString());
		}
		
		else if(x=='P') {

			System.out.println("Unesite broj putnika? ");
			int brojPutnika = sc.nextInt();
			System.out.println("Unesite prosecnu tezinu putnika: ");
			double tezinaPutnika = sc.nextDouble();
			PutnickoVozilo pv = new PutnickoVozilo(tezinaVozila, tezinaPutnika, brojPutnika);
			if(pv.izracunajTezinu()<izdrz)
				System.out.println("PROLAZIIII" + pv.toString());
			else
				System.out.println("NAZAAAD" + pv.toString());
		}
		
		else {
			System.out.println("Greska u unosu. Ponovo!!");
			main(args);
		}
		sc.close();
		
		// Nece biti na testu 23.02.2023: rekurzija, lambda izrazi, dizajn paterni, genericki tipovi
		

		
		
		
		
		
		
		
		

	}

}
