package zad;

import java.util.Scanner;

public class KnigaMejn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Knjiga obj = new Knjiga(); 
		
		System.out.println("Unesite ime knjige"); 
		String unetoIme = sc.nextLine(); 
		
		System.out.println("Unsite broj stranica"); 
		int unetBr = sc.nextInt(); 
		
		obj.setime(unetoIme); 
		obj.setbrojStranica(unetBr); 
		
		obj.imeIBroj(); 
		
		sc.close(); 
		} 
	}
