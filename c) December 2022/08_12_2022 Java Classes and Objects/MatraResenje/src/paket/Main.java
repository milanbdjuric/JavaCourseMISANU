package paket;

public class Main {

	public static void main(String[] args) {
		
		Matrica m1 = new Matrica(2, 3);
		
		System.out.println("Matrica ima " + m1.vrs() + " vrste i " + m1.kol() + " kolone.");
		
		System.out.println(m1.postavi(1, 2, 3));
		
		System.out.println("Vrednost: " + m1.dohvati(1, 2));
		
		System.out.println(m1.toString());

	}

}
