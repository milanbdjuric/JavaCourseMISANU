package djuric;

import java.util.Scanner;

public class Mejnara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double ukupnaTezina = 0;
		
		System.out.println("Unesite broj predmeta: ");
		int broj = sc.nextInt();
		
		Predmet niz[] = new Predmet[100];
		
		for(int i=0; i<broj; i++) {
			System.out.print((i+1) + ". predmet. Unesite S za sferu i K za kvadar: ");
			char x = sc.next().charAt(0);
			if(x=='S') {
				System.out.print("Unesite poluprecnik: ");
				double pp = sc.nextDouble();
				System.out.print("Unesite specificnu tezinu: ");
				double st = sc.nextDouble();
				Sfera s = new Sfera(st, 'S', pp);
				niz[i] = s;
			}
			else if(x=='K'){
				System.out.print("Unesite stranicu a: ");
				double a = sc.nextDouble();
				System.out.print("Unesite stranicu b: ");
				double b = sc.nextDouble();
				System.out.print("Unesite stranicu c: ");
				double c = sc.nextDouble();
				System.out.print("Unesite specificnu tezinu: ");
				double st = sc.nextDouble();
				Kvadar k = new Kvadar(st, 'K', a, b, c);
				niz[i] = k;
					
			}	
		}

		for(int i = 0; i<broj; i++) {
			ukupnaTezina += niz[i].tezina();
		}
		

		
		System.out.println("Predmeti cija je tezina veca od proseka su: ");
		
		for(int i = 0; i<broj; i++) {
			if(ukupnaTezina/broj < niz[i].tezina())
				System.out.println(niz[i].opis() + "\n");
		}
		

	}

}
