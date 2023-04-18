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
		System.out.println("\nMatrica: ");
		
		for (int i=0; i<red; i++) {
			for (int j=0; j<kol;j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}
		
		
		
		System.out.print("\nElementi glavne dijagonale su: ");
		

		for (int i=0; i<red; i++) {
			for (int j=0; j<kol; j++) {
				if (i==j) {
				System.out.print(a[i][j] + " ");
				}	
			}
		}
		
		System.out.print("\nElementi sporedne dijagonale su: ");
		

		for (int i=0; i<red; i++) {
			for (int j=0; j<kol; j++) {
				if (i + j == red - 1) {
				System.out.print(a[i][j] + " ");
				}	
			}
		}
		
		
		
	
	
	
	
	}}

