package djuric;

public class Main {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 100; x++) {
			 if (x % 2 == 0) {
				System.out.println(x);
			}
		}  

		// drugi nacin
		
		for (int x = 2; x <= 100; x+=2) {
				System.out.println(x);
			}
		

	}
}
