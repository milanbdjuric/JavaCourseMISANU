package djuric;

import java.util.Scanner;

public class Main {
	
	static int F(int n) {
		if (n==0)
			return 0; // zadato F(0)
		else
			return F(n-1) * G(n-1) + 3*n - 1;		
	}
	static int G(int n) {
		if (n==0)
			return 0; // zadato G(0)
		else
			return n*n * F(n-1) + 2*G(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite vrednost za n koja mora biti prirodan broj: ");
		
		int n = sc.nextInt();
		
		System.out.println("F(" + n + ") = " + F(n));
		
		sc.close(); 
	}
}