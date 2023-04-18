package djuric;

public class Artikal {
	
	String naziv, proizvodjac, barkod;
	double cena;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) throws IzuzetakArtikal {
		if (naziv.isBlank() || naziv.isEmpty())
			throw new IzuzetakArtikal("Naziv artikla ne sme biti null");
		this.naziv = naziv;
	}
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac(String proizvodjac) throws IzuzetakArtikal {
		if (proizvodjac.isBlank() || proizvodjac.isEmpty())
			throw new IzuzetakArtikal("Proizvodjac ne sme biti null.");
		this.proizvodjac = proizvodjac;
	}
	public String getBarkod() {
		return barkod;
	}
	public void setBarkod(String barkod) throws IzuzetakArtikal {
		if(barkod.isBlank() || barkod.isEmpty())
			throw new IzuzetakArtikal("Barkod ne sme biti null");
		this.barkod = barkod;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) throws IzuzetakArtikal {
		if (cena<=0)
			throw new IzuzetakArtikal("Cena mora biti veca od nule! ");
		this.cena = cena;
	}
	public String toString() {
		return naziv + "\t" + proizvodjac + "\t" + barkod + "\t" + cena;
	}

}
