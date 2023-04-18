package djuric;

public class TekuciRacun {
	
	private String broj, vlasnik;
	private double iznos;
	

	
	
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) throws IzTeRa {
		if (broj.isBlank() || broj.isEmpty())
			throw new IzTeRa("NE MOZE NULL BRE");
		this.broj = broj;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) throws IzTeRa {
		if (vlasnik.isBlank() || vlasnik.isEmpty())
			throw new IzTeRa("MA KO JE VLASNIK BRE???");
		this.vlasnik = vlasnik;
	}
	public double getIznos() {
		return iznos;
	}
	public void setIznos(double iznos) throws IzTeRa {
		if (iznos > 25000)
			throw new IzTeRa("Mora bude manje od 25000");
		this.iznos = iznos;
	}
	public String toString() {
		return "TekuciRacun [broj=" + broj + ", vlasnik=" + vlasnik + ", iznos=" + iznos + "]";
	}
	
	
	

}
