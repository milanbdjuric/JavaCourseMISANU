package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite redni broj dana u nedelji: ");
		
		int dan = sc.nextInt();
		
		switch(dan)
		{
		case 1: {
			System.out.println("Ponedeljak.");
			break;
		}
		case 2: {
			System.out.println("Utorak.");
			break;
		}
		case 3: {
			System.out.println("Sreda.");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak.");
			break;
		}
		case 5: {
			System.out.println("Petak.");
			break;
		}
		case 6: {
			System.out.println("Subota.");
			break;
		}
		case 7: {
			System.out.println("Nedelja.");
			break;
		}
		default:
			System.out.println("Mene si naso?");
		}
		
		sc.close();

	}

}
