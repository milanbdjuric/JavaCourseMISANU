package djuric;

public class Main {

	public static void main(String[] args) {
		
		int x = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {	
				x++;
			}
		}
		System.out.print("Postoji " + x + " brojeva deljivih sa 3 izmedju 1 i 20.");

	}
}