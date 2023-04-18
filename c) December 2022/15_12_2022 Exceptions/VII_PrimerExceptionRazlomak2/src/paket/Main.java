package paket;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	//throws (kljucna rec) koristi se u zaglavlju metode da naznaci tip ili tipove izuzetaka koje ta metoda moze da baci
	
	public static int kolicnik(int im, int br) throws ArithmeticException{
		return br / im;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {		
			System.out.println("Unesite brojilac: ");
			int brojilac = sc.nextInt();
			
			System.out.println("Unesite imenilac: ");
			int imenilac = sc.nextInt();
		
			int rezultat = kolicnik(imenilac, brojilac);
			
			System.out.println("Rezultat: " + rezultat);
			
		} catch (ArithmeticException e) {
			
			System.out.println("Izuzetak. " + e);
			
		} catch (InputMismatchException e) {
			System.out.println("Unesite celobrojnu vrednost!");
		}
		
		
		

	}

}
