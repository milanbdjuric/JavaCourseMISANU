package djuric;

public class Casopis {
	
	String naslov, izdavac;
	int brojCasopisa;
	double cena;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) throws CasopisException {
		if (naslov.isBlank() || naslov.isEmpty())
			throw new CasopisException("pa kako null kume?!?");
		this.naslov = naslov;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) throws CasopisException{
		if (izdavac.isBlank() || izdavac.isEmpty())
			throw new CasopisException("ma daj bre jedi kurac");
		this.izdavac = izdavac;
	}
	public int getBrojCasopisa() {
		return brojCasopisa;
	}
	public void setBrojCasopisa(int brojCasopisa) {
		this.brojCasopisa = brojCasopisa;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double cena) throws CasopisException {
		if (cena < 0)
			throw new CasopisException("kako bre negativno bem te usta");
		this.cena = cena;
	}
	public String toString() {
		return "Casopis [naslov=" + naslov + ", izdavac=" + izdavac + ", brojCasopisa=" + brojCasopisa + ", cena="
				+ cena + "]";
	}

		
	}


