package djuric;

import java.util.Scanner;

public class Mejn {
	
	public static int suma(int broj) {		// staticka metoda za izracunavanje sume cifara za dati/uneti integer
		if (broj == 0)						// metoda treba da poziva samu sebe dok se ne ispuni osnovni uslov
			return 0;						// to je u ovom slucaju uslov da se vrati 0 ako je broj jednak 0 - tj. dok ne nestane cifara
		return (broj%10) + suma(broj/10);	// vraca zbir odvojene cifre i ponovo pozvane metode za broj kome je odstranjena ta cifra
	}										// sumira sve dok ima cifara

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj: ");
			
		System.out.println("S = " + suma(sc.nextInt())); // pozivamo metodu za uneti broj i stampamo

		sc.close();
	}
}
