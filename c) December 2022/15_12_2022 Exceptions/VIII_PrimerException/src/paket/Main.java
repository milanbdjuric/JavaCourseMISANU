package paket;

public class Main {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 10 / a;
		} catch(ArithmeticException e) {
			System.out.println("Izuzetak. ");
/*		} catch(ArithmeticException e) {
			System.out.println("Izuzetak. ");
		}
*/ 
			// ukoliko postoji vise catch blokova i tip parametra odgovara tipu bacenog izuzetka
			// izvrsava se samo prvi takav catch blok.
			// GRESKA JE NAVESTI DVA CATCH BLOKA SA ISTIM TIPOM PARAMETRA!
	}

	}}
