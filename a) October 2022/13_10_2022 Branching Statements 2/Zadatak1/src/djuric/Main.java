package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1. deo: UNOS PODATAKA
		// 2. deo: OBRADA PODATAKA
		// 3. deo: STAMPANJE

		Scanner sc = new Scanner(System.in);
		int ocena;
		System.out.println("Unesite ocenu: ");
		ocena = sc.nextInt();

	switch (ocena) {
		case 5: {
			System.out.println("Odlican. ");
			break;
		}
		case 4: {
			System.out.println("Vrlo dobar. ");
			break;
		}
		case 3: {
			System.out.println("Dobar. ");
			break;
		}
		case 2: {
			System.out.println("Dovoljan. ");
			break;
		}
		case 1: {
			System.out.println("Nedovoljan. ");
			break;
		}
		default:
			System.out.println("Uneta ocena ne postoji.");
		}
	
	sc.close();

		
/*		if (ocena == 5) {
			System.out.println("Odlican. ");
		}
		else if (ocena == 4) {
			System.out.println("Vrlo dobar. ");
		}
		else if (ocena == 3) {
			System.out.println("Dobar. ");
		}
		else if (ocena == 2) {
			System.out.println("Dovoljan. ");
		}
		else if (ocena == 1) {
			System.out.println("Nedovoljan. ");
		}
		else {
			System.out.println("Uneta ocena ne postoji.");
		}
	*/
	}

}
