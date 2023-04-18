package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
// Kada odrednjenoj niti zelimo da dodamo prioritet prilikom izvrsavanja - pozovemo metodu setPriority() koja
// je clan klase Thread.
// void setPriority(nivo)
// min priority=1, max=10; default je 5.
// Parametrom nivo se zadaje nivo prioriteta niti za koju je metoda pozvana
// Vrednost mora biti u opsegu izmedju MIN_PRIORITY i MAX_PRIORITY (vrednosti tih konstanti su izmedju 1 i 10)
// Podrazumevana vrednost je 5, a moze se zadati preko NORM_PRIORITY (vraca na default)
		
		a.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);
		
		a.start();
		b.start();
		
		System.out.println("Kraj glavne niti. ");
	}
}
