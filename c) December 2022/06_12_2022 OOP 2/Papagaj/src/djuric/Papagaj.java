package djuric;

public class Papagaj {
	
	private String ime;
	private int godine;
	
	public void setIme(String name) {
		ime = name;
	}
	public String getIme() {
		return ime;
	}
	public void setGodine(int god) {
		godine = god;
	}
	public int getGodine() {
		return godine;
	}
	public void printung() {
		System.out.println("Ovaj ovde papagaj se zove " + getIme() + " i ima " + getGodine() + " godina.");
	}
	
	

}
