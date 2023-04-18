package djuric;

public abstract class Predmet {
	
	private double specTezina;
	private char oznaka;
	
	Predmet(double st, char o){
		specTezina = st;
		oznaka = o;
	}
	
	public abstract double zapremina();
	
	public abstract double tezina();

	public char getOznaka() {
		return oznaka;
	}
	
	public double getSpecTezina() {
		return specTezina;
	}
	
	public String opis() {
		return "Oznaka: " + oznaka + "\nSpecificna tezina: " + specTezina;
	}

}
