package djuric;

public class Proizvod {
	
	String naziv, proizvodjac, rokTrajanja;
	double cena;
	
	public Proizvod(){
		naziv = "nepoznat";
		proizvodjac = "nepoznat";
		cena = 0.0;
		rokTrajanja = "29.12.2022";
	}
	
	public Proizvod(String naziv, String proizvodjac, double cena, String rokTrajanja){
		if((naziv.isBlank()||naziv.isEmpty()) || (proizvodjac.isBlank()||proizvodjac.isEmpty())) 
			System.out.println("Greska, ne sme bude null");
		else {
			this.naziv = naziv;
			this.proizvodjac = proizvodjac;
		}
		if (cena<0)
			System.out.println("Greska, ne sme bude 0 ili manje");
		else
			this.cena = cena;
		this.rokTrajanja = rokTrajanja;
	}
	

}
