package vfdfd;

public class Mejnara {

	public static void main(String[] args) {
		
		Kocka kocka[] = new Kocka[3];
		
		kocka[0] = new Kocka(25.5);
		kocka[1] = new Kocka(10.5);
		kocka[2] = new Kocka(5.0);
		
		for(int i = 0; i<kocka.length; i++) {
			System.out.println("Povrsina kocke " + i + " je " + kocka[i].izracunajPovrsinu());
			System.out.println("Zapremina kocke " + i + " je " + kocka[i].izracunajZapreminu());
		}
		

		

	}

}
