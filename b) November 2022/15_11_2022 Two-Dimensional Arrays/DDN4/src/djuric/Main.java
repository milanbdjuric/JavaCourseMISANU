package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int red, kol;
		System.out.print("Unesite broj redova: ");
		red = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		kol = sc.nextInt();
		
		int a[][] = new int[red][kol];	
		
		System.out.println("\nElementi matrice: ");
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kol;j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		int min = a[0][0];

		for (int i=0; i<red; i++) {
			for (int j=0; j<kol;j++) {
				if (a[i][j] < min) {
					min = a[i][j];
				}
			}
		}
		System.out.println("\nNajmanji element matrice je " + min);
		sc.close();
	}
}
