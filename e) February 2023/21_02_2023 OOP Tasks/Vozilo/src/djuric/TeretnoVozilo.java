package djuric;

public class TeretnoVozilo extends Vozilo{
	
	double tezinaTereta;

	TeretnoVozilo(double tezinaVozila, double tezinaTereta) {
		super(tezinaVozila);
		this.tezinaTereta = tezinaTereta;
	}

	public double izracunajTezinu() {
		return tezinaTereta + getTezina();
	}

	public char vrstaVozila() {
		return 'T';
	}

	public String toString() {
		super.opis();
		return "TeretnoVozilo [tezinaTereta=" + tezinaTereta + ", ukupnaTezina()="
				+ izracunajTezinu();
	}
}
