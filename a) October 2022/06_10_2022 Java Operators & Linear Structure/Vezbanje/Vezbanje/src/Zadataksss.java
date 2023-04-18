import java.util.Scanner;

public class Zadataksss {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi vrednost promenljive x: ");
		
		double x = input.nextDouble();
		
		double y = Math.sqrt((Math.exp(x / 2) + 1.2 * Math.sin(2 * x))) / 3.3 * Math.cos(x + 7.1 * Math.exp(x));
		
		System.out.println("Funkcija je: " + y);
		

	}

}
