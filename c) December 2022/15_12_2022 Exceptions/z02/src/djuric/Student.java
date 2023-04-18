package djuric;

public class Student {
	
	String ime, prezime, adresa;
	int index;
	public Student(String ime, String prezime, String adresa, int index) throws Izuzetak {
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
		if (index<=1 || index >99)
			this.index = index;
		else
			throw new Izuzetak(index);
	}
	public void ispisi() {
		System.out.println(ime+"\n"+prezime+"\n"+adresa+"\n"+index);
	}
	
	

}
