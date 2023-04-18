package djuric;

import java.util.Arrays;

public class Vagon extends Vozilo{

	private Teret teret[] = new Teret[10];
	private double vucnaSila = 0;

	public Vagon(double tezina, Teret[] teret) {
		super(tezina);
		this.teret = teret;
	}

	static final char VRSTA = 'V';

	public String toString() {
		return "Vagon [teret=" + Arrays.toString(teret) + ", vucnaSila=" + vucnaSila + "]";
	}
	
	public void opisVozila() {
		System.out.println(toString());
		
	}




}
