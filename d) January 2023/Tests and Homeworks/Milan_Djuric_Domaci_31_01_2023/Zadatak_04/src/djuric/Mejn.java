package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		int niz[] = {1, 35, 32, 42, 51, 66, 73, 8, 945, 160, 4511, 4612, 18763}; // unosimo nekakav niz
		
		int par = 0, nepar = 0; // iniciramo brojace na 0
		
		for(int x : niz) { //idemo kroz niz for-each petljom
			if (x%2==0) 
				par++; // ako je deljivo sa 2 onda je par
			else
				nepar++; // ako ne onda je nepar
		}	
		System.out.println("Parnih brojava u nizu ima " + par + ", a neparnih " + nepar + ".");
	}
}
