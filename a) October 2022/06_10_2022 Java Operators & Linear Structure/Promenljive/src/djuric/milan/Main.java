package djuric.milan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 123;
		System.out.println("Vrednost promenljive b je: "+ b);
		
		short s = 12345;
		System.out.println("Vrednost promenljive s je: "+ s);
		
		int i = 123456789;
		System.out.println("Vrednost promenljive i je: "+ i);
		
		long l = 1234567891234567891L;
		System.out.println("Vrednost promenljive l je: "+ l);
		
		long ll = 1234_5678_9012_12L;
		System.out.println("Vrednost promenljive ll je: "+ ll);
		
		float f = 25.05f;
		System.out.println("Vrednost promenljive f je: "+ f);
		
		// inicijalizacija se zavrsava slovom f ili slovom F, svejedno je
		
		float F = 123.123F;
		System.out.println("Vrednost promenljive F je: "+ F);
		
		double d = 12345.12345d; // zavrsava se slovom d ili D, svejedno
		System.out.println(d);
		
		boolean bln = true;
		boolean blen = false;
		System.out.println(bln);
		System.out.println(blen);
		
		char znak = '%';
		System.out.println(znak);

	}

}
