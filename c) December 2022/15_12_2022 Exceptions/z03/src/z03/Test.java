package z03;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IzuzetakArtikal {
		
		Scanner sc = new Scanner(System.in);
		
		Artikal a = new Artikal();
		try {
			System.out.print("NAZIF: ");
			a.setNaziv(sc.nextLine());
			System.out.print("MARKE: ");
			a.setProizvodjac(sc.nextLine());
			System.out.print("BARKODI: ");
			a.setBarkod(sc.nextLine());
			System.out.print("CINA: ");
			a.setCena(sc.nextDouble());
			
			
			System.out.println(a.toString());
		}catch(IzuzetakArtikal e) {
			System.out.println(e.getMessage());
		}

	}

}
