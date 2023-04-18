package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite manji broj: ");
		int x = sc.nextInt();
		
		System.out.println("Unesite veci broj: ");
		int y = sc.nextInt();
		
		System.out.println("Brojevi deljivi sa 3 u intervalu izmedju " + x + " i " + y + " su: ");
		
		for (int i = x; i < y; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
