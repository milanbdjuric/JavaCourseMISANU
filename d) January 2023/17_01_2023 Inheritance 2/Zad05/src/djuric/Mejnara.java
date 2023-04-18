package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		Referent Mika = new Referent(160, 100, 10000);
		Programer Zika = new Programer(160, 120, 8200, 1500);
		
		System.out.println("Mikina plata: " + Mika.izracunajPlatu());
		System.out.println("Zikina plata: " + Zika.izracunajPlatu());
		

	}

}
