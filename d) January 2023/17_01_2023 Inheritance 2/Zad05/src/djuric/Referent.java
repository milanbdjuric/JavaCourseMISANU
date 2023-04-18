package djuric;

public class Referent extends Zaposleni{
	
	double bonus;
	
	Referent(double brojRadnihSati, double cenaRadnogSata, double bonus){
		super(brojRadnihSati, cenaRadnogSata);
		this.bonus = bonus;
	}
	
	public double izracunajPlatu() {
		return brojRadnihSati*cenaRadnogSata + bonus;
	}

}
