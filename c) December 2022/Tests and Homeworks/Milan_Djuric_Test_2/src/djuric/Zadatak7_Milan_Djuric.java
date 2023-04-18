package djuric;

import java.util.Scanner;

public class Zadatak7_Milan_Djuric {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int broj = ulaz.nextInt();
		
		int cifra;
		
		if (broj < 0) {
			broj = Math.abs(broj);
		}
		System.out.print("Obrnuti poredak cifara: ");
		
		while (broj>0) {
			cifra = broj % 10;
			System.out.print(cifra);
			broj /= 10;
			}
		ulaz.close();
	}
}
