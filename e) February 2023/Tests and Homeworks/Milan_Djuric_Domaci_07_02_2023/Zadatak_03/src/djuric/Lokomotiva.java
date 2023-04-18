package djuric;

public class Lokomotiva extends Vozilo{

	double vucnaSila;
	static final char VRSTA = 'L'; 
	
	Lokomotiva(double tezina, double vucnaSila) {
		super(tezina);
		this.vucnaSila = vucnaSila;
	}

	public String toStringLokomotiva() {
		return "Lokomotiva [vucnaSila=" + vucnaSila + ", tezina=" + tezina + "]";
	}

	public void opisVozila() {
		System.out.println(toStringLokomotiva());
		
	}



}
