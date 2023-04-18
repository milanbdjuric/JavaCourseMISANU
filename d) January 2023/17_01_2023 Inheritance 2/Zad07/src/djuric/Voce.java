package djuric;

public class Voce {
	
	protected String naziv;
	protected String boja;
	protected double cena;
	protected double kolicina;
	
	Voce(String naziv, String boja, double cena, double kolicina){
		this.boja = boja;
		this.kolicina = kolicina;
		this.cena = cena;
		this.naziv = naziv;
	}

}
