package vedjba4;

public class Radnik {
	
	private String ime;
	private double prihod, procenat;
	
	Radnik (String ime, double procenat, double prihod) {
		this.ime = ime;
		this.procenat = procenat;
		this.prihod = prihod;
	}
	
	public String getIme() {
		return ime;
	}
	public double getPrihod() {
		return prihod;
	}
	public double getProcenat() {
		return procenat;
	}
	public double plata() {
		return prihod*procenat/100;
	}
	public String ispis() {
		return "Ime: " + ime + " / Plata: " + plata(); 
	}

}
