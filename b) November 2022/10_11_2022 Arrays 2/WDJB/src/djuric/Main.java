package djuric;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi broj kuca u ulici: ");
		int n = sc.nextInt();
		
		int broj;
		int par[] = new int[100];
		int nepar[] = new int[100];
		int PRbrojac = 1;
		int NPRbrojac = 1;
		
		System.out.println("Unesi brojeve kuca: ");
		for (int i=1; i<=n; i++) {
			broj = sc.nextInt();
			
			if (broj%2==0) {
				par[PRbrojac++] = broj;
	
			}
			else {
				nepar[NPRbrojac++] = broj;
			}
			
			
		}
		System.out.println("parni: ");
		
		for (int i=1; i<PRbrojac; i++) {
			System.out.print(par[i] + " ");
		}
		System.out.println("\nneparni: ");
		for (int i=1; i<NPRbrojac; i++) {
			System.out.print(nepar[i] + " ");
		}

	}
}



