package djuric;

public class Mejn {

	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}
	
	public static void main(String[] args) {
		
		DivljaPatka patka = new DivljaPatka();
		
		Curka curka = new DivljaCurka();
		
// Umotavamo curku u CurkaAdapter, zahvaljuci kome ce izgledati kao patka
		
		Patka curkaAdapter = new CurkaAdapter(curka);
		
		System.out.println("Curka: ");
		curka.curlice();
		curka.leti();
		
		System.out.println("Patka: ");
		testPatka(patka);
		
// Pokusavamo da poturimo Curku kao Patku
		
		System.out.println("AdapterCurka: ");
		testPatka(curkaAdapter); //  metoda testPatka() ne zna da je dobila curku prerusenu u patku
		
		

	}

}
