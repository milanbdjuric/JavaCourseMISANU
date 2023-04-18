package djuric;

public class KrugMejn {

	public static void main(String[] args) {
		
		Krug c1 = new Krug( 10 ); // ** koristi se drugi konstruktor iz klase krug
		
		Krug c2 = new Krug( c1 ); // c1 je objekat koji je vec kreiran u prethodnom koraku, preko treceg konstruktora 
		
		System.out.println("Povrsina kruga: " + c2.area());

	}

}
