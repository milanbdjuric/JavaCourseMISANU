package paket;

import java.util.Scanner;

public class Main {
	
	public static int kolicnik(int im, int br) {
		return br/im;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite brojilac razlomka: ");
		int brojilac = sc.nextInt();
		
		System.out.println("Unesite brojilac razlomka: ");
		int imenilac = sc.nextInt();
		
		try {
			int rezultat = kolicnik(imenilac, brojilac);
			System.out.println("Kolicnik iznosi: " + rezultat);
		} catch (Exception e) {
			System.out.println("Deljenje nulom.");
			
		}
		
//		S
		
		

	}

}
