import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Unestite logicku vrednost promenljive x: ");
		boolean x = input.nextBoolean();
		
		System.out.print("Unesite logicku vrednost promenljive y: ");
		boolean y = input.nextBoolean();
		
		boolean z = !(x || y) && !x || y;
		
		System.out.print("z = " + z);
		input.close();
		
	}

}
