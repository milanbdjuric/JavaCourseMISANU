package paket1;

public class Knjiga {
	
	private String naslov, autor, opis;
	private double cena;
	private boolean stanje;
	
	public Knjiga(String naslov, String autor, String opis, double cena, boolean stanje) {
		this.autor=autor;
		this.cena=cena;
		this.naslov=naslov;
		this.opis=opis;
		this.stanje=stanje;
	}
	

	
	public String toString() {
		return "Naslov: " + naslov + "\nAutor: " + autor + "\nOpis: " + opis + "\nCena: " + cena + "\nStanje: "
				+ stanje;
	}
	
	

	
	

}
