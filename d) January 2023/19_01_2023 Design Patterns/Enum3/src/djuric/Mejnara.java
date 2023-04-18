package djuric;

/*Nabrajanje JE neka VRSTA KLASE. Instanca klase ne pravi se pomocu kljucne reci new.
 * Rezervisana rec enum definise klasu.
 * Svaka konstanta definisana u nabrajanju je objekat ciji tip je to isto nabrajanje.
*/
public class Mejnara {

	public static void main(String[] args) {
		
		System.out.println("Udeo zelene boje: " + Boja.Zelena.getUdeo());
		
		System.out.println("Sve boje: ");
		
		for(Boja x : Boja.values()) {
			System.out.println(x + " " + x.getUdeo());
		}
		
		
	}

}
