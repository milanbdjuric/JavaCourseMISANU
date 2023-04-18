package djuric;

public class Auto {
	
	private int godiste;
	private String ime;
	
	public void setGodiste(int broj) {
		godiste = broj;
	}
	
	public int getGodiste() {
		return godiste;
	}
	
	public void setIme(String naziv) {
		ime = naziv;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void ispis() {
		System.out.println("Auto je " + getIme() + " i napravljen je " + getGodiste());
	}

}
