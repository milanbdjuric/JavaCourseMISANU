package milan_djuric;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();
		
		int x[] = new int[10];
		
		int suma = 0;
		
		System.out.println("Unesite elemente niza x: ");
		
		for (int i = 1; i<=n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
			if (x[i]%10==8)
				suma+=x[i];
		}
		System.out.println("Suma clanova niza cija je cifra jedinica 8 je " + suma + ".");
		sc.close();
	}
}
