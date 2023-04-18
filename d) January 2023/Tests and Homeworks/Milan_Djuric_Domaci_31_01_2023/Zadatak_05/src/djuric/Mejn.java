package djuric;

import java.util.*;

public class Mejn {

	public static void main(String[] args) {
		
		// kreiramo dinamicki niz
		
		List<String> a = new ArrayList<String>();
		
		// pravimo niz od deset imena
		
		String niz[] = {"Mika", "Zika", "Pera", "Laza", "Dragutin", "Ana", "Una", "Ena", "Ina", "Jelena"};
		
		// dodajemo ga for-each petljom i ugradjenom metodom u dinamicki niz
		
		for(String x : niz) {
			a.add(x);
		}
		
		System.out.println(a); // stampanje
		
		a.add(4, "Milentije"); // dodavanje novog imena na 5 poziciju (4, jer je 0 pocetna)
		
		System.out.println(a); // stampa
		
		a.remove(2); // izbacivanje jednog imena njegovim indeksom
		
		System.out.println(a); // stampa
	
	}

}
