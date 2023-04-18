package djuric;

public class Kartica {
	
	protected String tipKartice;
	protected String imeVlasnika;
	
	Kartica(String tipKartice, String imeVlasnika){
		this.imeVlasnika = imeVlasnika;
		this.tipKartice = tipKartice;
	}
	
	public void ispisi() {
		System.out.println("Tip kartice: " + tipKartice + "\nIme vlasnika: " + imeVlasnika);
	}

}
