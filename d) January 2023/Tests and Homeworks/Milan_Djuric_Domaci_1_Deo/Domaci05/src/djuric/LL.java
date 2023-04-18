package djuric;

import java.util.*;

public class LL {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		List<String> lista = new LinkedList<String>();
		
		int x = 0;
		
		System.out.println("Unesite vrednost / za kraj i ispis unesite prazno polje: ");
		while(true) {
			lista.add(s.nextLine());
			if (lista.get(x).isBlank()) {
				lista.remove(x);
				break;
			}
			x++;
		}
		System.out.println("Lista izgleda ovako: " + lista);
		s.close();
	}
}
