import java.util.Scanner;

public class KBuB {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);
		
		System.out.println("Unesite velicinu u kb: ");
		
		double tc = input.nextDouble();
		
		System.out.println("Velicina u b je: " + (tc * 1024));
		input.close();

	}

}
