package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		Domina d1 = new Domina(2, 4);
		Domina d2 = new Domina(3, 4);
		
		System.out.print("Domina 1: ");
		d1.ispis();
		System.out.print("Domina 2: ");
		d2.ispis();
		
		System.out.print("Iste su? ");
		
		if (d1.ista(d2)==false)
			System.out.println("Nisu.");
		else
			System.out.println("Jesu.");
		
		System.out.print("Da ih okrenemo: \n");
		d1.okreni();
		d2.okreni();
		
		System.out.print("Domina 1: ");
		d1.ispis();
		System.out.print("Domina 2: ");
		d2.ispis();
		
		
		

	}

}
