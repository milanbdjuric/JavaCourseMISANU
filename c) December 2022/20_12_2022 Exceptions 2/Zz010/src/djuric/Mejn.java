package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		Matrica m1 = new Matrica(5, 5);
		System.out.println(m1.getVrsta());
		System.out.println(m1.getKolona());
		
		m1.postaviElement(1, 2, 3);
		System.out.println(m1.dohvatiElement(1, 2));
		
		m1.ispis();
		
		
	}

}
