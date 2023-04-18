package milan.djuric;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner xyz = new Scanner(System.in);
		
		System.out.println("Unesite karakter: ");
		
		char a = xyz.next().charAt(0);
		
		if (a >= 'A' && a <= 'Z')
		{
			System.out.println("Karakter je veliko slovo.");
		}
		else if (a >= 'a' && a <= 'z')
		{
			System.out.println("Karakter je malo slovo.");
		}
		else if (a >= '0' && a <='9')
		{	
			System.out.println("Karakter je cifra.");
		}
		else
		{
			System.out.println("Karakter je specijalni znak.");
		}
		xyz.close();
	}

}
