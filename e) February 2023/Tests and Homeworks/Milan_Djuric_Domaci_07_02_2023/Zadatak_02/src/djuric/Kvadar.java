package djuric;

import java.io.*;

public class Kvadar extends Predmet{							// klasa Kvadar nasledjuje klasu Predmet

	private double ivica1, ivica2, ivica3;						// deklarisemo ivice kvadra
	
	public Kvadar() {}											// podrazumevani konstruktor

	public double zapremina() {									// metoda koja vraca izracunatu zapreminu kvadra
		return ivica1 * ivica2 * ivica3;
	}
	
	public double tezina() {									// metoda koja vraca izracunatu tezinu kvadra
		return zapremina() * getSpecTezina();
	}
	
	public void unos() throws Exception, Exception {								// metoda kojom vrsimo unos
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite duzinu stranice a: ");		
		this.ivica1 = Double.parseDouble(br.readLine());
		System.out.print("Unesite duzinu stranice b: ");
		this.ivica2 = Double.parseDouble(br.readLine());
		System.out.print("Unesite duzinu stranice c: ");
		this.ivica3 = Double.parseDouble(br.readLine());
		System.out.print("Unesite specificnu tezinu: ");
		this.specTezina = Double.parseDouble(br.readLine());
	}

	public String toString() {									// opis predmeta u stringu
		return "Tip predmeta: kvadar, a = " + ivica1 + ", b = " + ivica2 +
				", c = " + ivica3 + ", zapremina: " + zapremina() + ", tezina: " + tezina();
	}
	
}
