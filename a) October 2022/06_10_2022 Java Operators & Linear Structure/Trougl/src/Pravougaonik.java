import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

			
		System.out.println("Unesite stranicu a: ");
		double a = input.nextDouble();
		
		System.out.println("Unesite stranicu b: ");
		double b = input.nextDouble();
		
		double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Duzina djagonale je: " + d);
		
	}

}
