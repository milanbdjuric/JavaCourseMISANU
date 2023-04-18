package djuric;

public class Radnik {
	
	private String ime;
	private double procenat, prihod;
	
	Radnik(String ime, double procenat, double prihod) {
		this.ime = ime;
		this.prihod = prihod;
		this.procenat = procenat;
	}
	
	public double prihod() {
		return prihod;
	}
	
	public double plata() {
		return prihod() * procenat / 100; 
	}
	
	public String opis() {              // ovo je konvertovanje u string!!!
		return ime + "/" + plata();
	}
	
	public void drugiOpis() {
		System.out.println(ime + "/" + plata());
	}
	
	
	
	

}
