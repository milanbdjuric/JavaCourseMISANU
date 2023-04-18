package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		ProveraBroja jbro = (x) -> (x<0);
		
		if(jbro.broj(-3)) {
			System.out.println("Negativan. ");
		}
		else
			System.out.println("Pozitivan.");


	}

}
