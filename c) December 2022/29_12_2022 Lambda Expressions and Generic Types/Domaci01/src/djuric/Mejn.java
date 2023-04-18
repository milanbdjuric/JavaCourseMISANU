package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		GenerickaKlasa<String, Integer> ob = new GenerickaKlasa<String, Integer>("DOBRLJDAN", 1389);
		

		
		System.out.println(ob.getClass().getName().isBlank());
	}

}
