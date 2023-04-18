package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj: ");

		Negativ broj = (n) -> (n<0);
		
		if (broj.proveri(sc.nextDouble())) {
			System.out.println("Broj je negativan. ");
		}
		else
			System.out.println("Broj nije negativan. ");
		
		sc.close();
	}
}
