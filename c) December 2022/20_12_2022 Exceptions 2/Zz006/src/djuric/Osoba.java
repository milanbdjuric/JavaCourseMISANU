package djuric;

public class Osoba {
	
	public String ime, datumRodjenja, adresaStanovanja;

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}

	public String getAdresaStanovanja() {
		return adresaStanovanja;
	}

	public void setAdresaStanovanja(String adresaStanovanja) {
		this.adresaStanovanja = adresaStanovanja;
	}

	public String toString() {
		return "Osoba [ime=" + ime + ", datumRodjenja=" + datumRodjenja + ", adresaStanovanja=" + adresaStanovanja
				+ "]";
	}
	
	

}
