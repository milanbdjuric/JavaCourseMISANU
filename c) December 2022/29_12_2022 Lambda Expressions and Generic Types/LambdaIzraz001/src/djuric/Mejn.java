package djuric;

public class Mejn {

	public static void main(String[] args) {
				
	// levaStranaLambdaIzraza(PARAMETRI, AKO IH IMA) -> desnaStranaLambdaIzraza(TELO, ko metoda)
		
	//	() -> 123.45
	// isto sto i
	//	double nekaMetoda() {return 123.45; }
		
		TestiraBroj paranBroj = (a) -> (a % 2) == 0;     // metoda bez imena! (paranBroj je promenljiva)
		
		if (paranBroj.test(2)) {
			System.out.println("Broj je paran. ");
		}
		else
			System.out.println("Broj nije paran.");
		
	}

}
