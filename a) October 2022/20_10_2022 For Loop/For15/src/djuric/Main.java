package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int negativni = 0, pozitivni = 0, nula = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int broj = 1; broj <=10; broj++) {
			
			System.out.println("Unesi " + broj + " broj: ");
			
			int x = sc.nextInt();
			
			if (x < 0) {
				negativni++;
			}
			if (x == 0) {
				nula++;
			}
			if (x > 0) {
				pozitivni++;
			}
		}
		System.out.println("Pozitivnih ima " + pozitivni + ", nula ima " + nula + ", a negativnih ima " + negativni);


	}

}
