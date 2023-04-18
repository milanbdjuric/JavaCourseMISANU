package djuric;

public class Mejnara {
	
	public static void calcArea(Circle x) {
		System.out.println(x.area());
	}
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle(20);
		
		calcArea(c1);

	}

}
