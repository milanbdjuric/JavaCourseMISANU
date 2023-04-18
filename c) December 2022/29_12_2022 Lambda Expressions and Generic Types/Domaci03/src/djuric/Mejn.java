package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		Random number = (n) -> {
			n = Math.random();
			return n;
		}; 
		System.out.println("Nasumice izabrani broj je: " + number.broj(1));	
	}
}
