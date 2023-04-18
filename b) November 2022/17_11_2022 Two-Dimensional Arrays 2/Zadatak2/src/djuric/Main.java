package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite vrednost za n: ");
		int n = sc.nextInt();
		System.out.print("Unesite vrednost za m: ");
		int m = sc.nextInt();
		
		if (m>=4) {
			int x[][] = new int[n][m];
			
			System.out.println("Unesite elemente matrice: ");
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					System.out.print("x[" + i + "," + j + "] = ");
					x[i][j] = sc.nextInt();
				}
			}
			int s = 0;
			
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (j==4)
						s+=x[i][j];
				}
		          }
			System.out.println("Zbir je: " + s);
		}
		else
			System.out.println("Greska.");
		
		

		}
	}
