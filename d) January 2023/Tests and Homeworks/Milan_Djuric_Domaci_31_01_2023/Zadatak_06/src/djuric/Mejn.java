package djuric;

import java.util.*;

public class Mejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Integer> x = new LinkedList<Integer>();  // kreiramo linkedlist (da bi mogli da dodajemo 0 ili 1 na pocetak niza)
		
		System.out.println("Unesite dekadni broj: ");
		int n = sc.nextInt();
		
		if(n==0)
			System.out.print(n);		// 0 se isto pise i u dekadnom i u binarnom sistemu
		
		while(n>0) {
			if(n%2==0)
				x.addFirst(0);		// ako je broj dati deljiv sa dva - pise se nula, ali kao poslednja cifra binarnog broja - zato svaki naredni krug petlje dodajemo 0 ili 1 na pocetak
			else
				x.addFirst(1);		// ako nije deljiv onda se pise 1, takodje kao poslednja  
			n/=2;					// broj se deli sa dva (bez ostatka) i sve ponovo, zakljucno sa 1
		}
		
		System.out.println("Binarni broj je: ");
		
		for(int y : x) {
			System.out.print(y);		// ispis
		}
		
		sc.close();
		

		


	}

}
