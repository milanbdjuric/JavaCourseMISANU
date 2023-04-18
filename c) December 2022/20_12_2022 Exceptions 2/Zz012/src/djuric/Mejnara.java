package djuric;

import java.util.Scanner;

public class Mejnara {

	public static void main(String[] args) {
		
		ApsolutnaVrednost a = new ApsolutnaVrednost();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj: ");
		a.setBroj(sc.nextDouble());
		
		System.out.println("Apsolutna vrednost broja " + a.getBroj() + " je " + a.prikazatiApsVrednost());

	}

}
