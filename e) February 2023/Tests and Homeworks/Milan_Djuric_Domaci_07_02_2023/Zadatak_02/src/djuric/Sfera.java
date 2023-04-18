package djuric;

import java.io.*;

public class Sfera extends Predmet{							// klasa Sfera nasledjuje klasu Predmet

	private double poluprecnik;								// deklarisemo poluprecnik
	
	Sfera(){}												// podrazumevani konstruktor
	
	public double zapremina() {								// metoda za izracunavanje zapremine lopte
		return 4/3*Math.pow(poluprecnik, 3)*Math.PI;
	}
	
	public double tezina() {								// metoda koja vraca izracunatu tezinu sfere
		return zapremina() * getSpecTezina();
	}
	
	public void unos() throws Exception {											// metoda kojom vrsimo unos
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite duzinu poluprecnika: ");		
		this.poluprecnik = Double.parseDouble(br.readLine());
		System.out.print("Unesite specificnu tezinu: ");
		this.specTezina = Double.parseDouble(br.readLine());
	}
	
	public String toString() {								// opis predmeta u stringu
		return "Tip predmeta: sfera, poluprecnik: " + poluprecnik +
				", zapremina: " + zapremina() + ", tezina: " + tezina();
	}
	


}
