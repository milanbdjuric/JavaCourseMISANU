package djuric;

import java.util.*;

public class ArList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<String>();
		
		int x = 0;
		
	System.out.println("Unesite vrednost / prazno polje za prekid i ispis: ");
		
		while (true) {
			lista.add(sc.nextLine());
			if (lista.get(x).isBlank()) {
				break;
			}
			x++;
		}
		System.out.println("Lista izgleda ovako: ");
		Iterator<String> i = lista.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + "\n");
		}
		sc.close();
		
		
		

	}

}
