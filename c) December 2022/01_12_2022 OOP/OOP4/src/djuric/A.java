package djuric;

public class A {
	
	private String message;                                // vidi se samo unutar klase A kad je PRIVATE
	
	public void setMessage(String msg) {					// seterima posatavljamo vrednost, geterima vracamo
		
		message = msg;
	}
	
	public String getMessage() {
		
		return message;
	}
	

}
