package djuric;

import java.util.*;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int niz[] = {1, 2, 3, 2, 1, 4, 5, 6, 5, 7};			// unosimo zadati niz
		
		List<Integer> x = new ArrayList<Integer>();
		
		for(int i : niz) {
			x.add(i);										// for-each petljom od njega pravimo dinamicki niz kako bi mogli da izbacujemo elemente
		}
		
		System.out.println("Zadati niz:\n" + x);			// stampamo zadati niz
		
		for(int i = 0; i < x.size(); i++) {					
			for(int j = i+1; j < x.size(); j++) {			// prolazimo elemente niza po indeksima - svaki element poredimo sa njemu susednim pa svakim sledecim sve do kraja niza
				if (x.get(i).equals(x.get(j))){				// ako su jednaki
					x.remove(j);							// brisemo duplikat
				}
			}
		}
		System.out.println("Niz posle brisanja duplikata:\n" + x);	// stampamo niz bez duplikata
		sc.close();
	}
}
