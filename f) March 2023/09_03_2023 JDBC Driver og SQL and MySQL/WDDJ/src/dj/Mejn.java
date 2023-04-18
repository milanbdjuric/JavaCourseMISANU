package dj;

import java.util.ArrayList;
import java.util.Iterator;

public class Mejn {

	public static void main(String[] args) {
	
		// Napisati program koji kreira ArrayList i dodaje vrednosti 5,4,9,7,12 u tu list a zatim ispisuje navedenu listu.
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		x.add(5);
		x.add(4);
		x.add(9);
		x.add(7);
		x.add(12);
		
		System.out.println(x);
		
		Iterator i = x.listIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + ", ");
		}


}
}