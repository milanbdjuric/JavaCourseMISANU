package djuric;

public class Mejn {									// radi nekako ali nije dobro, nije potpuno... zbog roka za predaju ga predajem ovakvog,
													// ali cu jos pokusavati da nadjem resenje. izvinjavam se, virus me lomio ovih dana.

	public static void main(String[] args) {		
		
		Teret s1 = new Sanduk(10, 1, 2, 3);
		Teret s2 = new Sanduk(11, 2, 3, 4);
		Teret b1 = new Bure(4, 2, 4);
		Teret b2 = new Bure(5, 3, 7);
		
		Teret teret1[] = new Teret[2];
		teret1[0] = s1;
		teret1[1] = b1;
		
		Teret teret2[] = new Teret[2];
		teret2[0] = s2;
		teret2[1] = b2;
		
		Vozilo vozila[] = new Vozilo[10];
		Vozilo l = new Lokomotiva(150, 1150);
		Vozilo v1 = new Vagon(30, teret1);
		Vozilo v2 = new Vagon(40, teret2);
		vozila[0] = l;
		vozila[1] = v1;
		vozila[2] = v2;
		Voz voz = new Voz(vozila);
		
		voz.opis();
	}
}
