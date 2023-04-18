package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		Pas p = new Pas();
		
		System.out.println("\nKlasa pas: ");
		p.lajati();
		
		System.out.println("\nKlasa zlatni retriver: ");
		ZlatniRetriver zr = new ZlatniRetriver();
		zr.lajati();
		zr.aportiraj();
		
		System.out.println("\nKlasa macka: ");
		Macka m = new Macka();
		m.mjaukati();

	}

}
