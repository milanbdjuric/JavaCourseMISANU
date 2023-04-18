package djuric;

import java.util.LinkedList;
import java.util.List;

public class Mejnara {

	public static void main(String[] args) {
		
		List<String> LL = new LinkedList<String>();
		
		// Dodavanje elemenata u povezanoj listi
		
		LL.add("A");    // 0
		LL.add("B");     // 1
		
		LL.add(2, "C");   // 2   - daje mu indeks
		
		System.out.println("Elementi povezane liste su: " + LL);
		
		// Brisanje elementa iz povezane liste
		
		LL.remove(0);      // brisanje preko indeksa
		LL.remove("B");    // brisanje preko vrednosti
		
		System.out.println("Povezana lista nakon brisanja elemenata: " + LL);
		
		LL.add("D");
		LL.add("E");
		LL.add("F");
		
		System.out.println("Elementi povezane liste su: " + LL);
		
		// Trazenje elementa u povezanoj listi
		
		boolean sadrz = LL.contains("E");
		
		if(sadrz) {
			System.out.println("Lista sadrzi element E. ");
		}
		else
			System.out.println("Lista ne sadrzi element E. ");
		
		// Pristupanje (uzimanje) vrednosti elementa iz povezae liste
		
		Object element = LL.get(3);
		
		System.out.println("Zatrazen element je: " + element);
		
		// Postavljanje vrednosti elementa u povezanoj listi
		
		LL.set(1, "Z");
		
		System.out.println("Povezana lista nakon promene: " + LL);
	}
}
