import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko je a?");
		double a = input.nextDouble();
		System.out.println("Koliko je b?");
		double b = input.nextDouble();
		System.out.println("y = " + ((1 - Math.min(a, b)) / (1 + Math.max(a, b))));
		

	}

}
