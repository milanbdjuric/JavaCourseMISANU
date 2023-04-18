package djuric;

public class Jabuka extends Voce{
	
	String vrsta;
	Jabuka(String naziv, String boja, double cena, double kolicina, String vrsta){
	super(naziv, boja, cena, kolicina);
	this.vrsta = vrsta;
	}
	
	public double izracunajZaUplatu() {
		return cena * kolicina;
	}
}
