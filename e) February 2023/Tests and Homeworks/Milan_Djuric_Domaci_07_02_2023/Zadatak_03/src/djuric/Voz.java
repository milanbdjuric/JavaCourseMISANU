package djuric;

public class Voz {

	Vozilo vozila[] = new Vozilo[10];
	
	Voz(Vozilo vozila[]) {
		this.vozila = vozila;
	}
	
	Niz v = new Niz(vozila);
	
	public void opis() {
		for(int i=0; i<3; i++) {
			vozila[i].opisVozila();
		}
	}
}
