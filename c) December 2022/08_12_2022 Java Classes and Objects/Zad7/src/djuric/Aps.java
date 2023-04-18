package djuric;

public class Aps {
	
	private double broj;

	public double getBroj() {
		return broj;
	}
	public void setBroj(double broj) {
		this.broj = broj;
	}
	public void stampaj() {
		System.out.println("Apsolutna vrednost broja " + broj + " je " + Math.abs(broj));
	}

}
