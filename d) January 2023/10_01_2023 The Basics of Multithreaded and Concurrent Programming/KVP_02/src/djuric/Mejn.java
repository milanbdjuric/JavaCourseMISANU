package djuric;

// Pokretanje nove niti
// Novu nit pokrecemo tako sto napravimo instancu objekta tipa Thread **
// To se moze uraditi na 2 nacina: 
// 1. Implementacijom interfejsa Runnable	*prvo cemo ovako
// 2. Prosirivanjem klase Thread


// U main klasi:
// Nakon kreiranja klase koja implementira interfejs Runnable potrebno je napraviti instancu objekta tipa Thread***

public class Mejn {

	public static void main(String[] args) {
		
		A a = new A();   // **
		
		// ***
		// Oblik konstruktora:
		// Thread(Runnable objekatNit, String imeNiti)
			// objekatNit je instanca klase koja implementira interfejs Runnable
			// Definise mesto gde zapocinje nit
				// imeNiti predstavlja ime nove niti (koje mi zadajemo)
		
		Thread t1 = new Thread(a, "Nit1");
		Thread t2 = new Thread(a, "Nit2");
		Thread t3 = new Thread(a, "Nit3");
		
		t1.start(); // metoda start() poziva metodu run() -- run kaze sta ce se izvrsavati a start kada ce se izvrsavati
		t2.start();
		t3.start();

		
		

	}

}
