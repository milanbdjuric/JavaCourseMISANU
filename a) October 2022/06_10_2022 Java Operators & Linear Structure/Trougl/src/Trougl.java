import java.util.Scanner;

public class Trougl {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesi stranice trougla a, b, c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double O = a + b + c;
		
		System.out.println("Obim trougla je " + O);
		
		double s = O / 2;
		double P = Math.sqrt(s * (s - 1) * (s - b) * (s - c));
		
		
		

	}

}
