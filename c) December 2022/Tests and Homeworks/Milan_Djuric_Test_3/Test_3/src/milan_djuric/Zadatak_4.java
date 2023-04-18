package milan_djuric;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Zadatak_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		double c[][] = new double[n][n];
		
		System.out.println("Unesite elemente matrice a: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Unesite elemente matrice b: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print("b[" + i + "," + j + "] = ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Izgled matrice a: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Izgled matrice b: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (i<j)
					c[i][j] = (double) Math.pow(a[i][j],2)-Math.pow(b[i][j],2);
				else if (i==j)
					c[i][j] = (double) Math.abs(a[i][j])+Math.abs(b[i][j])+1;
				else
					c[i][j] = (double) Math.sqrt(Math.pow(a[i][j],2)+Math.pow(b[i][j], 2));
			}
		}	
		System.out.println("Matrica c: ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(df.format(c[i][j])+"\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
