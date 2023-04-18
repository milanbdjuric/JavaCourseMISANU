package djuric;

public class SeteriGeteri { 					// seter postavlja, geter vozvraca

	public static void main(String[] args) {
		
		A obj = new A();   //objekat klase
		
		obj.setMessage("VLJednost 1 ");  // postavlja vrednost
		
		System.out.println("Postavljena je vrednost: " + obj.getMessage() );  // vraca vrednost

	}

}
