package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		OpisnaOcena<Integer, String> o1 = new OpisnaOcena<Integer, String>(1, "nedovoljan");
		OpisnaOcena<Integer, String> o2 = new OpisnaOcena<Integer, String>(2, "dovoljan");
		OpisnaOcena<Integer, String> o3 = new OpisnaOcena<Integer, String>(3, "dobar");
		OpisnaOcena<Integer, String> o4 = new OpisnaOcena<Integer, String>(4, "vrlo dobar");
		OpisnaOcena<Integer, String> o5 = new OpisnaOcena<Integer, String>(5, "odlican");
		
		o1.ispis();
		o2.ispis();
		o3.ispis();
		o4.ispis();
		o5.ispis();
	}
}
