package djuric;

public class Mejnara {
	
	public static<T> void stampajNiz(T[] pocetniNiz) {
		for(T element : pocetniNiz)
			System.out.printf("%s ", element);
	}

	public static void main(String[] args) {
		
		Integer[] i = {1, 2, 3, 4, 5, 6, 7};
		Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
		Character[] c = {'j', 'a', 'v', 'a'};
		
		System.out.println("Sadrzaj celobrojnog niza: ");
		stampajNiz(i);
		
		System.out.println("\nSadrzaj double niza: ");
		stampajNiz(d);
		
		System.out.println("\nSadrzaj niza karaktera: ");
		stampajNiz(c);


	}

}
