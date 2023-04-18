package djuric;

import java.util.LinkedList;
import java.util.List;

public class Mejnara {

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Zika", "Fica"};
		List<String> listaImena = new LinkedList<String>();
		for(String s : imena)
			listaImena.add(s);
		
		System.out.println("Prva lista: " + listaImena);		
		
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};
		List<String> listaImena1= new LinkedList<String>();
		for (String s : imena1)
			listaImena1.add(s);
		
		System.out.println("Druga lista: " + listaImena1);
		
		listaImena.addAll(listaImena1);
		System.out.println("Nova lista: " + listaImena);
		
		listaImena.subList(0, 2).clear();
		System.out.println("Lista nakon brisanja elemenata sa indeksina od 0-2: " + listaImena);
		// subList(indexFrom,indexTo)
		// indexFrom - pocevsi od zadatog indeksa UKLJUCUJUCI I NJEGA
		// indexTo - do zadatog indeksa NE UKLJUCUJUCI NJEGA.. probaj
	}
}
