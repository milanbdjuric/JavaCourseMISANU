package djuric;

public class Student {
	
	String ime, prezime, adresa;
	int brojIndeksa;
	
	Student(String ime, String prezime, String adresa, int brojIndeksa) throws Izuzetak{
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		if (brojIndeksa >=1 && brojIndeksa <=99){
			this.brojIndeksa = brojIndeksa;
		}
		else
			throw new Izuzetak(brojIndeksa);
	}
	
	public void ispisi() {
		System.out.println("IME: " + ime + "\nPREZIME: " + prezime + "\nADRESA" + adresa + "\nBROJ INDEKSA: " + brojIndeksa);
	}
	
	

}
