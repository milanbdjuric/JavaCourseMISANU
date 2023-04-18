package djuric;

public class Izuzetak extends Exception{
	
	private int indeksStudenta;
	
	public Izuzetak() {
		indeksStudenta = -1;
	}
	public Izuzetak(int indeksStudenta) {
		super("Desio se izuzetak: broj indeksa je veci od 100.");
		this.indeksStudenta = indeksStudenta;
		
	}
	public int getIndeksStudenta() {
		return indeksStudenta;
	}

}
