package djuric;

public class Predmet {
	
	double specTezina;					// deklarisemo specificnu tezinu i oznaku
	char oznakaVrste;
	
	Predmet(){}							// podrazumevani konstruktor
	
	public void setOznakaVrste(char oznakaVrste) {		// metoda za postavljanje oznake vrste
		this.oznakaVrste = oznakaVrste;
	}

	public char getOznakaVrste() {		// metoda za dohvatanje oznake vrste predmeta
		return oznakaVrste;

	}
	public double getSpecTezina() {		// metoda za dohvatanje specificne tezine predmeta
		return specTezina;
	}
}
