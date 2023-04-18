package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvi redni broja dana u godini: ");
		int k1 = sc.nextInt();
		System.out.println("Unesite drugi redni broja dana u godini: ");
		int k2 = sc.nextInt();
		System.out.println("Unesite treci redni broja dana u godini: ");
		int k3 = sc.nextInt();
		
		// da li je prvi dan u nedjelji
		
		if (k1 % 7 == 0 && k2 % 7 == 0 && k3 % 7 == 0)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else if (k1 % 7 == 1 && k2 % 7 == 1 && k3 % 7 == 1)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else if (k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else if (k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else if (k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else if (k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else if (k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6)
			System.out.println("Oznacavaju iste dane u nedelji.");
		else {
			System.out.println("Uneti broj nije izmedju 0-365.");
		}


	}

}
