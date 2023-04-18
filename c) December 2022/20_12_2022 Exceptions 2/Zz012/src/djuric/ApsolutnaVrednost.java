package djuric;

public class ApsolutnaVrednost {
	
	private double broj;

	public double getBroj() {
		return broj;
	}

	public void setBroj(double broj) {
		this.broj = broj;
	}
	
	public double prikazatiApsVrednost() {
		return Math.abs(broj);
	}

}
