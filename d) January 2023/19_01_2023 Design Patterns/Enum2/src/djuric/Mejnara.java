package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
/*Sva nabrajanja imaju 2 unapred definisane metode:
 * values() - vraca niz koji sardzi listu konstanti definisanih u nabrajanju
 * valuesOf() - vraca konstantu iz nabrajanja cija vrednost odgovara znakovnom nizu prosledjenom u argumentu
 */

		
		System.out.print("BOJE: ");
		
		Boja nizBoja[] = Boja.values();
		
		for(Boja c : nizBoja) {
			System.out.print(c + " ");
		}
		
		Boja c1;
		c1 = Boja.valueOf("Bela");  // vraca vrednost iz enuma koja odgovara imenu zadate konstante
		
		System.out.println("\nBOJA: " + c1);
		
		
	}

}
