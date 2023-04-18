package djuric;

public class Sfera extends Predmet{
	
	private double polupr;

	Sfera(double st, char o, double p) {
		super(st, o);
		polupr = p;
	}

	public double zapremina() {
		return 4/3*Math.pow(polupr, 3)*Math.PI;
	}

	public double tezina() {
		return zapremina()*getSpecTezina();
	}
	
	public String opis() {
		return super.opis() + "\nPoluprecnik: " + polupr + "\nZapremina: " + zapremina() + "\nTezina: " + tezina(); 
	}

}
