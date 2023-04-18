package djuric;

public class Krug extends Oblik {
	
	public double poluprecnik;
	
	Krug(double poluprecnik){
		this.poluprecnik = poluprecnik;
	}
	
	public double uzmiPovrsinu() {
		povrsina =  Math.pow(poluprecnik, 2) * Math.PI;
		return povrsina;
	}

}
