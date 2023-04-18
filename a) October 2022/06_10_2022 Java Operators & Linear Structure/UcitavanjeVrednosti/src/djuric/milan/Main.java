package djuric.milan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ucitavanje (i smestanje) unete vrednosti sa konzole
		
		// ugradjena klasa Scanner omogucava da se unesu vrednosti
		
		Scanner ajmo = new Scanner(System.in);
		
		System.out.println("Kako se zovete? ");
		String ime = ajmo.nextLine();
		System.out.println("Zovete se: " + ime);
		
		
		System.out.println("Koliko imate godina? ");
		int brojGodina = ajmo.nextInt();
		System.out.println("Imate godina: " + brojGodina);
		
		
		
		// deklaracija stringova
		
		// "sdfasdfawef98435yncvioec"
		
		String pime; // deklaracija stringa
		String vime = "Milan"; // inicijalizacija stringa
		System.out.println(vime); // ispisivanje vrednosti stringa
		
		
		
		
		

	}

}
