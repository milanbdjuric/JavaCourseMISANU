package djuric;

public class ObjekatKlasePrimer {

	public static void main(String[] args) {
		
		//nazivKlase nazivObjekta = new NazivKlaze();
		
		A objekat = new A(); 
		A obj = new A();
		
		// kreiranje novog objekta(instance) klase A.
		// svaki objekat predstavlja instancu odredjene klase, kreiran tokom izvrsavanja
		// i sastavljen je od odredjenog broja polja
		
		//metode klase se pozivaju pomocu operatora tacka ( . )
		// nazivObjekta.nazivMetode();
		
		objekat.PrikaziPoruku();
		obj.PrikaziPoruku();
		
	}

}
