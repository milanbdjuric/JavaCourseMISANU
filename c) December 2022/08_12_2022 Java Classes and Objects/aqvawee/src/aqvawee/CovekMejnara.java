package aqvawee;

import java.util.Scanner;

public class CovekMejnara {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Covek x = new Covek();
		
		System.out.print("Ime i prezime: ");
		String ime = sc.nextLine();
		x.setIme(ime);
		System.out.print("Datum rodjenja: ");
		String datum = sc.nextLine();
		x.setDatum(datum);
		System.out.print("Adresa prebivalista: ");
		String adresa = sc.nextLine();
		x.setAdresa(adresa);
		
		System.out.println(x.ispis());

	}

}
