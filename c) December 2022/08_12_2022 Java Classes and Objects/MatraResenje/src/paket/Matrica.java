package paket;

public class Matrica {
	
	private int matr[][];
	
	Matrica(int vrs, int kol) {  //konstruktor za matricu
		matr = new int[vrs][kol];
	}
	
	public int vrs() {
		return matr.length; // = osobina
	}
	
	public int kol() {
		return matr[0].length; //- duzina prve kolone sto je i duzina matrice
	}
	
	public Matrica postavi(int v, int k, int vr) {
		// if(v > 0 || k > 0)...	
		matr[v][k] = vr;
		return this;
	}
	
	public double dohvati(int v, int k) {
		return matr[v][k];
	}
	
	public String toString() {
		String s = "";
		for(int v = 0; v< matr.length; v++) {
			for(int k = 0; k < matr[0].length; k++) {
				System.out.print(matr[v][k] + " ");
			}
			System.out.println();
		}
		return s;
	}

}
