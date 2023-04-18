package djuric;

public class Programer extends Zaposleni{
	
	double bonus, prekovremeniRad;
	
	Programer(double brojRadnihSati, double cenaRadnogSata, double bonus, double prekovremeniRad){
		super(brojRadnihSati, cenaRadnogSata);
		this.bonus = bonus;
		this.prekovremeniRad = prekovremeniRad;
	}
	
	public double izracunajPlatu() {
		return brojRadnihSati*cenaRadnogSata+bonus+prekovremeniRad;
	}

}
