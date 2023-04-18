package tke;

public class finallyBlockWithException {
	
	static void procA() {
		
		try {
			System.out.println("inside procA");
			
			throw new RuntimeException("demo");		// ovde mi bacamo izuzetak	
													// throws je u zaglavlju metode, a throw se koristi za bacanje izuzetka u telu metode
		} finally {	
														// finally blok se izvrsava bez obzira da li je ili nije doslo do izuzetka
			System.out.println("procA finally");
		}
	}
	
	static void procB() {
		try {
			System.out.println("inside procB");
			return; 			// break, continue, System.exit(0) - kako god da izidjemo odavle finally mora da se izvede na kraju
			
		} finally {
			System.out.println("procB`s finally");
		}
	}
	
	static void procC() {
		try {
			System.out.println("inside procC");

	
		} finally {
			System.out.println("procC`s finally");
		}
	}

}
