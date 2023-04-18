package djuric;

import java.util.Scanner;

public class PapigaMejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Papagaj Kica = new Papagaj();
		Papagaj Kaca = new Papagaj();
		
		System.out.println("Kako se zove? ");
		String name = sc.next();
		System.out.println("Koliko ima godina? ");
		int god = sc.nextInt();
		
		Kica.setGodine(god);
		Kica.setIme(name);
		
		System.out.println("Kako se zove? ");
		name = sc.next();
		System.out.println("Koliko ima godina? ");
		god = sc.nextInt();
		
		Kaca.setIme(name);
		Kaca.setGodine(god);
		
		
		
		Kica.printung();
		Kaca.printung();

	}

}
