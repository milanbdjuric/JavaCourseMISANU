package djuric;

import java.io.*;

public class Automobil {
	
	String naziv, proizvodjac;
	int godiste;
	double potrosnja;
	
	public void unetiNazivAuta() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite naziv: ");
		naziv = br.readLine();
	}
	
	public void unetiProizvodjacaAuta() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite proizvodjaca: ");
		proizvodjac = br.readLine();
	}
	public void unetiGodisteAuta() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Unesite godiste: ");
			godiste = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.out.println("Unesite ceo broj molim!");
			unetiGodisteAuta();
		}
	}
	public void unetiPotrosnju() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Unesite potrosnju: ");
			potrosnja = Double.parseDouble(br.readLine());
		} catch (Exception e) {
			System.out.println("Unesite realan broj molim!");
			unetiPotrosnju();
		}
	}

	public String toString() {
		return "Automobil [naziv=" + naziv + ", proizvodjac=" + proizvodjac + ", godiste=" + godiste + ", potrosnja="
				+ potrosnja + "]";
	}
	

}
