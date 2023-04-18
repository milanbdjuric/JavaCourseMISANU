package djuric;

public class ProsledjivanjeObjektaMetodi {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(20);					// pravimo objekat (instancu ) klase
		
		Circle c2 = new Circle(30);
		
		calcArea(c1);					// poziv konkretno za objekat c1
		
		calcArea(c2);
	}
	
	
	
	
	public static void calcArea(Circle asd) {							// opsta metoda, radi i za druge klase/obj. u izvrsenju poziva metodu za izracunavanje povrs.
		System.out.println("Povrsina kruga: " + asd.area());
	}

}
