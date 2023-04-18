package djuric;

import java.util.Scanner;

public class TestTelefonskiRacun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesi broj telefona: ");
		String brojTelefona = sc.nextLine();
		
		System.out.println("Unesi ime vlasnika: ");
		String vlasnik = sc.nextLine();
		
		System.out.println("Kolko taj duguje? ");
		double dugovanje = sc.nextDouble();
		
		TelRacun x = new TelRacun();
		
		try {
			x.setBrojTelefona(brojTelefona);
			x.setDugovanje(dugovanje);
			x.setVlasnik(vlasnik);
			
			System.out.println(x.toString());
			
		} catch (IzuzetakTelRacun z) {
			System.out.println("Greska: " + z.getMessage());
		}

	}

}
