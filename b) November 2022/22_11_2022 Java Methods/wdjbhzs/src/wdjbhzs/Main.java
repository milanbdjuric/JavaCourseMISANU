package wdjbhzs;

import java.util.Scanner;

public class Main {

	public static void stampajNiz(int n, double niz[]) {
		System.out.println("Uneti elementi niza su: ");
		for (int i=0; i<n; i++) {
			System.out.println(niz[i] + "\t");
		}
	}
	
	static double srednjaVrednost (int n, double niz[]) {
		double sr = 0;
		
		for (int i=0; i<n; i++) {
			sr+=niz[i];
		}
		return sr/n;
	}
	
	public static void main(String[] args) {
		
		double niz[] = new double[10];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite dimenziju niza: ");
		int n = sc.nextInt();
		
		System.out.println("Unesite elemente niza: ");
		for (int i=0; i<n; i++) {
			System.out.print("niz[" + i + "] = ");
			niz[i] = sc.nextDouble();
		}
		
		stampajNiz(n, niz);
		System.out.println("\nSrednja vrednost niza je " + srednjaVrednost(n, niz));


	}

}
