package djuric;

public class TelRacun {
	
	private String brojTelefona, vlasnik;
	private double dugovanje;
	
	public String getBrojTelefona() {
		return brojTelefona;
	}
	public void setBrojTelefona(String brojTelefona) throws IzuzetakTelRacun {
		if (brojTelefona.isBlank() || brojTelefona.isEmpty())
			throw new IzuzetakTelRacun("Kako bre null bem te usta");
		this.brojTelefona = brojTelefona;
	}
	public String getVlasnik() {
		return vlasnik;
	}
	public void setVlasnik(String vlasnik) throws IzuzetakTelRacun {
		if (vlasnik.isBlank() || vlasnik.isEmpty())
			throw new IzuzetakTelRacun("Ma ne moze da nema vlasnika bre");
		this.vlasnik = vlasnik;
	}
	public double getDugovanje() {
		return dugovanje;
	}
	public void setDugovanje(double dugovanje) throws IzuzetakTelRacun {
		if (dugovanje <= 0)
			throw new IzuzetakTelRacun("Mora bude vece od 0.");
		this.dugovanje = dugovanje;
	}
	public String toString() {
		return "TelRacun [brojTelefona=" + brojTelefona + ", vlasnik=" + vlasnik + ", dugovanje=" + dugovanje + "]";
	}
	
	

}
