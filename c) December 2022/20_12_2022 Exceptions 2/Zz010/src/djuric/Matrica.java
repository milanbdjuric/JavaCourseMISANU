package djuric;

public class Matrica {
	
	private double matrica[][];
	
	Matrica(int vrsta, int kolona) {
		matrica = new double[vrsta][kolona];
	}
	
	public double getVrsta() {
		return matrica.length;
	}
	
	public double getKolona() {
		return matrica[0].length;
	}
	
	public Matrica postaviElement(int vrsta, int kolona, double vrednost) {
		matrica[vrsta][kolona] = vrednost;
		return this;
	}
	
	public double dohvatiElement(int vrsta, int kolona) {
		return matrica[vrsta][kolona];
	}
	
	public void ispis() {
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				System.out.print(matrica[i][j]+ "  ");
			}
		System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}