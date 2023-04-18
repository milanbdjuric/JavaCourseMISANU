package djuric;

public class Domina {
	
	private int a, b;
	
	Domina(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	public boolean ista(Domina x) {
		return a==x.a && b == x.b || b==x.a && a==x.b;
	}
	
	public void okreni() {
		int x = a;
		a = b;
		b = x;
	}

	public String toString() {
		return a + "-" + b;
	}
	public void ispis() {
		System.out.print(toString()+"\n");
	}
	

}
