package djuric;

public class Kvadar extends Predmet{

	private double str1, str2, str3;
	
	Kvadar(double st, char o, double a, double b, double c) {
		super(st, o);
		str1 = a;
		str2 = b;
		str3 = c;
	}

	public double zapremina() {
		return str1*str2*str3;
	}

	public double tezina() {
		return getSpecTezina()*zapremina();
	}
	
	public String opis() {
		return super.opis() + "\nStranica a: " + str1 + "\nStranica b: " + str2 + "\nStranica c: " + str3 +
				"\nZapremina: " + zapremina() + "\nTezina: " + tezina();
	}

}
