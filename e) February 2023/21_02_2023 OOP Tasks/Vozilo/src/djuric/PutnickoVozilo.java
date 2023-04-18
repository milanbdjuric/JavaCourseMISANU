package djuric;

public class PutnickoVozilo extends Vozilo{
	
	int brojPutnika;
	double tezinaPutnika;
	
	PutnickoVozilo(double tezinaVozila, double tezinaPutnika, int brojPutnika) {
		super(tezinaVozila);
		this.tezinaPutnika = tezinaPutnika;
		this.brojPutnika = brojPutnika;
	}

	public double izracunajTezinu() {
		return tezinaPutnika*brojPutnika + getTezina();
	}

	public char vrstaVozila() {
		return 'P';
	}

	public String toString() {	
		return super.opis() + "\nukupnaTezina=" + izracunajTezinu();
	}
	
	

}
