package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		Kocka k[] = new Kocka[3];
		k[0] = new Kocka(25.5);
		k[1] = new Kocka(10.5);
		k[2] = new Kocka(5.0);
		
		for (int i = 0; i<k.length; i++) {
			System.out.println("K[" + i + "] P = " + k[i].izracunajPovrsinu() + " V = " + k[i].izracunajZapreminu());

			

		

		}
	}

}
