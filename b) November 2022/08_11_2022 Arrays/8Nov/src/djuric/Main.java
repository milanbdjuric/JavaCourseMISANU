package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner (System.in);
		
		System.out.println("Unesite broj clanova niza n: ");
		int n = ulaz.nextInt();
		
		// rezervisanje prostora za niz od n clanova
		int x[] = new int[n];
		
		System.out.println("Unesite clanove niza: ");
		for (int i = 0; i < x.length; i++) { 
			System.out.print("x[" + i + "] = "); 
			x[i] = ulaz.nextInt(); 
			} 
		
		// Štampanje članove niza 
		
		for (int i = 0; i < x.length; i++)
			System.out.println(x[i]); ulaz.close(); 
			}
	}
		
