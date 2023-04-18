package djuric;

public class Student {
	
	String ime, prezime, adresa;
	int brojIndeksa;
	
	Student(String ime, String prezime, String adresa, int brojIndeksa) throws StudentException {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		
		if (brojIndeksa<0 || brojIndeksa>99) {
			throw new StudentException(brojIndeksa);
		}
		else
			this.brojIndeksa = brojIndeksa;
		
	}
	
	public void ispisi() {
		System.out.println(ime+"\n"+prezime+"\n"+adresa+"\n"+brojIndeksa);
	}

}
