package djuric;

import java.util.Scanner;

public class Pr12Mejnara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DirekcioniUgao tacka = new DirekcioniUgao();
		
		System.out.println("x1 = ");
		double x1 = sc.nextDouble();
		System.out.println("y1 = ");
		double y1 = sc.nextDouble();
		System.out.println("x2 = ");
		double x2 = sc.nextDouble();
		System.out.println("y2 = ");
		double y2 = sc.nextDouble();
		
		tacka.setX1(x1);
		tacka.setX2(x2);
		tacka.setY1(y1);
		tacka.setY2(y2);
		
		tacka.ispisUgao();
		tacka.ispisRastojanje();
		
		
	}

}
