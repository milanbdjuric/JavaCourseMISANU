package djuric;

public class Mejnara {

	public static void main(String[] args) {
		
		Jabuka greni = new Jabuka("jabuka", "zelena", 55.70, 10.0, "greni smit");
		
		System.out.println("- " + greni.boja + " " + greni.naziv + " " + greni.vrsta + ":");
		
		System.out.println(greni.kolicina + " kila ovije " + greni.naziv + " kosta: " + greni.izracunajZaUplatu());

	}

}
