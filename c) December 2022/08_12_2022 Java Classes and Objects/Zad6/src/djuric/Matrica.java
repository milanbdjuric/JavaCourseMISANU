package djuric;

public class Matrica {
	
	private int vrsta, kolona;
	private double element[][] = new double[vrsta][kolona];
	
	Matrica(int vrsta, int kolona) {
		this.vrsta = vrsta;
		this.kolona = kolona;
	}
	Matrica(double element[][]) {
		this.element = element;
	}
	public void setElement(double[][] element) {
		this.element = element;
	}
	public int getVrsta() {
		return vrsta;
	}
	public int getKolona() {
		return kolona;
	}
	public double[][] getElement() {
		return element;
	}
	
	public void ispis() {
		System.out.print(this.element + " ");

		
	}
	
	
	

}


