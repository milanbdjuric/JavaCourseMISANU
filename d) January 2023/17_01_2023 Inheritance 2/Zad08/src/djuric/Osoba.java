package djuric;

public class Osoba {
	
	String ime = "N";
	String prezime = "N";
	int starost = 0;
	
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		if (ime.isBlank() || ime.isEmpty())
			System.out.println("Greska, ne sme biti null. ");
		else
			this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		if (prezime.isBlank() || prezime.isEmpty())
			System.out.println("Greska, ne sme biti null. ");
		else
			this.prezime = prezime;
	}
	public int getStarost() {
		return starost;
	}
	public void setStarost(int starost) {
		if (starost>0)
			this.starost = starost;
		else
			System.out.println("Greska, mora da bude vece od 0. ");
	}
	

}
