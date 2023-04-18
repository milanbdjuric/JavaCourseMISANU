package dj;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) throws Exception{
		// ispitivanje da li je broj palindrom

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ceo broj: ");
		try {
			int broj = sc.nextInt();
			int a = broj;
			int d = 0, cifra;
			
			while(broj != 0) {
				cifra = broj%10;
				broj = broj/10;
				d = d*10 + cifra;
			}
			if (d == a) {
			System.out.println("Broj je palindrom.");
				}
			else
			System.out.println("Broj nije palindrom.");	
			
		} catch (Exception e) {
			System.out.println("Ceo broj smo rekli! Aj` ponovo.");
			main(args);
		}
		

	
		
		
		

	}

}
