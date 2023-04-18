package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();
		
		double p = 1;
		int i = 2; // jer u zadatku krece od 2 pa do n+1
		
		while(i <= n+1) {
			p *= (1-(1.0/i));
			i++;
		}
		System.out.println("P = " + p);
		
		sc.close();
	}
}
