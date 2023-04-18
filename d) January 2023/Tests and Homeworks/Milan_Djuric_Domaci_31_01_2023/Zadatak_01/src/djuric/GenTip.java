package djuric;

// pravimo genericku klasu za prihvatanje razlicitih tipova podataka

public class GenTip<nj> {
	
	nj ob;
	
	GenTip(nj ob){ // konstruktor za prihvatanje vrednosti i tipa podatka
		this.ob = ob;
	}
	
	// metoda koja ispisuje tip podatka i njegovu vrednost
	
	public void ispis() {
		System.out.println("Tip: " + ob.getClass() + ", vrednost: " + ob);
	}
}
