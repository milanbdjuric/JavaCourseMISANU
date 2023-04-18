package obrn;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Unesite broj: ");
			int b = sc.nextInt();
			
			if (b<0)
				b = Math.abs(b);
			
			int c;
			
			while(b!=0) {
				c = b%10;
				b/=10;
				System.out.print(c);
			}

		} catch (Exception e) {
			System.out.println("Ceo broj, molim. Aj` opet.");
			main(args);
		}
		
		

	}

}
