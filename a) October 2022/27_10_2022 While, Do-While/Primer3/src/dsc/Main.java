package dsc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, k, n, suma = 0; 

		
		System.out.println("Unesite k: ");
		k = sc.nextInt();
		System.out.println("Unesite n: ");
		n = sc.nextInt();
		
		i = k;
		while (i <= n) 
			suma += i++;
		System.out.println(suma);	
			
		

		
		
		
		
		
		
		
		
	}

}
