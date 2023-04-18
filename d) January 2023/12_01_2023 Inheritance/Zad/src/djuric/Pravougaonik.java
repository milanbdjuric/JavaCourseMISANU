package djuric;

public class Pravougaonik extends Oblik{
	
	public double duzina, sirina;
	
	Pravougaonik(double duzina, double sirina){
		this.duzina = duzina;
		this.sirina = sirina;
		
	}
	
	public double uzmiPovrsinu() {
		povrsina = duzina * sirina;
		return povrsina;
	}

}
