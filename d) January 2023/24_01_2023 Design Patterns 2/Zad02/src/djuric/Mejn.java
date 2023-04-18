package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite n: ");
		int n = sc.nextInt();
		if (n <=0)
			System.out.println("Greska.");
		
		int zbir = 0;
		
		for(int i = 0; i<n; i++) {
			System.out.println("Unesite broj: ");
			int a = sc.nextInt();
			if (a<0 && a%2!=0) {
				zbir+=a;
			}
		}
		System.out.println("Zbir je: " + zbir);

	}

}
