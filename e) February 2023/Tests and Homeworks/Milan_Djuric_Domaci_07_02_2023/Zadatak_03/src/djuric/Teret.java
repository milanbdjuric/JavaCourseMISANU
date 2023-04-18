package djuric;

public abstract class Teret{
	
	double specTezina;
	char vrsta;

	Teret(double specTezina){
		this.specTezina = specTezina;
	}

	public double getSpecTezina() {
		return specTezina;
	}
	public char getVrsta() {
		return vrsta;
	}
	
	public abstract double zapremina();
	
	public abstract double tezina();

}
