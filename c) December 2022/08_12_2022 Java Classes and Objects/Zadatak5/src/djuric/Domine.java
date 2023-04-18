package djuric;

public class Domine {
	
	private int a, b;
	
	Domine(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public Domine okreni() {
		int x = a;
		a = b;
		b = x;
		return this;
	}
	
	public boolean ista(Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b;
	}
	
	public String tekstualniOpis() {
		return "(" + a + ", " + b + ")";
	}
	

	
}
