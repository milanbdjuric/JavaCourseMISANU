package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Unesite string: ");
		String a = s.nextLine();					// unosi se string
		
		int brojac = 0;								// inicijalizuje brojac na 0
		
		for(int i = 0; i < a.length(); i++) {		// idemo kroz string po indeksima
			if (a.charAt(i) == ' ') {				// od prve do poslednje pozicije stringa ispitujemo karakter po karakter da li je space
				brojac++;							// ako jeste - brojac ga ubroji, i idemo opet sve dok ima karaktera u stringu
			}
		}
		System.out.println("U unetom stringu ima " + brojac + " space karaktera."); 		// ispis
		s.close();
	} 
}
