package djuric;

public class Sanduk extends Teret{

	int ID = (int)(Math.random()*1000);
	final char VRSTA = 'S';

	private double ivica1, ivica2, ivica3;
	
	Sanduk(double specTezina, double i1, double i2, double i3){
		super(specTezina);
		ivica1 = i1;
		ivica2 = i1;
		ivica3 = i3;
	}

	public double zapremina() {
		return ivica1 * ivica2 * ivica3;
	}

	public double tezina() {
		return zapremina() * specTezina;
	}
	
	public String toString() {
		return "[ID=" + ID + ", a=" + ivica1 + ", b=" + ivica2 + ", c=" + ivica3 + ", vrsta=" + VRSTA
				+ ", zapremina=" + zapremina() + ", tezina=" + tezina() + "]";
	}

}
