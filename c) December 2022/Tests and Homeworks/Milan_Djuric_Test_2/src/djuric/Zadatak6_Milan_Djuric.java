package djuric;

import java.util.Scanner;

public class Zadatak6_Milan_Djuric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		
		int brojac = 0;
		
		if (broj<0) {
			broj = Math.abs(broj);
		}
		
		while (broj>0) {
			broj /= 10;
			brojac++;
		}	
		System.out.println("Ukupan broj cifara je: " + brojac);
		sc.close();
	}
}
