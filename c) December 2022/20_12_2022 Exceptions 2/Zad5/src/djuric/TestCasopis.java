package djuric;

import java.util.Scanner;

public class TestCasopis {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Casopis x = new Casopis();
		
		System.out.print("NASLOV: ");
		String naslov = sc.nextLine();
		System.out.print("IZDAVAC: ");
		String izdavac = sc.nextLine();
		System.out.print("BROJ CASOPISA: ");
		int brojCasopisa = sc.nextInt();
		System.out.print("CENA: ");
		double cena = sc.nextDouble();
		
		try {
			x.setBrojCasopisa(brojCasopisa);
			x.setCena(cena);
			x.setIzdavac(izdavac);
			x.setNaslov(naslov);
			
			System.out.println(x.toString());
			
		} catch(CasopisException y) {
			System.out.println(y.getMessage());
		}
		
		
		
		
		
		

	}

}
