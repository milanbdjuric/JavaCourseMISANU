package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws KorenException  {
		
		Scanner sc = new Scanner(System.in);
		
		Koren x = new Koren();
		
		try {
			System.out.println("Unesite broj: ");
			x.setBroj(sc.nextDouble());
			System.out.println("Kvadratni koren broja " + x.getBroj() + " je " + x.vadiKoren());
		} catch (KorenException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
