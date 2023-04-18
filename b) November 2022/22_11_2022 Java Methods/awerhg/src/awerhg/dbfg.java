package awerhg;

import java.util.Scanner;
import java.text.DecimalFormat;

public class dbfg {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko kuca treba da obidje postar? ");
		int n = sc.nextInt();
		
		int brPar = 0, brNepar = 0;
		
		int par[] = new int[100];
		int nepar[] = new int[100];
		
		for (int i = 1; i<=n; i++) {
			System.out.print("Unesite broj kuce: ");
			int broj = sc.nextInt();
			if (broj%2==0)
				par[brPar++] = broj;
			else
				nepar[brNepar++] = broj;
		}
		System.out.println("Parni brojevi kuca: ");
		for (int i = 0; i<brPar; i++) {
			System.out.print(par[i] + " ");

		
	}
}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
