package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		
		int broj = sc.nextInt();
		
		if (broj > 0) {
			System.out.print("Broj je pozitivan.");
		}
		else if (broj < 0) {
			System.out.print("Broj je negativan.");
		}
		else {
			System.out.print("To je nula bato");
		}

	}

}
