package djuric;

public class Zaposleni extends Osoba{			// klasa zaposleni nasledjuje klasu osoba
	
	String nazivFirme, nazivOdeljenja;			// deklarisemo trazene dodatne podatke o osobi

	Zaposleni(String i, String d, String a, String f, String o) {		// pravimo konstruktor za iniciranje objekta klase djak
		super(i, d, a);												// kljucnom recju super pozivamo konstruktor roditeljske klase...
		nazivFirme = f;												// ... kome dodajemo i nove podatke specificne za izvedenu klasu zaposleni
		nazivOdeljenja = o;
	}

	public String toString() {						// pravimo javnu metodu koja pretvara u string podatke preuzete iz roditeljske klase + dodatne podatke o zaposlenom
		return super.toString() + "\nNaziv firme: " + nazivFirme + "\nNaziv odeljenja: " + nazivOdeljenja;
	}
}
