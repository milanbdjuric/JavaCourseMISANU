package djuric;

public class Mejn {

	public static void main(String[] args) throws Exception {
		
		Tacka a = new Tacka();		// pravimo objekte, tj. instance klase Tacka
		Tacka b = new Tacka();
		
		a.citanje();				// pozivamo metodu za unos koordinata
		b.citanje();
		
		a.postaviKoordinate(a.getX(), a.getY());		// pozivamo metodu za postavljanje koordinata
		b.postaviKoordinate(b.getX(), b.getY());
		
		a.pisanje();			// pozivamo metodu za ispisivanje koordinati tacaka
		b.pisanje();
		
		System.out.println("Rastojanje medju tackama je: " + a.rastojanje(b));		// pozivamo metodu za racunanje udaljenosti izmedju tacaka
	}
}
