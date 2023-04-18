package djuric;

public class Master extends Kartica{
	
	private int pinKod;
	
	Master(String tipKartice, String imeVlasnika, int pinKod){
		super(tipKartice, imeVlasnika);
		this.pinKod = pinKod;
	}
	
	public void promeniPinKod(int pinKod) {
		this.pinKod = pinKod;
		
	}
	
	public void ispisi() {
		super.ispisi();
		System.out.println("Pin kod: " + pinKod);
	}

}
