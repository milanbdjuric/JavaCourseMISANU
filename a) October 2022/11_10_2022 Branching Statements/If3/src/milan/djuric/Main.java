package milan.djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// za uneti broj ispitati da li je deljiv brojem 2 i brojem 3
		
		//1.deo algoritma
		
		Scanner scanner = new Scanner(System.in);
		
		int broj;
		
		System.out.println("Unesite broj: ");
		
		broj = scanner.nextInt();
		
		//2. deo obrada podataka
		
		if (broj % 2 == 0 && broj % 3 == 0)
		{
			System.out.println("Broj je deljiv i sa 2 i sa 3");
		}
		
		/* else
			System.out.println("Nije deljiv i sa 2 i sa 3"); */
		
		scanner.close();
		
	}

}
