package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite slovo: ");

		char slovo = sc.next().charAt(0);

		switch (slovo) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U': {
			System.out.println("Samoglasnik.");
			break;
		}
		
		// ili case 'a' : case 'A'
		// pa case 'b' : case 'B'
		// ili case 'a' & 'A' moze i tako...
		
		
		default:
			System.out.println("Suglasnik");
		}
		sc.close();

	}

}
