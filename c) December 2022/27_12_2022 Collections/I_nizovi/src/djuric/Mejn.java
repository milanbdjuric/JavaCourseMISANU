package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] brojevi = new int[5];
		
		for(int i=0; i<brojevi.length; i++) { // indeksiranje od 0 do 4
			System.out.println("Unesite broj: ");
			brojevi[i] = sc.nextInt();
			
			if((i+1)==brojevi.length) {
				System.out.println("Niz je napunjen! ");
			}
		}
		
		System.out.println("Elementi niza su: ");
		for (int i=0; i<brojevi.length; i++) {
			System.out.println(brojevi[i]);
		}
		
		

	}

}
