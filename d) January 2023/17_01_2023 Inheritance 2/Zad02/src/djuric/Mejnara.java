package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		Uredjaj x = new Uredjaj("Samsung", true);
		KlimaUredjaj y = new KlimaUredjaj("Gorenje", false, 25);
		
		x.iskljuci();
		x.iskljuci();
		y.ukljuci();
		y.povecajTemperaturu();
		x.ispisi();
		y.ispisi();

	}

}
