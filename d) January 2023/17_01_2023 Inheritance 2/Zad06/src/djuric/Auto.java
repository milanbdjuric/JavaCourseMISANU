package djuric;

public class Auto {
	
	protected String naziv;
	protected String boja;
	protected int brojVrata;
	
	public void postaviVrednosti (String naziv, String boja, int brojVrata) {
		this.boja = boja;
		this.brojVrata = brojVrata;
		this.naziv = naziv;
	}
	
	public void ispisi() {
		System.out.println("Naziv: " + naziv + "\nBoja: " + boja + "\nBroj vrata: " + brojVrata);
	}

}
