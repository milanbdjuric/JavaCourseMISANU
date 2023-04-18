import java.util.Scanner;

public class GalonULitre {

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Unesi zapreminu u galonima");
			double g = input.nextDouble();
			
			System.out.println("Zapremina u litrima je: " + (g * 4.54));
		}
		
		


	}

}
