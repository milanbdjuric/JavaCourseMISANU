package djuric;

public class BoxPrikaz {

	public static void main(String[] args) {
		
		double zapremina;
		
		Box b1 = new Box();
		
		b1.sirina = 10;
		b1.visina = 15;
		b1.dubina = 20;
		
		zapremina = b1.sirina * b1.visina * b1.dubina;
		
		System.out.println("Zapremina kutije je: " + zapremina);
		

	}

}
