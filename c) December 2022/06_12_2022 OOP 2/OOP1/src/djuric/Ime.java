package djuric;

import java.util.Scanner;

public class Ime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cat macka = new Cat();
		
		System.out.println("Unesite ime macke: ");
		macka.ime = sc.nextLine();
		
		macka.prikazatiIme();
		
	}

}
