package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int red, kolone;
		System.out.print("Unesite broj redova: ");
		red = sc.nextInt();
		
		System.out.print("Unesite broj kolona: ");
		kolone = sc.nextInt();
		
		int a[][] = new int[red][kolone];
		int b[][] = new int[red][kolone];
		int c[][] = new int[red][kolone];
		
		System.out.println("\nElementi prve matrice: ");
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolone;j++) {
				System.out.print("a[" + i + "," + j + "] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("\nElementi druge matrice: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolone;j++) {
				System.out.print("b[" + i + "," + j + "] = ");
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nElementi 2D niza a su: ");
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolone;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nElementi 2D niza b su: ");
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolone;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nZBIR JE:");
		for (int i=0; i<red; i++) {
			for(int j = 0; j<kolone;j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nRAZLIKA JE:");
		for (int i=0; i<red; i++) {
			for(int j = 0; j<kolone;j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nPROIZVOD JE:");
		for (int i=0; i<red; i++) {
			for(int j = 0; j<kolone;j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}





	}
}
