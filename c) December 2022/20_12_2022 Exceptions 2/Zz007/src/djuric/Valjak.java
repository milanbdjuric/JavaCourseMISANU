package djuric;

public class Valjak {
	
	private double poluprecnik, visina;
	
	Valjak(double p, double v) {
		poluprecnik = p;
		visina = v;
	}
	
	Valjak() {
		poluprecnik = visina = 1;
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public double getVisina() {
		return visina;
	}
	
	public double zapreminaValjka() {
		return Math.PI*Math.pow(poluprecnik, 2)*visina;
	}

	public String toString() {
		return "r = " + poluprecnik + ", h = " + visina + ", V = " + zapreminaValjka();
	}

}
