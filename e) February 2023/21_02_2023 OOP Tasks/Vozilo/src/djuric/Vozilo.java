package djuric;

public abstract class Vozilo {

	private double tezina;
	
	Vozilo(double tezina){
		this.tezina = tezina;
	}
	
	double getTezina() {
		return tezina;
	}
	
	abstract char vrstaVozila();
	
	String opis() {
		return "\nTezina: " + tezina + "\nOpis: " + vrstaVozila();
	}
	

}
