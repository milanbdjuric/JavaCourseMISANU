package djuric;

public abstract class Vozilo {
	
	double tezina;
	
	Vozilo(double tezina){
		this.tezina = tezina;
	}
	
	public abstract void opisVozila();
}
