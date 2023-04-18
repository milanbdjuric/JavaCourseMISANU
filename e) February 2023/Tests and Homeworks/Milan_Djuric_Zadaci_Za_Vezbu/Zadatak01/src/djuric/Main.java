package djuric;

import java.util.Scanner;

public class Main {
	
	static double FunkcijaG(double a, double b, double c) {
		return (a + b + Math.sin(a))*Math.cos(c);
	}
	
	static double FunkcijaF(double a, double b, double c) {
		return (a-b) /(c+a/(c+b/(c-b)));
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a: ");
		double a = sc.nextDouble();
		System.out.println("Unesite vrednost za b: ");
		double b = sc.nextDouble();
		System.out.println("Unesite vrednost za c: ");
		double c = sc.nextDouble();

		System.out.println("Funkcija F je: " + FunkcijaF(a, b, c));
		System.out.println("Funkcija G je: " + FunkcijaG(a, b, c));
		
		System.out.println("Zbir funkcija je: " + (FunkcijaF(a, b, c)+FunkcijaG(a, b, c)));
		System.out.println("Razlika funkcija je: " + (FunkcijaF(a, b, c)-FunkcijaG(a, b, c)));
		
		sc.close();
	}
}
