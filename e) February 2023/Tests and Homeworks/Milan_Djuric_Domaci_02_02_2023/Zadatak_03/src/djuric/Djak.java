package djuric;

public class Djak extends Osoba {			// klasa djak nasledjuje klasu osoba
	
	String nazivSkole, razred;				// deklarisemo trazene dodatne podatke o djaku

	Djak(String i, String d, String a, String n, String r) {		// pravimo konstruktor za iniciranje objekta klase djak
		super(i, d, a);											// kljucnom recju super pozivamo konstruktor roditeljske klase...
		nazivSkole = n;											//... kome dodajemo i nove podatke specificne za izvedenu klasu djak
		razred = r;												
	}

	public String toString() {						// pravimo javnu metodu koja pretvara u string podatke preuzete iz roditeljske klase + dodatne podatke o djaku
		return super.toString() + "\nNaziv skole: " + nazivSkole + "\nRazred: " + razred;
	}
	
	

}
