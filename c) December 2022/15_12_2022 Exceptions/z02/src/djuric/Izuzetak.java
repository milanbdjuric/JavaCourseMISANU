package djuric;

public class Izuzetak extends Exception {
	
	private int index;
	
	Izuzetak(){
		index=-1;
	}
	Izuzetak(int index) {
		super("Desio se izuzetak, indeks mora da bude od 1 do 99. ");
		this.index=index;
	}
	public int getIndex() {
		return index;
	}
	

}
