package aqvawee;

public class Covek {
	
	private String ime, datum, adresa;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
	public String ispis() {
		return ime + " rodjen(a) " + datum + " zivi u " + adresa;
	}
	

}
