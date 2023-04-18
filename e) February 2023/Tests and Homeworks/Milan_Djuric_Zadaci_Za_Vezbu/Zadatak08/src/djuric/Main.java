package djuric;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		
		double x[] = new double[100];
		double f[] = new double[100];
		
		System.out.print("Unesite vrednost za n: ");
		int n = sc.nextInt();
		
		System.out.println("Unesite vrednosti za niz x[k]: ");
		for (int k = 0; k<=n; k++) {
			System.out.print("x[" + k + "] = ");
			x[k] = sc.nextDouble();
		}
		
		System.out.println("Unesite vrednosti za niz f[k]: ");
		for (int k = 0; k<=n; k++) { 
			System.out.print("f[" + k + "] = ");
			f[k] = sc.nextDouble();
		}
		
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0, s5 = 0;
		
		for (int i = 1; i<=n; i++) {
			s1 += Math.log(x[i]);
			s2 += Math.log(f[i]);
			s3 += Math.log(x[i])*Math.log(f[i]);
			s4 += Math.pow(Math.log(x[i]), 2);
			s5 += Math.log(Math.pow(x[i], 2));
		}

		double b1 = (s1*s2 - n*s3) / (s4 - n*s5);
		
		double b0 = s2 - b1*s5 / n;
		
		System.out.println("X\tY(X)");
		
		for (int k = 0; k<=n; k++) {
			double y = Math.log(b0)*Math.pow(x[k], b1);
			System.out.println(x[k] + "\t" + df.format(y));
		}
		sc.close();
	}
}
