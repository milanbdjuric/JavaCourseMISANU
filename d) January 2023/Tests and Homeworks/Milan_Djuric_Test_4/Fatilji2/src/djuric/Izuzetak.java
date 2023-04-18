package djuric;

public class Izuzetak extends Exception{
	
	private int indeksStudenta;
	
	public Izuzetak(){
		
	}
	
	public Izuzetak(int indeksStudenta){
		super("Izuzetak bato.");
		this.indeksStudenta = indeksStudenta;
	}
	
	public int getIndeksStudenta() {
		return indeksStudenta;
	}

}
