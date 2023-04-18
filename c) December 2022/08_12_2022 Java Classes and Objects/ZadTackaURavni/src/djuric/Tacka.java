package djuric;

public class Tacka {
	
	double x, y;
	
	Tacka(){};    // - evo defaultne vrednosti 0.0. // konstruktor bez parametara
	
	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}

	double RastojanjeOdKP () {
		return Math.sqrt(x*x + y*y);
	}
	
	double RastojanjeOdZadateTacke(Tacka t) {
		return Math.sqrt(Math.pow(x - t.x, 2)) + Math.sqrt(Math.pow(y - t.y,  2));
	}
	
	

}
