package djuric;

import java.util.Random; // uvodimo random klasu za generisanje nasumicne vrednosti

public class Mejn {

	public static void main(String[] args) {
		
		Random r = new Random(); // pravimo instancu klase random
		
		for(int i=0; i<5; i++) { // vrtimo loop 5 puta
			System.out.println(r.nextInt());  // stampamo nasumican integer
		}
	}
}
