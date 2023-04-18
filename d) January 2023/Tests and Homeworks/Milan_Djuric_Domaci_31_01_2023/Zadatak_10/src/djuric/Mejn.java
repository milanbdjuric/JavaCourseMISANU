package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x[] = new double[10];				// deklarisemo niz od 10 brojeva; double jer nije bilo receno da li je ceo ili ne
		
		for(int i=0; i<10; i++) {					// unosimo vrednosti niza scannerom i for petljom
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}
		
		int brojac = 0;								// inicijalizujemo brojac na 0
		
		System.out.print("Unesite trazeni broj: ");
		double nj = sc.nextDouble();				// unosimo trazeni broj
		
		for(double y : x) {							// for-each petljom prolazimo kroz niz
			if (y==nj)								// proveravamo da li je neki od elemenata niza jednak trazenom broju 
				brojac++;							// ako jeste brojac ga ubroji
		}
		
		System.out.println("Broj " + nj + " se pojavljuje " + brojac + " puta.");		// ispis
		
		sc.close();
	}
}
