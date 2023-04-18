package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite sate: ");
		int sat = sc.nextInt();
		System.out.println("Unesite minute: ");
		int min = sc.nextInt();
		
		if(sat >= 9 && sat < 17) {
			System.out.println("Da.");
		}
		else
			System.out.println("Ne");
		

	}

}
