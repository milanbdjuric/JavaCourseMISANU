package tke;

public class InvalidAgeException extends Exception {
	
	private int age;
	
	InvalidAgeException(int a) {
		age = a;
	}
	
	public String toString() {
		return age + " is not a valid age.";
	}

}
