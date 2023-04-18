package djuric;

import java.util.ArrayList;
import java.util.List;

public class Mejn {

	public static void main(String[] args) {
		
		List<String> kolekcija = new ArrayList<String>();
		
		// size() - metoda koja vraca broj elemenata smestenih u kolekciji ArrayList
		
		System.out.println("Pocetna duzina: " + kolekcija.size());
		
		// add() - dodaje element NA KRAJ kolekcije
		
		kolekcija.add("Prvi");
		kolekcija.add("Drugi");
		kolekcija.add("Treci");
		kolekcija.add("Cetvrti");
		
		
		for(String s : kolekcija)
			System.out.printf("%-20S", s);
		
		System.out.println("\nTrenutna duzina: " + kolekcija.size());
		
		//  provera da li se neki zadati element nalazi unutar kolekcije
		// contains - ugradjena metoda koja vraca true ako kolekcija sadrzi trazeni element, odnosno
		// vraca false ukoliko kolekcija ne sadrzi trazeni element
		
		boolean sadrzi = kolekcija.contains("Treci"); // true ili false; ovdi smesta true unutar promenljive sadrzi
		
		if(sadrzi) {   // ovo je isto kao: if(sadrzi == true)
			System.out.println("Trazeni element se nalazi u zadatoj kolekciji! ");
		}
		else {
			System.out.println("Trazeni element se ne nalazi u zadatoj kolekciji! ");
		}		
		// get() - metoda get vraca element sa zadatim indeksom
		
		String element = kolekcija.get(2);
		System.out.println("Element sa indeksom 2 u kolekciji je: " + element);
		
		// indexOf - metoda koja vraca indeks prve pojave zadatog elementa kolekcije
		// vratice vrednost -1 ukoliko trazeni element ne postoji
		
		int pozicija = kolekcija.indexOf("Drugi");
		System.out.println("Element Drugi je na poziciji: " + pozicija);
		
		// toArray - metoda koja sluzi za prebacivanje elemenata u niz
		
		String[] nizString = new String[kolekcija.size()];
		kolekcija.toArray(nizString);
		
		for(String s : nizString)
			System.out.printf("%s ", s);
		
		// remove - metoda koj brise prvu pojavu zadate vrednosti
		System.out.println("\nKolekcija nakon uklanjanja elementa Treci: ");
		kolekcija.remove("Treci");
		for(String s : kolekcija)
			System.out.printf("%s ", s);
		
		// clear - metoda koja brise SVE elemente iz zadate kolekcije.. ona je void
		
		kolekcija.clear();
		System.out.println("\nVelicina kolekcije nakon clear: " + kolekcija.size());
	}
}
