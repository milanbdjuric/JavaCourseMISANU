package djuric;

import java.util.Scanner;

public class AutoMejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Auto kola = new Auto();
		
		System.out.println("Unesite ime kola: ");
		String imeKola = sc.nextLine();
		
		System.out.println("Unesite godiste kola: ");
		int godisteKola = sc.nextInt();
		
		kola.setGodiste(godisteKola);
		kola.setIme(imeKola);
		
		kola.ispis();
		


	}

}
