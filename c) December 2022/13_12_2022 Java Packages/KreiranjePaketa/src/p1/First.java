package p1;

/* PACKAGES
 * Paketi sluze za grupisanje klasa - po nekom zajednickom svojstvu, recimo po funkcionalnosti, srodnosti.
 * 
 * Moguce jje napraviti dve klase sa istim imenom unutar 2 razlicita paketa.
 * 
 * Paket je istovremeno mehanizam za imenovanje i za upravljanje vidljivoscu klasa.
 * 
 * Paketi sadrze klase. Klase sadrze polja(fields) i metode(methods).
 * 
 * Metode sadrze lokalne promenljive. NEMA GLOBALNIH PROMENLJIVIH U JAVI
 */

public class First {
	
	public int a = 5;
	
	public void view() {
		System.out.println("Ovo je klasa definisana u paketu P1. ");
	}

}
