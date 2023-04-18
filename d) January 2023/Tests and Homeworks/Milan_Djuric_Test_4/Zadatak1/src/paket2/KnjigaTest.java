package paket2;

import paket1.*;

public class KnjigaTest {

	public static void main(String[] args) {
		
		Knjiga x = new Knjiga("Na Drini Cuprija", "Ivo Andric", "Roman pripoveda o gradjenju mosta...", 1100.0, true);
		
		System.out.println(x.toString());

	}

}
