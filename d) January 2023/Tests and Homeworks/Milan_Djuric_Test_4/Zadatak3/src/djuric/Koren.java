package djuric;

public class Koren {
	
	private double broj;

	public double getBroj() {
		return broj;
	}
	public void setBroj(double broj) throws KorenException{
		if (broj>=0)
			this.broj = broj;
		else
			throw new KorenException("Greska, broj je negativan!");
	}
	public double vadiKoren() {
		return Math.sqrt(broj);
	}

	
	

}
