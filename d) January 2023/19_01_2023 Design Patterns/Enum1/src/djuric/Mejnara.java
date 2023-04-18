package djuric;

/* Nabrajanje (enumeracija) je lista imenovanih vrednosti
 * koje definisu nov tip podataka i njegove dozvoljene vrednosti.
 * To znaci da nabrajanje moze da sadrzi samo neku od vrednosti koje su navedene na listi.
 * Druge vrednosti nisu dozvoljene.
 * 
 */

public class Mejnara {

	public static void main(String[] args) {
		
		Boje b;  // uvodi se kao int a, kao prosti tip, ne kao objekat
		
		b = Boje.Crvena;  // kao a = 5 (moze samo iz enuma)
		
		System.out.println("Boja: " + b);
		
		b = Boje.Plava;
		
		if(b == Boje.Plava)
			System.out.println("Plava");
		
		switch(b) {
		case Crvena:
			System.out.println("Crvena.");
			break;
		case Zelena:
			System.out.println("Zelena.");
			break;
		case Plava:
			System.out.println("Plava.");
			break;
		case Crna:
			System.out.println("Crna.");
			break;
		case Bela:
			System.out.println("Bela");
			break;
		case Narandzasta:
			System.out.println("Narandzasta.");
			break;
		case Zuta:
			System.out.println("Zuta.");
			break;
		}


	}

}
