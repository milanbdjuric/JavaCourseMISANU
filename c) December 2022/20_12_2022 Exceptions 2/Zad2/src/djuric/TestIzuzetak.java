package djuric;

import java.io.*;

public class TestIzuzetak {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int indeks;
		String ime, prezime, adresa;
		
		System.out.println("Koliko ima studenata? ");
		int n = Integer.parseInt(bf.readLine());
		
		Student student[] = new Student[100]; 
		try {
			for (int i = 1; i <= n; i++) {
				System.out.println("Podaci za " + i + ". studenta: ");
				System.out.print("Ime: ");
				ime = bf.readLine();
				System.out.print("Prezime: ");
				prezime = bf.readLine();
				System.out.print("Adresa: ");
				adresa = bf.readLine();
				System.out.println("Broj indeksa: ");
				indeks = Integer.parseInt(bf.readLine());
				
				student[i] = new Student(ime, prezime, adresa, indeks);
			}
			System.out.println("\nIme\tPrezime\tAdresa\tBroj indeksa");
			for (int i = 1; i<=n; i++) 
				student[i].ispisi();
			} catch(Izuzetak e) {
				System.out.println(e.getMessage());
				System.out.println("Indeks studenta za koji se desio izuzetak je: " + e.getIndeksStudenta());
			}
		
		

	}

}
