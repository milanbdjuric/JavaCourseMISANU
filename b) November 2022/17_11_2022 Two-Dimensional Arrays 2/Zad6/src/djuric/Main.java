package djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za x: ");
		double x = sc.nextDouble();
		
		double p[] = new double[100];
		
		p[0] = 1;
		p[1] = x;
		
		for (int n = 1; n<10; n++) {
			p[n+1] = ((2*n+1)*p[n])/(n+1)-(n*p[n-1]/(n+1));
		}
		for (int n=0; n<10; n++) {
			System.out.println("p(" + n + ") = " + p[n]);
		}
		


		
	}
		
	}

