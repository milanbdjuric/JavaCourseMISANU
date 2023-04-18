package milan.djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.print("Unesite broj bodova: ");
		
		int bod = xyz.nextInt();
		
		if (bod >= 0 && bod <= 49) {
			System.out.println("Ocena 1");
		}
		else if (bod >= 50 && bod <= 60) {
			System.out.println("Ocena 2");
		}
		else if (bod >= 61 && bod <= 69) {
			System.out.println("Ocena 3");
		}	
		else if (bod >= 70 && bod <= 80) {
			System.out.println("Ocena 4");
		}		
		else if (bod >= 81 && bod <= 100) {
			System.out.println("Ocena 5");
		}
		else
			System.out.println("Greska, bodova moze da bude od 0 do 100.");
			
			
		xyz.close();
		

	}

}
