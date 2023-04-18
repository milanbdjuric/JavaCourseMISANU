package djuric;

public class Kocka extends GeometrijskoTelo{
	
	double stranica;
	
	Kocka(double stranica){
		if(stranica>0)
			this.stranica = stranica;
		else
			System.out.println("Greska. Mora vrednost veca od 0! ");
	}

	public double izracunajPovrsinu() {
		return stranica*stranica*6;
	}

	public double izracunajZapreminu() {
		return Math.pow(stranica, 3);
	}
	

}
