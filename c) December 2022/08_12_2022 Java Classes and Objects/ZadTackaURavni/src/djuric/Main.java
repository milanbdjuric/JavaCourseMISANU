package djuric;

public class Main {

	public static void main(String[] args) {
		
		Tacka t1 = new Tacka();     //0,0
		Tacka t3 = new Tacka(2, 2);
		
		System.out.println("Rastojanje od koordinatnog pocetka tacke t1: " + t1.RastojanjeOdKP());
		System.out.println("Rastojanje od koordinatnog pocetka tacke t3: " + t3.RastojanjeOdKP()); 
		System.out.println(); System.out.println("Rastojanje tacke t3 od tacke t1: " + t3.RastojanjeOdKP()); }
		
		
		

	}


