package djuric;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		// interfejs <TipPromenljive> ime = new ArrayList<TipPromenljive>();         
		// T predstavlja tip promenljive
		
		List<Integer> kolekcijaAL = new ArrayList<Integer>();

		// integrisana metoda add - za dodavanje vrednosti
		
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);
		
		System.out.println(kolekcijaAL);
		
		// Zakljucak: Koristite ArrayList kada ne znate unapred velicinu niza!
		// niz je staticki, ArrayList dinamicki (moze da mu se menja broj elemenata)
		// ArrayList nema zadat broj elemenata, niz obavezno ima
		
		
		

	}

}
