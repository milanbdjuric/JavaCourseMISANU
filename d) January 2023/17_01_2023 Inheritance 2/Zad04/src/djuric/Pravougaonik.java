package djuric;

public class Pravougaonik extends Figura{

	Pravougaonik(double xRef, double yRef) {
		super(xRef, yRef);
	}
	public double obim() {
		return xRef*2 + yRef*2;
	}
	public double povrsina() {
		return xRef*yRef;	
	}
}
