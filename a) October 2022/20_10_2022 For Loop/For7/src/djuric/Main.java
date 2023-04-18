package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m, n;
		int suma = 0;

		System.out.println("Unesite broj m: ");
		m = sc.nextInt();
		
		System.out.println("Unesite broj n: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= m; i++) {
			suma = suma + n*(n + i*m);
		}
		System.out.println("Suma iznosi: " + suma);

	}

}
