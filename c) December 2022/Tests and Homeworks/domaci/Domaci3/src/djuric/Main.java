package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova: ");
		int r = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		int k = sc.nextInt();
		
		int x[][] = new int[r][k];
		
		System.out.println("\nUnesite elemente 2D niza: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print("x[" + i + "," + j + "] = ");
				x[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDvodimenzionalni niz x: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\nElementi sa parnim indeksima i redova i kolona: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				if (i%2==0 && j%2==0) {
					System.out.print(x[i][j] + " ");
				}
			}
		}
		sc.close();
		
		
		

	}

}
