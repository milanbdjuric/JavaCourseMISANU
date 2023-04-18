package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int x = sc.nextInt();
		
		Faktorijel broj = (n) -> {
			int fact = 1;
			for(n=1; n<=x; n++) {
				fact*=n;
			}
			return fact;
		};
		System.out.println("Faktorijel broja " + x + " je " + broj.faktorijel(x));
		sc.close();
	}
}
