package milan_djuric;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();
		
		int x[][] = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++)
				if (i==j) // zaboravio sam kako se radi za sporednu dijagonalu...
					x[i][j] = 1;
				else
					x[i][j] = 0;
			}
		

		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
