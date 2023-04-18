package djuric;

public class Mejn {

	public static void main(String[] args) {
		
		Tacka t1 = new Tacka();
		Tacka t2 = new Tacka(5);
		Tacka t3 = new Tacka(2, 2);
		
		System.out.println(t1.rastojanjeOdKP()+"\n"+t2.rastojanjeOdKP()+"\n"+t3.rastojanjeOdKP());
		
		System.out.println(t1.rastojanjeIzmedju(t2)+"\n"+t1.rastojanjeIzmedju(t3)+"\n"+t2.rastojanjeIzmedju(t3));
		

	}

}
