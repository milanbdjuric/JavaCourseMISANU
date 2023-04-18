package djuric;

public class Circle {
	
	private double poluprecnik;
	
	Circle() {											// ovo je konstruktor! zove se kao klasa, poziva se samo prilikom kreiranja objekta, da inicijalizuje podatke
		poluprecnik = 10.0;
	}
	
														//poluprecnik ima vrednost 10.0 koja je postavljenja u konstruktoru prilikom kreiranja objekta
	
	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}

}
