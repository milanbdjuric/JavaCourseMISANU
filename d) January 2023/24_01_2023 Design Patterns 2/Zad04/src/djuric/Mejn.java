package djuric;

import java.util.Scanner;

public class Mejn {

	static void deljivost(int broj) {
		for (int i = 1; i <= broj; i++) {
			if (broj % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		
		deljivost(broj);
		
		sc.close();
		
		
		
		
		
		
		
		
		

		}

	}


