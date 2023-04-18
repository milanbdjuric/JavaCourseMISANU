package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite kapacitet 1. kondenzatora: ");
		double C1 = sc.nextDouble();
		System.out.println("Unesite kapacitet 2. kondenzatora: ");
		double C2 = sc.nextDouble();
		System.out.println("Unesite 'a' ako su vezani redno, ili 'b' ako su vezani paralelno: ");
		char slovo = sc.next().charAt(0);
		
/*		
		switch(slovo) {
		case 'a': {
			System.out.println("Ekvivalentni kapacitet radne veze je: " + (C1*C2/(C1+C2)));
			break;
		}
		case 'b': {
			System.out.println("Ekvivalentni kapacitet radne veze je: " + (C1 + C2));
			break;
		}
		default:
			System.out.println("Ili a - ili b, rekli smo.");
		}
*/		
		
		if (slovo == 'a') {
			System.out.println("Ekvivalentni kapacitet radne veze je: " + (C1*C2/(C1+C2)));
		}
		else if (slovo == 'b') {
			System.out.println("Ekvivalentni kapacitet radne veze je: " + (C1 + C2));
		}
		else {
			System.out.println("Ili a - ili b, rekli smo.");
		}
			
		sc.close();
	}

}
