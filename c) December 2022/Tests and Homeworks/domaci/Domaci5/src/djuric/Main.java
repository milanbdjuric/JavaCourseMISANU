package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();
		
		int a[][] = new int [r][k];
		
		System.out.println("\nUnesite elemente matrice: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nMatrica a izgleda ovako: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("\nUnesite vrednost za skalar: ");
		int s = sc.nextInt();
		
		System.out.println("\nProizvod matrice skalarom: ");
		
		int b[][] = new int[r][k];
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				b[i][j] = s*a[i][j];
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}