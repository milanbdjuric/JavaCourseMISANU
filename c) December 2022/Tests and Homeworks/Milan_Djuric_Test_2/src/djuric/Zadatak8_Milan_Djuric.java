package djuric;

import java.util.Scanner;

public class Zadatak8_Milan_Djuric {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		int cifra;
		int max = 0;
		
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		
		if (broj < 0) {
			broj = Math.abs(broj);
		}
		while (broj > 0) {
			cifra = broj % 10;
			if (cifra > max) {
				max = cifra;
			}
			broj /= 10;
		}
		System.out.println("Najveca cifra unetog broja je: " + max);
		unos.close();
	}
}
