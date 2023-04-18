package milan_djuric;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Zadatak_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite vrednost za n: ");
		int n = sc.nextInt();
		
		double x[] = new double[100];
		
		System.out.println("Unesite elemente niza x: ");
		
		for (int i=1; i<=n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextDouble();
		}
		double s1 = 0, s2 = 0;
		
		for (int i=1; i<=n; i++) {
			s1+=Math.pow(x[i], 2);
			s2+=x[i];
		}	
		double s = Math.sqrt(s1/n-Math.pow(s2/n, 2));
		
		System.out.println("s = " + df.format(s));
		sc.close();
	}
}
