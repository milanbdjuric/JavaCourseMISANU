package djuric;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Izuzetak {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Koliko studenata ima? ");
		int n = sc.nextInt();
		
		String ime, prezime, adresa;
		int index;
		
		Student student[] = new Student[100];
		
		try {
			for (int i = 1; i<=n; i++) {
				System.out.print(i + ". IME: ");
				ime = sc.nextLine();
				System.out.print(i + ". PREZIME: ");
				prezime = sc.nextLine();
				System.out.print(i + ". ADRESA: ");
				adresa = sc.nextLine();
				System.out.print(i + ". INDEKS: ");
				index = sc.nextInt();
				
				student[i] = new Student(ime, prezime, adresa, index);
			}
			for (int i = 1; i<=n; i++) {
				student[i].ispisi();
			}
		} catch (Izuzetak e) {
			System.out.println(e.getMessage());
		}
	}
}
