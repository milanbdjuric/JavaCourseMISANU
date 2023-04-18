package djuric;

public class Mejnarica {

	public static void main(String[] args) {
		
		A<Integer, String> objekat1 = new A<Integer, String>(100, "Sto");
		
		objekat1.prikaziTip();
		
		int intVrednost = objekat1.getObj1();
		System.out.println("Vrednost: " + intVrednost);
		
		String strVrednost = objekat1.getObj2();
		System.out.println("Vrednost: " + strVrednost);
		
		A<String, Double> objekat2 = new A<String, Double>("Java", 2.5);
		objekat2.prikaziTip();
		System.out.println("Vrednost: " + objekat2.getObj1());
		System.out.println("Vrednost: " + objekat2.getObj2());		
		
		A<Boolean, Integer> objekat3 = new A<Boolean, Integer>(true, 101);
		objekat3.prikaziTip();
		System.out.println("Vrednost: " + objekat3.getObj1());
		System.out.println("Vrednost: " + objekat3.getObj2());
	}
}
