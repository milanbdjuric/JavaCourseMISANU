package djuric;

public class Krug {
	
	private double radius;
	
	Krug() {				// konstruktor bez parametara
		radius = 0.0;
	}
	
	Krug(double radius) {	// konstruktorima jedan parametar  **
		this.radius = radius;
	}
	
	Krug(Krug ob) {			// konstruktor ima objekat kao parametar   ***
		radius = ob.radius;   // ovde je postupak inicijalizacije polja (atributa) objekta klase   
	}
	
	public double area() {
		return 3.14 * radius * radius;
	}

}
