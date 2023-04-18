package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite kategoriju: ");
		
		char slovo = sc.next().charAt(0);
		
		switch (slovo) {
		case 'A': {
			System.out.println("Moz vozis motor");
			break;
		}
		case 'B': {
			System.out.println("Moz vozis kola");
			break;
		}
		case 'C': {
			System.out.println("Moz vozis kamion");
			break;
		}
		case 'D': {
			System.out.println("Moz vozis bus");
			break;
		}
		default: {
			System.out.println("Nisi ga dobro uno!");
		}
		}

		
/*		if (slovo == 'A') {
			System.out.println("Moz vozis motor");
		}
		else if (slovo == 'B') {
			System.out.println("Moz vozis kola");
		}
		else if (slovo == 'C') {
			System.out.println("Moz vozis kamion");
		}
		else if (slovo == 'D') {
			System.out.println("Moz vozis bus");
		}
		else {
			System.out.println("Nisi ga dobro uno!");
		}
		
		sc.close();
*/		
	}

}
