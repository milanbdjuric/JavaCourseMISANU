package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Broj redova: ");
		int red = sc.nextInt();
		
		System.out.print("Broj kolona: ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int[red][kolona];
		
		System.out.println("Elementi matrice: ");
		for (int i=0; i < red; i++) {
			for (int j=0; j < kolona; j++) {
				System.out.print("a[" + i + ", " + j + "] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		
		// ispisivanje elemanata
		
		System.out.println("\nElementi 2D niza su: ");
		
		for (int i = 0; i< red; i++) {
			for (int j=0; j < kolona; j++) {
				System.out.print(niz[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elementi prvog reda su: ");
		for (int i =0; i<red; i++) {
			for(int j=0; j<kolona;j++) {
				if(i == 0)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println("\nElementi druge kolone su: ");
		for (int i =0; i<red; i++) {
			for(int j=0; j<kolona;j++) {
				if(j == 1)
					System.out.print(niz[i][j] + " ");
			}
		}
		System.out.println("\nParni elementi niza su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				if (niz[i][j]%2==0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		System.out.println("\nNeparni elementi niza su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				if (niz[i][j]%2!=0) {
					System.out.print(niz[i][j] + " ");
				}
			}
	}
	
		System.out.println("\nElementi sa parnim indeksima redova su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				if (i%2==0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		System.out.println("\nElementi sa neparnim indeksima kolona su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				if (j%2!=0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		System.out.println("\nElementi sa neparnim indeksima redova su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				if (i%2!=0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}
		System.out.println("\nElementi sa parnim indeksima i redova i kolona su: ");
		for (int i=0; i<red; i++) {
			for (int j=0; j<kolona; j++) {
				if (i%2==0 && j%2==0) {
					System.out.print(niz[i][j] + " ");
				}
			}
		}


	}

}
