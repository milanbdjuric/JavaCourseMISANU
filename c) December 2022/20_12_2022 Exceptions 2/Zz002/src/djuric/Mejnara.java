package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(c1);
		
		System.out.println(c2.area());

	}

}
