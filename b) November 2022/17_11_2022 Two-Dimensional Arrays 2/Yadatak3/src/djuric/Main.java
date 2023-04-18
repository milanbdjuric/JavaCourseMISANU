package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite duzinu reda: ");
		int r = sc.nextInt();
		System.out.println("Unesite duzinu kolone: ");
		int k = sc.nextInt();
		int m[][] = new int[r][k];
		System.out.println("Unesite elemente marte: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print("X[" + i + "," + j + "] = ");
				m[i][j]=sc.nextInt();
			}
		}
		System.out.println("Izgled matre: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				System.out.print(m[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Elementi drugig reda su: ");
		for (int i=0; i<r; i++) {
			for (int j=0; j<k; j++) {
				if (m[i][j]%2==0)
					System.out.print(m[i][j]+" ");
			}
		}
		
		
		

		}
	}
