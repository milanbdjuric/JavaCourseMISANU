import java.util.Scanner;

public class CelzijusUFarenhajt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Unesi temp u C: ");
		
		double tc = input.nextDouble();
		
		System.out.println("Temp u F je: " + (tc * 1.8 + 32));
		

	}

}
