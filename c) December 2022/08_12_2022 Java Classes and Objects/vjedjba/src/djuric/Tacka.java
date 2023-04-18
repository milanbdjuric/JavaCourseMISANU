package djuric;

public class Tacka {
	
	private double x, y;
	
	Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public String ispis() {
		return "(" + x + ", " + y + ")";
	}

}
