package djuric;

public class Bure extends Teret{
	
	int ID = (int)(Math.random()*1000);
	final char VRSTA = 'B';

	double poluprecnik, visina;

	Bure(double specTezina, double p, double h) {
		super(specTezina);
		poluprecnik = p;
		visina = h;
	}

	public double zapremina() {
		return Math.pow(poluprecnik, 2)*Math.PI*visina;
	}

	public double tezina() {
		return zapremina()*specTezina;
	}

	public String toString() {
		return "[ID=" + ID +", poluprecnik=" + poluprecnik + ", visina=" + visina + ", vrsta="
				+ VRSTA + ", zapremina=" + zapremina() + ", tezina=" + tezina()+ "]";
	}


	
	
}
