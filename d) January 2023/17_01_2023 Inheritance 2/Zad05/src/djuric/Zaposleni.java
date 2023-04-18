package djuric;

public abstract class Zaposleni {
	
	double brojRadnihSati, cenaRadnogSata;
	
	Zaposleni(double brojRadnihSati, double cenaRadnogSata){
		this.brojRadnihSati = brojRadnihSati;
		this.cenaRadnogSata = cenaRadnogSata;
	}
	
	public abstract double izracunajPlatu();
	

}
