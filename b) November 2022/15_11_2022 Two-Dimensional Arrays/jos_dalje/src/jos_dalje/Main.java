package jos_dalje;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za red: ");
		int r = sc.nextInt();
		System.out.println("Unesite vrednost za kolonu: ");
		int k = sc.nextInt();
		
		int a[][] = new int[r][k];
		
		System.out.println("Unesite elemente matrice: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<r; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Evo je matrica: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<r; j++) {
				System.out.print(Math.sqrt(a[i][j]) + " ");
			}
			System.out.println();
		}
		
		

		
}

}
