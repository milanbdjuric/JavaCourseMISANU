package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko zelite brojeva da unesete? ");
		
		int brojSabiraka = sc.nextInt();
		
		int aritSredina = 0;
		int suma = 0;
		
		for (int i = 1; i <= brojSabiraka; i++) {
			System.out.println("Unesite " + i + ". broj: ");
			
			int sabirak = sc.nextInt();
			suma = suma + sabirak;
			aritSredina = suma / brojSabiraka;
			
			
		}
		System.out.println("Aritmeticka sredina im je: " + aritSredina);


	}

}
