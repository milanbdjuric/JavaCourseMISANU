import java.util.Scanner;

public class LogickiIzraz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za x: ");
		boolean x = input.nextBoolean();
		System.out.print("Unesite vrednost za y: ");
		boolean y = input.nextBoolean();
		boolean z = !(x & y) | x & y;
		System.out.println("y = " + z);
		
	}

}
