package djuric;

import java.util.Scanner;

public class MatricaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int vrsta = 2, kolona = 3;
		
		double matra[][] = new double[vrsta][kolona];
		
		Matrica x = new Matrica(vrsta, kolona);
		
		for (int i = 0; i<vrsta; i++) {
			for (int j=0; j<kolona; j++) {
				System.out.print("x[" + i + "," + j + "] = ");
				matra[i][j] = sc.nextDouble();
				x.setElement(matra);
			}
		}
		for (int i = 0; i<vrsta; i++) {
			for (int j = 0; j<kolona; j++) {
			  x.ispis();
			}
			System.out.println();
		}
	}
}
