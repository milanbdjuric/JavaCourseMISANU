package djuric;

public class Student {
	
	String ime, prezime, adresa;
	int brojIndeksa;
	
	Student(String ime, String prezime, String adresa, int indeks) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		
		if (indeks > 0 && indeks < 100) {
			this.brojIndeksa = indeks;
		}
		else
			throw new Izuzetak(indeks);
	}
	
	public void ispisi() {
		System.out.println(ime + "\t" + prezime + "\t" + adresa + "\t" + brojIndeksa);
	}
	

}
