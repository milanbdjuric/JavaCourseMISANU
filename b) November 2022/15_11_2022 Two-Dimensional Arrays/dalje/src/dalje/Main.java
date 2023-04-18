package dalje;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj redova: ");
		int r = sc.nextInt();
		System.out.println("Unesite broj kolona: ");
		int k = sc.nextInt();
		
		int x[][] = new int[r][k];
		
		System.out.println("Unesite elementre matrice: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("Pocetna matrica: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transponovani elementi: ");
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print(x[j][i] + " ");
			}
			System.out.println();
		}
		
		

	}

}
