package djuric;

import java.util.Scanner;

public class aswws {

	public static void main(String[] args) {
		
		int x[] = {25, 31, 12, -7, 14, 24, 121, -35, 42, 15};
		
		int y[] = new int[10];
		int z[] = new int[10];
		int yBr= 0, zBr = 0;
		
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 2 == 0) {
				
				y[yBr++] = x[i];
				
				
			}
			if (x[i] % 5 == 0) {
				z[zBr++] = x[i];
			}
		}
		
		System.out.println("Niz x: ");
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.print("\nNiz y: ");
		
		for (int i = 0; i < yBr; i++) {
			System.out.print(y[i] + " ");
		}
		
		System.out.print("\nNiz z: ");
		
		for (int i = 0; i < zBr; i++) {
			System.out.print(z[i] + " ");
		}

		
	
		
		
		
		

		}
	}
		
