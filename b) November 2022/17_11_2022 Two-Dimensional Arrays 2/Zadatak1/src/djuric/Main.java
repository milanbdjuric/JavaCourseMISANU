package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matrica[][] = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
		
		System.out.println("Elementi: \n");
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\nResenje: \n");
		for (int i=0; i<5; i++) {
			for (int j=4; j>=i; j--) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();	
		}
		System.out.println("\nResenje: \n");
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();	
		}
	}
}
