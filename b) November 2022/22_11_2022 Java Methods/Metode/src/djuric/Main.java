package djuric;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi n: ");
		int n = sc.nextInt();
		System.out.println("Unesi x: ");
		double x= sc.nextDouble();
		double a[] = new double[100];
		System.out.println("Unesi clanove niza x: ");
		for (int i=1; i<=n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = sc.nextDouble();
		}
		double V = x;
		for (int i = n; i>=2; i--) {
			V = x + a[i]/V;
		}
		V = a[1]/V;
		System.out.println(V);
		
		
		


	}

}
