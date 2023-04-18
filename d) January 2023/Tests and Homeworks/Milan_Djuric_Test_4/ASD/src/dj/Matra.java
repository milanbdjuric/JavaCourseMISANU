package dj;

public class Matra {
	
	private int matra[][];
	int vrsta, kolona;
	
	Matra(int vrsta, int kolona){
		this.matra = new int[vrsta][kolona];
	}

	public int getVrsta() {
		return vrsta;
	}

	public int getKolona() {
		return kolona;
	}
	


}
