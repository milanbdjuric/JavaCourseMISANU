package djuric;

public class Valjak {
	
	private double r, h;
	
	Valjak(double poluprecnik, double visina) {
		r = poluprecnik;
		h = visina;
	}
	Valjak() {
		r = 1;
		h = 1;
	}
	
	public double getR() {
		return r;
	}
	public double getH() {
		return h;
	}
	public double zapremina() {
		return 3.14 * r * r * h;
	}
	
	public void opis() {
		System.out.println("[" + r + ", " + h + "]");
	}
	
	
	}
	
	

