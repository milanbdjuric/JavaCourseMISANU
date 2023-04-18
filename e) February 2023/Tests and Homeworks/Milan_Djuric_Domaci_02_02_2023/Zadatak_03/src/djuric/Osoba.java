package djuric;

public class Osoba {
	
	String ime, datumRodjenja, adresa;			// deklarisemo trazene podatke o osobi
	
	Osoba(String i, String d, String a){		// pravimo konstruktor za iniciranje objekta klase osoba
		ime = i;
		datumRodjenja = d;
		adresa = a;
	}

	public String toString() {					// pravimo javnu metodu koja sve podatke o osobi pretvara u string
		return "Ime: " + ime + "\nDatum rodjenja: " + datumRodjenja + "\nAdresa: " + adresa;
	}
}
