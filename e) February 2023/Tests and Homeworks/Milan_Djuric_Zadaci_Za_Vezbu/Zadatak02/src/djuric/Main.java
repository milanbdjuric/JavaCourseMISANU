package djuric;

import java.util.Scanner;

public class Main {

	static int Proizvod(int a, int b, int c) {
		return a*b*c;
	}
	static int SumaKubova(int a, int b, int c) {
		return a*a*a+b*b*b+c*c*c;
	}
	static int Obrnuto(int a, int b, int c) {
		return c*100+b*10+a;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite trocifren broj: ");
		int broj = sc.nextInt();
		
		int cifra1, cifra2, cifra3;
		
		if (broj<100||broj>999)
			System.out.println("Greska, nije trocifren broj. ");
		else {
			cifra1 = broj/100;
			cifra2 = (broj/10)%10;
			cifra3 = broj%10;
			
			System.out.println("Proizvod cifara broja: " + Proizvod(cifra1, cifra2, cifra3));
			System.out.println("Suma kubova cifara: " + SumaKubova(cifra1, cifra2, cifra3));
			System.out.println("Obrnuti redosled cifara: " + Obrnuto(cifra1, cifra2, cifra3));
			
			sc.close();
		}
	}
}
