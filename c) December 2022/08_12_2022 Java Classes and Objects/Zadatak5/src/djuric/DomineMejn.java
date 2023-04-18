package djuric;

public class DomineMejn {

	public static void main(String[] args) {
		
/*		Domine d1 = new Domine(2, 4);
		Domine d2 = new Domine(3, 4);
		
		System.out.println(d1.ista(d2));    // dalsu iste
		System.out.println(d1.okreni());
		System.out.println(d1.tekstualniOpis());
		System.out.println(d2.tekstualniOpis());
*/
		
		
		Domine d1= new Domine(3,5); 
		Domine d2= new Domine (2, 6); 
		
		System.out.println(d1.ista	(d2)); //
		System.out.println(d1.okreni()); 
		System.out.println(d1.tekstualniOpis()); 
		System.out.println(d2.tekstualniOpis()); 
		System.out.println(d1.tekstualniOpis()); 
	}

}
