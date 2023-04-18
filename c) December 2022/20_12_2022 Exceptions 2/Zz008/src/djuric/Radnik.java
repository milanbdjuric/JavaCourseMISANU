package djuric;

public class Radnik {
	
	private String ime;
	private double procenat, prihod;
	
	public Radnik(String ime, double procenat, double prihod) {
		this.ime = ime;
		this.procenat = procenat;
		this.prihod = prihod;
	}

	public double getPrihod() {
		return prihod;
	}
	
	public double obracunPlate() {
		return prihod*procenat/100;
	}
	
	public String opis() {
		return "IME: " + ime + "\nPLATA: " + obracunPlate();
	}
	public void stampanjeInformacija() {
		System.out.println(opis() + "\nPROCENAT: " + procenat + "\nPRIHOD: " + prihod);
	}
	
	

}
