import java.util.Scanner;

public class Pravougaonik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi stranicu 1. pravougaonika: ");
		int a = input.nextInt();
		System.out.println("Unesi stranicu 1. pravougaonika: ");
		int b = input.nextInt();
		System.out.println("Unesi stranicu 2. pravougaonika: ");
		int c = input.nextInt();
		System.out.println("Unesi stranicu 2. pravougaonika: ");
		int d = input.nextInt();
		
		boolean p = ((a < c) && (b > d) || ((a < d) & (b < c)));
		System.out.println("p= " + p);
	}

}
