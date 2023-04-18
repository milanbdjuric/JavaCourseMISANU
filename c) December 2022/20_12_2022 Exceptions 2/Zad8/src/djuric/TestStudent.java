package djuric;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ime i prezime: ");
		String imePrezime = sc.nextLine();
		
		System.out.print("Broj indeksa: ");
		int brojIndeksa = sc.nextInt();
		
		System.out.print("Prosecna ocena: ");
		double prosecnaOcena = sc.nextDouble();
		
		Student x = new Student();
		
		
		
		try {
			x.setBrojIndeksa(brojIndeksa);
			x.setImePrezime(imePrezime);
			x.setProsecnaOcena(prosecnaOcena);
			
			System.out.println(x.imePrezime + "\t " + x.brojIndeksa + "\t" + x.prosecnaOcena);
			
		} catch(Throwable e) {
			e.printStackTrace();
			
			StackTraceElement stack[] = e.getStackTrace();
		}
		

	}

}
