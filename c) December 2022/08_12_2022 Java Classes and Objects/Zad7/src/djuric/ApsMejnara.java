package djuric;

import java.util.Scanner;

public class ApsMejnara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aps x = new Aps();
		
		System.out.print("Unesite broj: ");
		double y = sc.nextDouble();
		
		x.setBroj(y);
		
		x.stampaj();
		
	}

}
