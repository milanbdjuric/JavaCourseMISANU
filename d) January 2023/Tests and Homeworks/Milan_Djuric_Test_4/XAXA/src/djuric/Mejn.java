package djuric;

import java.util.Scanner;

public class Mejn {

	public static void main(String[] args) throws StudentException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj studenata: ");
		int n = sc.nextInt();
		
		Student stud[] = new Student[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Ime: ");
			String ime = sc.next();
			System.out.print("Prezime: ");
			String prezime = sc.next();
			System.out.print("Adresa: ");
			String adresa = sc.next();
			System.out.print("Broj indeksa: ");
			int brojIndeksa = sc.nextInt();
			stud[i] = new Student(ime, prezime, adresa, brojIndeksa);
		
		}
		
		for(int i=1; i<=n; i++) {
			stud[i].ispisi();
		}

	}

}
