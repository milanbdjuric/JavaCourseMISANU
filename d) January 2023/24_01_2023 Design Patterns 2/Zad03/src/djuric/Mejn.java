package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite pozitivan ceo broj: ");
		int x = sc.nextInt();
		
		boolean m = false;
		
		while(x > 0) {
			int z = x % 10;
			if (z == 5) {
				m = true;		
			}	
			x = x/10;
		}
		
		if (m)
			System.out.println("ima 5");
		else
			System.out.println("nema 5");
		
		sc.close();
	}
}
