package djuric;

public class Tacka {
	
	private double x, y;
	
	Tacka(){}
	
	Tacka(double x){
		this.x=x;
	}
	
	Tacka(double x, double y) {
		this.x=x;
		this.y=y;
	}
	
	public double rastojanjeOdKP() {
		return Math.sqrt(x*x+y*y);
	}
	
	public double rastojanjeIzmedju(Tacka a) {
		return Math.sqrt(Math.pow(a.x-x, 2)+Math.pow(a.y-y, 2));
	}
	
	
}