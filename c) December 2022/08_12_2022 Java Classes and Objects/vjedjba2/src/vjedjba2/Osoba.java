package vjedjba2;

public class Osoba {
	
	private String ime, datum, adresa;
	
	public void setIme(String name) {
		ime = name;
	}
	public String getIme() {
		return ime;
	}
	public void setDatum(String date) {
		datum = date;
	}
	public String getDatum() {
		return datum;
	}
	public void setAdresa(String address) {
		adresa = address;
	}
	public String getAdresa() {
		return adresa;
	}
	public void ispis() {
		System.out.println("Osoba " + ime + " rodjen/a " + datum + " zivi na sledecoj adresi: " + adresa);
	}
	

}
