package djuric;

public class OpisnaOcena<A, B> {
	
	A objekat1;
	B objekat2;
	
	OpisnaOcena(A obj1, B obj2){
		this.objekat1 = obj1;
		this.objekat2 = obj2;
	}	
	public void ispis() {
		System.out.println(objekat1 + ", " + objekat2);
	}
}
