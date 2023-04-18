package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		// Prilikom pokretanja Java programa jedna programska nit odmah pocinje da se izvrsava.
		// To je glavna ili inicijalna nit.
		
		// upravljanje glavnom niti se radi preko objekta tipa Thread, pozivom metode currentThread() klase Thread.
		
		Thread t = Thread.currentThread();
		Thread s = Thread.currentThread();

		
		System.out.println("Trenutna nit: " + t + s);
		
		// [ime niti, prioritet, ime grupe kojoj pripada nit]
		// podrazumevano ime glavne niti je main. Njen prioritet je 5, sto je takodje podrazumevana vrednost.
		// (treci parametar) main je ime grupe niti kojoj ta nit pripada.
		// grupa niti je struktura podataka koja upravlja stanjem kolekcije niti kao celinom.
		
		
		// getName() - vraca ime niti
		
		System.out.println("Naziv niti: " + Thread.currentThread().getName());
		
		// getPriority() - vraca prioritet niti
		
		System.out.println("Prioritet niti: " + Thread.currentThread().getPriority());

	}

}
