package if2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// za uneti broj ispitati da li je pozitivan, negativan ili nula
		
		// 1. deo: Unos podataka (uocavanje potrebnih ulaznih podataka)
		
		Scanner sc = new Scanner(System.in);
		
		int broj;
		
		System.out.println("Unesite broj: ");
		
		broj = sc.nextInt();
		
		// 2. deo: Obrada podataka
		
		if (broj > 0)
		{
			System.out.println("Broj je pozitivan");
		}
		
		if (broj < 0)
		{
			System.out.println("Broj je negativan");
		}		
		
		if (broj == 0)
		{
			System.out.println("Broj je nula");
		}
		
		sc.close();
		
		// = naredba dodele, vrednost sa desne strane se dodeljuje levoj
		// == logicki operator jednakosti (vrsi ispitivanje da li je vrednost sa desne jednako vrednosti sa leve)

	}

}
