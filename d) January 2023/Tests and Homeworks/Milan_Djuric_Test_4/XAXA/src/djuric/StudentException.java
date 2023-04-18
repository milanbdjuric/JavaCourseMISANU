package djuric;

public class StudentException extends Exception {
	
	int indeksStudenta;
	
	StudentException(){
		indeksStudenta = -1;
	}
	StudentException(int indeksStudenta){
		super("Fatilji smo izuzetak, indeks je veci od 100.");
		this.indeksStudenta = indeksStudenta;
	}
	public int getIndeksStudenta() {
		return indeksStudenta;
	}

}
