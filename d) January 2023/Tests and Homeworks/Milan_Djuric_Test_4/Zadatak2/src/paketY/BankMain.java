package paketY;

import java.util.Scanner;

import paketX.*;

public class BankMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount a = new BankAccount(500);
		
		a.trenutnoStanje();
		
		System.out.print("Iznos uplate: ");
		
		a.setUplata(sc.nextDouble());
		
		a.dodaj();
				
		a.trenutnoStanje();

		
		
		
		
		


		
	}
}
